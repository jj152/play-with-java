package streamExamples;

import java.util.*;
import java.util.stream.Stream;

//Java code for Stream.generate()
//to generate an infinite sequential
//unordered stream
class StreamGenerateExample {

	// Driver code
	public static void main(String[] args) {

		// using Stream.generate() method
		// to generate 8 random Double values
		Stream.generate(new Random()::nextDouble).limit(8).forEach(System.out::println);
	}
}
