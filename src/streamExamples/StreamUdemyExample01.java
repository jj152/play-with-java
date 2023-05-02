package streamExamples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.function.Predicate;
import java.util.Random;

public class StreamUdemyExample01 {
    public static void main(String[] args) {
		/*
		 * Stream<StringBuilder> stream = Stream.of(); stream.map(s ->
		 * s.reverse()).forEach(System.out::println);
		 */
		/* Stream.of().map(s -> s.reverse()).forEach(System.out::println); */
		/*
		 * Stream.of(true, false, true).map(b -> b.toString()
		 * .toUpperCase()).peek(System.out::println);
		 */
		/*
		 * IntStream stream = "OCP".chars(); stream.forEach(c ->
		 * System.out.print((char)c)); System.out.println(stream.count()); //Line 9
		 */   
		/*
		 * Stream.of(true, false, true).map(b -> b.toString()
		 * .toUpperCase()).peek(System.out::println).count();
		 * 
		 */
		/*
		 * List<String> list = new ArrayList<>();
		 * System.out.println(list.stream().anyMatch(s -> s.length() > 0));
		 * System.out.println(list.stream().allMatch(s -> s.length() > 0));
		 * System.out.println(list.stream().noneMatch(s -> s.length() > 0));
		 */
		/*
		 * Stream<Double> stream = Stream.generate(() -> new Double("1.0")).limit(10);
		 * System.out.println(stream.filter(d -> d > 2).allMatch(d -> d == 2));
		 */
		/*
		 * Stream<Integer> stream = Stream.iterate(1, i -> i + 1);
		 * System.out.println(stream.anyMatch(i -> i > 1));
		 */
		/*
		 * int ref = 10; List<Integer> list = new ArrayList<>();
		 * list.stream().anyMatch(i -> { System.out.println("HELLO"); return i > ref;
		 * });
		 */
		/*
		 * int ref = 10; List<Integer> list = new ArrayList<>();
		 * list.stream().anyMatch(i -> { System.out.println("HELLO"); return i > ++ref;
		 * });
		 */
		/*
		 * Optional<String> optional = Stream.of("red", "green", "blue", "yellow")
		 * .sorted().findFirst(); System.out.println(optional.get());
		 */
		/*
		 * Stream<Double> stream = Stream.generate(() -> new Double("1.0"));
		 * System.out.println(stream.sorted().findFirst());
		 */
		/*
		 * Map<Integer, String> map = new HashMap<>(); map.put(1, "ONE"); map.put(2,
		 * "TWO"); map.put(3, "THREE");
		 * 
		 * System.out.println(map.stream().count());
		 */
		/*
		 * List<String> list = new ArrayList<>(Arrays.asList("Z", "Y", "X"));
		 * list.stream().sorted().findFirst().get(); System.out.println(list.get(2));
		 */
		/*
		 * Optional<Integer> optional = Stream.of(10).findFirst();
		 * System.out.println(optional);
		 */
		/*
		 * Optional<Integer> optional = Optional.of(null); System.out.println(optional);
		 */
		/*18
		 * Optional<Integer> optional = Optional.ofNullable(null);
		 * System.out.println(optional);
		 */
		/*19
		 * Stream<Number> stream = Stream.of(); Optional<Number> optional =
		 * stream.findFirst(); System.out.println(optional.orElse(-1));
		 */
		/* 20
		 * Optional<Integer> optional = Optional.of(null); //Line 8
		 * System.out.println(optional.orElse(-11)); //Line 9
		 */	
		/* 21
		 * Stream<String> stream = Stream.of("and", "Or", "not", "Equals", "unary",
		 * "binary"); Optional<String> optional =
		 * stream.filter(((Predicate<String>)StreamUdemyExample01::isFirstCharVowel)
		 * .negate()).findFirst(); System.out.println(optional.get()); }
		 * 
		 * private static boolean isFirstCharVowel(String str) { str = str.substring(0,
		 * 1).toUpperCase(); switch(str) { case "A": case "E": case "I": case "O": case
		 * "U": return true; } return false;
		 */
		/* System.out.println(Stream.of(10, 0, -10).sorted().findAny().orElse(-1)); */
		/*
		 * Stream<LocalDate> stream = Stream.of(LocalDate.of(2018, 1, 1),
		 * LocalDate.of(2018, 1, 1)); Optional<LocalDate> optional =
		 * stream.distinct().findAny();
		 * 
		 * System.out.println(optional.isPresent() + " : " + optional.get());
		 */
		/*
		 * OptionalLong optional = OptionalLong.empty();
		 * System.out.println(optional.isPresent() + " : " + optional.getAsLong());
		 */
		/*
		 * OptionalDouble optional = OptionalDouble.empty();
		 * System.out.println(optional.orElseThrow(MyException::new));
		 */
    	/*OptionalInt optional = OptionalInt.empty();
        System.out.println(optional.orElseThrow(MyException::new));*/
		/* OptionalBoolean optional = */
		/*
		 * Stream<String> stream = Stream.of("a", "as", "an", "and"); Optional<String>
		 * first = stream.findFirst(); if(first.ifPresent()) {
		 * System.out.println(first.get()); }
		 */
		/*
		 * IntStream stream = IntStream.generate(() -> new
		 * Random().nextInt(100)).limit(5); stream.filter(i -> i > 0 && i <
		 * 10).findFirst().ifPresent(System.out::println);
		 */
		/*
		 * IntStream stream = new Random().ints(1, 7).limit(2);
		 * System.out.println(stream.max().getAsInt());
		 */
		/* IntStream.range(1, 10).forEach(System.out::print); */
		/* LongStream.iterate(0, i -> i + 2).limit(5).forEach(System.out::print); */
		
    	/* 33 */
		/*
		 * int sum = IntStream.rangeClosed(1,3).map(i -> i * i).map(i -> i * i).sum();
		 * System.out.println(sum);
		 */
		/*
		 * Stream<Integer> stream = Arrays.asList(1,2,3,4,5).stream();
		 * System.out.println(stream.sum());
		 */
		/*
		 * Stream<Double> stream = Stream.of(9.8, 2.3, -3.0);
		 * System.out.println(stream.min());
		 */
		/*
		 * LongStream stream = LongStream.empty(); System.out.println(stream.average());
		 */
		/*
		 * Stream<Integer> stream = Arrays.asList(1,2,3,4,5).stream();
		 * System.out.println(stream.mapToInt(i -> i).average().getAsInt());
		 */
		/*
		 * IntStream stream = IntStream.rangeClosed(1, 20).filter(i -> i % 2 == 0);
		 * System.out.println(stream.summaryStatistics());
		 */
		/*
		 * String text = "I am going to pass OCP exam in first attempt"; Stream<String>
		 * stream = Arrays.stream(text.split(",")); IntSummaryStatistics stat =
		 * stream.map(s -> s.length()).summaryStatistics();
		 * System.out.println(stat.getCount());
		 */
		/*
		 * int res = 1; IntStream stream = IntStream.rangeClosed(1, 5);
		 * System.out.println(stream.reduce(1, (i, j) -> i * j));
		 * System.out.println(stream.reduce(res, (i, j) -> i * j));
		 */
		/*
		 * int res = 1; IntStream stream = IntStream.rangeClosed(1, 4);
		 * System.out.println(stream.reduce(res++, (i, j) -> i * j));
		 */
		/*
		 * Stream<String> stream = Arrays.asList("One", "Two", "Three").stream();
		 * System.out.println(stream.reduce(null, (s1, s2) -> s1 + s2));
		 */
		/*
		 * Stream<Double> stream = Arrays.asList(1.8, 2.2, 3.5).stream();
		 * System.out.println(stream.reduce(0.0, (d1, d2) -> d1 + d2));
		 * System.out.println(stream.reduce(0.0, Double::sum));
		 */
		/*
		 * Stream<Double> stream = Arrays.asList(1.8, 2.2, 3.5).stream();
		 * System.out.println(stream.reduce((d1, d2) -> d1 + d2)); //Line 9
		 */	
		/*
		 * String [] names = {"Peter", "bonita", "John"};
		 * Arrays.stream(names).sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
		 * .forEach(System.out::println);
		 */
		/*
		 * Comparator<Integer> comp = (i1, i2) -> i2.compareTo(i1); Stream<Integer>
		 * stream = Stream.of(55, 23, -9, 8, 42);
		 * stream.sorted(comp.reversed()).forEach(i -> System.out.print(i + " "));
		 */
		/*
		 * Stream<String> stream = Stream.of("d", "cc", "bbb", "aaaa");
		 * stream.sorted((s1,s2) ->
		 * s1.length()-s2.length()).forEach(System.out::println);
		 */
		/*
		 * Stream<String> stream = Stream.of("d", "a", "mm", "bb", "zzz", "www");
		 * Comparator<String> lengthComp = (s1, s2) -> s1.length() - s2.length();
		 * stream.sorted(lengthComp.thenComparing(String::compareTo)).forEach(System.out
		 * ::println);
		 */
		/*
		 * String [] arr1 = {"Virat", "Rohit", "Shikhar", "Dhoni"}; String [] arr2 =
		 * {"Bumrah", "Pandya", "Sami"}; String [] arr3 = {}; Stream<String[]> stream =
		 * Stream.of(arr1, arr2, arr3); stream.flatMap(s ->
		 * Arrays.stream(s)).sorted().forEach(s -> System.out.print(s + " "));
		 */
		/*
		 * Stream<String> stream = Stream.of("ocp"); stream.flatMapToInt(s ->
		 * s.chars()).forEach(i -> System.out.print((char)i));
		 */
	}
}

class MyException extends RuntimeException{}
