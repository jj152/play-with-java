package functionalInterfaceExamples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DownStreamCollectorExample01 {

	public static void main(String[] args) {
		List<String> sonnet = List.of("From fairest creatures we desire increase,",
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
		// downstream collector - Collectors.counting() -> count of no of elements under any key
		Map<String, Long> result = sonnet.stream()
				.collect(Collectors.groupingBy(line -> line.substring(0, 1), Collectors.counting()));
		System.out.println("result - "+result);

		// downstream collector - Collectors.mapping() -> word counts of each element under any key
		Map<String, List<Integer>> result1 = sonnet.stream().collect(Collectors.groupingBy(line -> line.substring(0, 1),
				Collectors.mapping(line -> line.length(), Collectors.toList())));
		System.out.println("result1 - "+result1);

		// same as previous
		Collector<String, ?, List<Integer>> wordCountOfEachElemenet = Collectors.mapping((String line) -> line.length(),Collectors.toList());
		Map<String, List<Integer>> result2 = sonnet.stream()
				.collect(Collectors.groupingBy(line -> line.substring(0, 1), wordCountOfEachElemenet));
		System.out.println("result2 - "+result2);
		
		// same as previous
		var wordCountOfEachElemenet1 = Collectors.mapping((String line) -> line.length(),Collectors.toList());
		Map<String, List<Integer>> result3 = sonnet.stream()
				.collect(Collectors.groupingBy(line -> line.substring(0, 1), wordCountOfEachElemenet1));
		System.out.println("result3 - "+result3);
		
		// downstream collector - Collectors.joining() -> joins the elements under any key
		Map<String, String> result4 = sonnet.stream().collect(Collectors.groupingBy(line -> line.substring(0, 1),Collectors.joining("\n")));
		System.out.println("result4 - ");
		result4.forEach((k,v) -> System.out.println("Key = "+ k + " and Value = " + v));
		
	}

}
