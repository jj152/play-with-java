package lambdaExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CascadingCollectors {

	public static void main(String[] args) {
		List<String> sonnet = Arrays.asList("From fairest creatures we desire increase,",
				"That thereby beauty's rose might never die,", "But as the riper should by time decease,",
				"His tender heir might bear his memory:", "But thou contracted to thine own bright eyes,",
				"Feed'st thy light's flame with self-substantial fuel,", "Making a famine where abundance lies,",
				"Thy self thy foe, to thy sweet self too cruel:", "Thou that art now the world's fresh ornament,",
				"And only herald to the gaudy spring,", "Within thine own bud buriest thy content,",
				"And, tender churl, mak'st waste in niggarding:", "Pity the world, or else this glutton be,",
				"To eat the world's due, by the grave and thee.");

		Map<String, Long> mp1 = sonnet.stream()
				.collect(
						Collectors.groupingBy(
									line -> line.substring(0, 1), 
									Collectors.counting()
								)
						);
		System.out.println(mp1);

		Map<String, List<Integer>> mp2 = sonnet.stream()
				.collect(
						Collectors.groupingBy(
								line -> line.substring(0, 1),
								Collectors.mapping( //downstream Collectors
										String::length, 
										Collectors.toList()
										)
								)
						);
		System.out.println(mp2);

		Map<String, Set<String>> mp3 = sonnet.stream()
				.collect(
						Collectors.groupingBy(
								line -> line.substring(0, 1),
								Collectors.mapping( //downstream Collectors
										line -> line.split(" +")[0], 
										Collectors.toSet()
										)
								)
						);
		System.out.println(mp3);

		//downstream Collectors as a variable
		Collector<String, ?, Set<String>> mapToFirstWordInASet = Collectors.mapping(
					(String line) -> line.split(" +")[0], 
					Collectors.toSet()
				);
		Map<String, Set<String>> mp4 = sonnet.stream()
				.collect(
						Collectors.groupingBy(
								line -> line.substring(0, 1),
								mapToFirstWordInASet
								)
						);
		
		System.out.println(mp4);
		
		Map<String, Long> mp5 = sonnet.stream() // stream of the lines of the sonnet
				.flatMap(line -> expand(line).stream())// stream of letters
				.collect(
						Collectors.groupingBy(
									line -> line,
									Collectors.counting()
								)
						);
		mp5.forEach((letter, count) -> System.out.println(letter + " => " + count));

	}
	
	static List<String> expand(String s) {
        return s.codePoints()
                .mapToObj(codePoint -> Character.toString((char) codePoint))
                .collect(Collectors.toList());
	}

}
