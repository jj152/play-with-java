package streamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
		List<Integer> evens = Arrays.asList(2, 4, 6);
		List<Integer> odds = Arrays.asList(3, 5, 7);
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
		
		List<Integer> mult10 = Arrays.asList(20, 30, 50);
		
		// three lists are merged into one and printed		
		List<Integer> numbers = Stream.of(evens, odds, primes) // three lists are merged into one
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());		
		System.out.println("flattend list of 3 items : " + numbers); // print the merged one
		
		// the previously merged list is merged with another list
		System.out.println("flattend list of 4 items : "
				+ Stream.of(numbers,mult10)
					.flatMap(e -> e.stream())
					.collect(Collectors.toList())
			);

	}

}
