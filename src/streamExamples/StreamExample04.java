package streamExamples;

import java.util.stream.IntStream;

public class StreamExample04 {

	public static void main(String[] args) {
		int sum = IntStream.of(1, 2, 3, 4, 5).peek(e -> System.out.println("Taking integer: " + e))
				.filter(n -> n % 2 == 1).peek(e -> System.out.println("Filtered integer: " + e)).map(n -> n * n)
				.peek(e -> System.out.println("Mapped integer: " + e)).reduce(0, Integer::sum);
		System.out.println("sum = " + sum);

		IntStream.rangeClosed(1, 5).map(n -> n * n).forEach(System.out::println);

	}

}
