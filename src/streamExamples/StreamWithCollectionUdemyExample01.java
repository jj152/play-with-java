package streamExamples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamWithCollectionUdemyExample01 {
	public static void main(String[] args) {
		/*
		 * int i = 2000; List<Integer> list = new ArrayList<>(); list.add(1000);
		 * list.add(i); list.add(3000); list.forEach(i1 -> System.out.println(i1));
		 */
		// 3
		/*
		 * String [] cities = {"Seoul", "Tokyo", "Paris", "London", "Hong Kong",
		 * "Singapore"}; Arrays.stream(cities).sorted((s1,s2) -> s2.compareTo(s1))
		 * .forEach(System.out::println);
		 */
		// 4
		/*
		 * List<String> list = Arrays.asList("A", "A", "b", "B", "c", "c");
		 * list.stream().distinct().forEach(System.out::print);
		 */
		// 5
		/*
		 * List<StringBuilder> list = new ArrayList<>(); list.add(new
		 * StringBuilder("abc")); list.add(new StringBuilder("xyz"));
		 * list.stream().map(x -> x.reverse()); System.out.println(list);
		 */
		// 7
		/*
		 * List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		 * list.removeIf(i -> i % 2 == 1); System.out.println(list);
		 */
		/*
		 * Stream<String> stream = Stream.of("java", "python", "c", "c++"); List<String>
		 * list = stream.sorted().collect(Collectors.toList());
		 * System.out.println(list);
		 */
		/*
		 * Stream<String> stream = Stream.of("java", "python", "c", "c++", "java",
		 * "python"); Set<String> set = stream.collect(Collectors.toSet());
		 * System.out.println(set.size());
		 */
		/*
		 * Stream<String> stream = Stream.of("java", "python", "c", "c++", "java",
		 * "python"); Set<String> set =
		 * stream.collect(Collectors.toCollection(TreeSet::new));
		 * System.out.println(set);
		 */
		// 14
		/*
		 * IntStream.rangeClosed(1, 10).parallel() .forEach(System.out::println);
		 */
		/*
		 * IntStream.rangeClosed(1, 10).parallel() .forEachOrdered(System.out::println);
		 */
		/*
		 * int res = IntStream.rangeClosed(1, 1000).parallel() .filter( i -> i >
		 * 50).findFirst().getAsInt(); System.out.println(res);
		 */
		// 20
		/*
		 * List<String> list = Arrays.asList("A", "E", "I", "O", "U");
		 * System.out.println(list.parallelStream().isParallel());
		 */
		/*
		 * IntStream stream = IntStream.rangeClosed(2, 5);
		 * System.out.println(stream.parallel().reduce((x, y) -> x + y).getAsInt());
		 */
		/*
		 * List<Integer> list = Collections.synchronizedList(new ArrayList<>());
		 * IntStream stream = IntStream.rangeClosed(1, 7); stream.parallel().map(x -> {
		 * list.add(x); //Line 13 return x; }).forEach(System.out::print); //Line 15
		 * System.out.println(); list.forEach(System.out::print); //Line 17
		 */
		/*
		 * List<Integer> list = Collections.synchronizedList(new ArrayList<>());
		 * IntStream stream = IntStream.rangeClosed(1, 7); stream.parallel().map(x -> {
		 * list.add(x); //Line 13 return x; }).forEachOrdered(System.out::print); //Line
		 * 15 System.out.println(); list.forEach(System.out::print); //Line 17
		 */

		String s1 = Arrays.asList("A", "E", "I", "O", "U").stream().reduce("_", String::concat);
		String s2 = Arrays.asList("A", "E", "I", "O", "U").parallelStream().reduce("_", String::concat);
		System.out.println(s1.equals(s2));

		/*
		 * String s1 = Arrays.asList("A", "E", "I", "O", "U").stream() .reduce("",
		 * String::concat); String s2 = Arrays.asList("A", "E", "I", "O",
		 * "U").parallelStream() .reduce("", String::concat);
		 * System.out.println(s1.equals(s2));
		 */
		/*
		 * String str1 = Stream.iterate(1, i -> i + 1).limit(10) .reduce("", (i, s) -> i
		 * + s, (s1, s2) -> s1 + s2); String str2 = Stream.iterate(1, i -> i +
		 * 1).limit(10).parallel() .reduce("", (i, s) -> i + s, (s1, s2) -> s1 + s2);
		 * System.out.println(str1.equals(str2));
		 */
		/*
		 * Stream<String> stream = Stream.of("J", "A", "V", "A"); String text =
		 * stream.parallel().reduce(String::concat).get(); System.out.println(text);
		 */

	}
}
