package streamExamples;

import java.util.*;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMiscExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> optional = Stream.of("red", "green", "blue", "yellow").sorted().findFirst();
		System.out.println(optional.get());

		// Stream<Double> stream = Stream.generate(() -> new Double("1.0"));
		// System.out.println(stream.sorted().findFirst());

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "ONE");
		map.put(2, "TWO");
		map.put(3, "THREE");

		// There is no stream() method available in Map interface and hence map.stream()
		// causes compilation error.
		// System.out.println(map.stream().count());
		// below code prints all the key value pairs available in the map
		map.entrySet().stream().forEach(x -> System.out.println(x.getKey() + ":" + x.getValue()));

		List<String> list = new ArrayList<>(Arrays.asList("Z", "Y", "X"));
		list.stream().sorted().findFirst().get();
		System.out.println(list.get(2)); // list and stream are not connected, which means operations done on stream
											// doesn't affect the source, in this case list

		/*
		 * Optional<Integer> optional1 = Optional.of(null);
		 * //java.lang.NullPointerException System.out.println(optional1);
		 */

		Optional<Integer> optional2 = Optional.ofNullable(null);
		System.out.println(optional2);

		Stream<Number> stream = Stream.of();
		Optional<Number> optional3 = stream.findFirst();
		System.out.println(optional3.orElse(-1));

		/*
		 * Optional<Integer> optional4 = Optional.of(null);
		 * //java.lang.NullPointerException System.out.println(optional4.orElse(-1));
		 */

		Stream<String> stream1 = Stream.of("and", "Or", "not", "Equals", "unary", "binary");
		System.out.println(
				stream1.filter(((Predicate<String>) StreamMiscExample::isFirstCharVowel).negate()).findFirst().get());

		/*
		 * OptionalLong optional5 = OptionalLong.empty();
		 * System.out.println(optional5.isPresent() + " : " + optional5.getAsLong());
		 * //java.util.NoSuchElementException: No value present
		 */

		IntStream stream2 = IntStream.generate(() -> new Random().nextInt(100)).limit(5);
		stream2.filter(i -> i > 0 && i < 10).findAny().ifPresent(System.out::println);

		Stream<Double> stream3 = Stream.of(9.8, 2.3, -3.0);
		// System.out.println(stream3.min()); //There is no min() method available in
		// generic stream interface, Stream<T> and hence, 'stream.min()' causes
		// compilation error.
		System.out.println(stream3.min(Double::compareTo));

		Stream<Integer> stream4 = Arrays.asList(1, 2, 3, 4, 5).stream();
		// System.out.println(stream4.mapToInt(i -> i).average().getAsInt());
		System.out.println(stream4.mapToInt(i -> i).average().getAsDouble()); // OptionalDouble has getAsDouble() method
																				// and not getAsInt() method.
		
		IntStream stream5 = IntStream.rangeClosed(1, 20).filter(i -> i % 2 == 0);
        System.out.println(stream5.summaryStatistics());
        
        String text = "I am going to pass OCP exam in first attempt";
        Stream<String> stream6 = Arrays.stream(text.split(" "));
        /*IntSummaryStatistics stat = stream6.map(s -> s.length()).summaryStatistics();*/
        IntSummaryStatistics stat = stream6.mapToInt(s -> s.length()).summaryStatistics();
        System.out.println(stat.getMax());
        
        IntStream stream7 = IntStream.rangeClosed(1, 5);
        System.out.println(stream7.reduce(1,(i,j)-> i*j));
        
        List<String> stringList = new ArrayList<>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");

        Stream<String> stream8 = stringList.stream();

        stream8.forEach(System.out::println);
        
        Collection<String> collection = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
        Stream<String> stream9 = collection.stream();
        stream9.forEach(System.out::println);

        List<String> list2 = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
        Stream<String> stream10 = list2.stream();
        stream10.forEach(System.out::println);

        Set<String> set = new HashSet<>(list2);
        Stream<String> stream11 = set.stream();
        stream11.forEach(System.out::println);

	}

	private static boolean isFirstCharVowel(String str) {
		str = str.substring(0, 1).toUpperCase();
		switch (str) {
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
			return true;
		}
		return false;
	}

}
