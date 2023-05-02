package functionalInterfaceExamples;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamingMapsExample02 {

	public static void main(String[] args) {
		List<String> sonnet = List.of("From fairest creatures we desire increase,",
				"That thereby beauty's rose might never die,", "But as the riper should by time decease,",
				"His tender heir might bear his memory:", "But thou contracted to thine own bright eyes,",
				"Feed'st thy light's flame with self-substantial fuel,", "Making a famine where abundance lies,",
				"Thy self thy foe, to thy sweet self too cruel:", "Thou that art now the world's fresh ornament,",
				"And only herald to the gaudy spring,", "Within thine own bud buriest thy content,",
				"And, tender churl, mak'st waste in niggarding:", "Pity the world, or else this glutton be,",
				"To eat the world's due, by the grave and thee.", "to to thy");

		Pattern pattern = Pattern.compile(("[ ,':\\-]+"));

        Collector<String, ?, Map<String, Long>> collector =
                Collectors.mapping(
                        String::toLowerCase,
                        Collectors.flatMapping(
                                pattern::splitAsStream,
                                Collectors.collectingAndThen(
                                        Collectors.groupingBy(
                                                word -> word,
                                                Collectors.counting()
                                        ),
                                        Map::copyOf
                                )
                        )
                );
        Map<String, Long> words =
                sonnet.stream().collect(collector);

        //words.forEach((letter, count) -> System.out.println(letter + " => " + count));

        Collector<Map.Entry<String, Long>, ?, Map.Entry<String, Long>> collector1 =
                Collectors.collectingAndThen(
                        Collectors.maxBy(
                                Map.Entry.comparingByValue()
                        ),
                        Optional::orElseThrow
                );

        Map.Entry<String, Long> mostFrequentWord =
                words.entrySet().stream().collect(collector1);
        System.out.println("mostFrequentWord = " + mostFrequentWord);
        
        Collector<Map.Entry<String, Long>, ?, Map.Entry<String, Long>> collector2 =
                Collectors.collectingAndThen(
                        Collectors.minBy(
                                Map.Entry.comparingByValue()
                        ),
                        Optional::orElseThrow
                );

        Map.Entry<String, Long> mostInfrequentWord =
                words.entrySet().stream().collect(collector2);
        System.out.println("mostInfrequentWord = " + mostInfrequentWord);
        
        Collector<Map.Entry<String, Long>, ?, Map<Long, List<String>>> collector3 = Collectors.groupingBy(
                Map.Entry::getValue,
                Collectors.mapping(
                        Map.Entry::getKey,
                        Collectors.toList()
                )
        );

//        Map<Long, List<Map.Entry<String, Long>>> otherWords =
        Map<Long, List<String>> otherWords =
                words.entrySet().stream() // Stream<Map.Entry<String, Long>>
                        .collect(
                        		collector3
                        );
        
        otherWords.forEach((letter, count) -> System.out.println(letter + " => " + count));
        
        Collector<Map.Entry<Long, List<String>>, ?, Map.Entry<Long, List<String>>> collector4 = Collectors.collectingAndThen(
                Collectors.maxBy(
                        Map.Entry.comparingByKey()
                ),
                Optional::orElseThrow
        );

        Map.Entry<Long, List<String>> mostSeenWords =
                otherWords.entrySet().stream() // Stream<Map.Entry<Long, List<String>>>
                .collect(
                		collector4
                );
        System.out.println("mostSeenWords = " + mostSeenWords);

	}

}
