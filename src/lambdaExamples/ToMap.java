package lambdaExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ToMap {

	public static void main(String[] args) {
		List<String> sonnet = Arrays.asList(
	            "From fairest creatures we desire increase,",
	            "That thereby beauty's rose might never die,",
	            "But as the riper should by time decease,",
	            "His tender heir might bear his memory:",
	            "But thou contracted to thine own bright eyes,",
	            "Feed'st thy light's flame with self-substantial fuel,",
	            "Making a famine where abundance lies,",
	            "Thy self thy foe, to thy sweet self too cruel:",
	            "Thou that art now the world's fresh ornament,",
	            "And only herald to the gaudy spring,",
	            "Within thine own bud buriest thy content,",
	            "And, tender churl, mak'st waste in niggarding:",
	            "Pity the world, or else this glutton be,",
	            "To eat the world's due, by the grave and thee.");
		
		Map<String, String> result = sonnet.stream()
                .collect(Collectors.
                        toMap(
                                line -> line.substring(0, 1),
                                line -> line,
                                (line1, line2) -> line1 + "\n" + line2
                        ));
		System.out.println(result);
		
		List<String> alphabet =
				Arrays.asList("alfa", "bravo", "charlie", "delta", "echo",
	                    "foxtrot", "golf", "hotel", "india", "juliet",
	                    "kilo", "lima", "mike", "november", "oscar",
	                    "papa", "quebec", "romeo", "sierra", "tango",
	                    "uniform", "victor", "whiskey", "x-ray", "yankee",
	                    "zulu");
		
		Map<Integer, List<String>> result1 =
                alphabet.stream()
                        .collect(Collectors.toMap(
                                String::length,
                                s -> new ArrayList<>(Arrays.asList(s)),
                                (a, b) -> {
                                    a.addAll(b);
                                    return a;
                                }));
		
		Map<Integer, List<String>> result2 =
                alphabet.stream()
                        .collect(Collectors.groupingBy(String::length));
		
		
		System.out.println(result1);
		
		System.out.println(result2);

	}

}
