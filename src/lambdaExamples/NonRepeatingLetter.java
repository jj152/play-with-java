package lambdaExamples;

import java.util.LinkedHashMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import static java.util.function.Function.identity;

public class NonRepeatingLetter {
	public static void main(String[] args) {
		findFirstNonRepeatingLetter("zzzzzbbbccccddehhhhiii", System.out::println);
		System.out.println("done");
	}

	private static void findFirstNonRepeatingLetter(String s, Consumer<Character> callback) {
		s.chars().mapToObj(i -> Character.valueOf((char) i))
				.collect(Collectors.groupingBy(identity(), LinkedHashMap::new, Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst().map(c -> {
					callback.accept(c);
					return c;
				});
	}
}