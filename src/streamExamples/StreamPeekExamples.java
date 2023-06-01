package streamExamples;

import java.util.*;
import java.util.stream.IntStream;

//Java Program to Illustrate peek() Method
//of Stream class With Terminal Operation Count
class StreamPeekExamples {

	// Main driver method
	public static void main(String[] args) {

		// Using peek without any terminal
		// operation does nothing
		Arrays.asList(0, 2, 4, 6, 8, 10).stream().peek(System.out::println);
		System.out.println("---------");
		
		// Using peek with count() method,Method
		// which is a terminal operation
		Arrays.asList(0, 2, 4, 6, 8, 10).stream().peek(System.out::println).count();
		System.out.println("---------");
		
		int sum = IntStream.range(2, 10).peek(System.out::println).sum();
		System.out.println("sum - " + sum);
		
		long count = IntStream.range(2, 10).peek(System.out::println).count();
		System.out.println("count - " + count);
	}
}
