package streamExamples;

import java.util.*;

//Java code for Stream.min() method
//to get the minimum element of the 
//Stream according to provided comparator.
class StreamMinExample {

	// Driver code
	public static void main(String[] args) {
		
		// -- Example code 1

		// Using Stream.min() with reverse comparator to get maximum element.
		if (!Arrays.asList(1, 12, 21, -1, 10).stream().min(Comparator.reverseOrder()).isPresent()) {// IF var is empty,
																									// then output will
																									// be Optional.empty
			System.out.println("NULL");
		} else {// else value in var is printed.
			System.out.println(Arrays.asList(1, 12, 21, -1, 10).stream().min(Comparator.reverseOrder()).get());
		}

		System.out.println("-----------");
		
		// -- Example code 2

		String[] array = { "Geeks", "for", "GeeksforGeeks", "GeeksQuiz" };
		// The Comparator compares the strings based on their last characters and returns the minimum value accordingly.
		Optional<String> MIN = Arrays.stream(array)
				.min((str1, str2) -> Character.compare(str1.charAt(str1.length() - 1), str2.charAt(str2.length() - 1)));

		// If a value is present,isPresent() will return true
		if (MIN.isPresent())
			System.out.println(MIN.get());
		else
			System.out.println("-1");
		
		System.out.println("-----------");

		// -- Example code 3
		
		Integer[] arr = {};
		// java.util.NoSuchElementException: No value present
		System.out.println(Arrays.asList(arr).stream().min(Comparator.reverseOrder()).get());


	}
}
