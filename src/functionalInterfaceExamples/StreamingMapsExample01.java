package functionalInterfaceExamples;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamingMapsExample01 {

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
		
		Map<String, Long> words = sonnet.stream()
				.map(String::toLowerCase).
				flatMap(pattern::splitAsStream)
				.collect(
						Collectors.collectingAndThen(
								Collectors.groupingBy(
										word -> word, 
										Collectors.counting()
										)
								,
								map -> Map.copyOf(map)
							)
				);
		words.forEach((letter, count) -> System.out.println(letter + " => " + count));
		
		Map.Entry<String, Long> mostInfrequentWord = words.entrySet().stream().max(Map.Entry.comparingByValue(Comparator.reverseOrder())).orElseThrow();
		System.out.println("mostInfrequentWord = " + mostInfrequentWord);
		
		Map.Entry<String, Long> mostFrequentWord = words.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();		
		System.out.println("mostFrequentWord = " + mostFrequentWord);
		
		Map<Long, List<String>> otherWords =
                words.entrySet().stream() // Stream<Map.Entry<String, Long>>
                        .collect(
                                Collectors.groupingBy(
                                        Map.Entry::getValue,
                                        Collectors.mapping(
                                                Map.Entry::getKey,
                                                Collectors.toList()
                                        )
                                )
                        );

        Map.Entry<Long, List<String>> mostSeenWords =
                otherWords.entrySet().stream() // Stream<Map.Entry<Long, List<String>>>
                        .max(Map.Entry.comparingByKey())
                        .orElseThrow();
        System.out.println("mostSeenWords = " + mostSeenWords);		 

	}

}
