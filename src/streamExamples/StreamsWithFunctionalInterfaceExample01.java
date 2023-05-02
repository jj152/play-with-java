package streamExamples;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class StreamsWithFunctionalInterfaceExample01 {

	public static void main(String[] args) {

		Integer[] intarray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> l1 = new ArrayList<>(Arrays.asList(intarray));
		System.out.println(l1);

		List<String> words = new ArrayList<>();
		words.add("coffee");
		words.add("bread");
		words.add("pineapple");
		words.add("milk");
		words.add("pasta");
		System.out.println(words);

		Function<Integer, Integer> doubleFunc = (x) -> x * 2;
		List<Integer> doubledList = l1.stream().map(doubleFunc).collect(Collectors.toList());
		System.out.println(doubledList);
		doubledList = l1.stream().map((x) -> x * 3).collect(Collectors.toList());
		System.out.println(doubledList);

		Predicate<String> longerThan5 = (x) -> x.length() > 5;
		List<String> longWords = words.stream().filter(longerThan5).collect(Collectors.toList());
		System.out.println(longWords);
		longWords = words.stream().filter((x) -> x.length() > 7).collect(Collectors.toList());
		System.out.println(longWords);

		Function<Integer, Predicate<String>> lengthSpecifier = (specifiedLength) -> {
			return (str) -> str.length() > specifiedLength;
		};
		Predicate<String> isLongerThanSpcifiedLength = lengthSpecifier.apply(4);
		longWords = words.stream().filter(isLongerThanSpcifiedLength).collect(Collectors.toList());
		System.out.println(longWords);
	}
}
