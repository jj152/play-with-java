package collectionExamples;

import java.util.Arrays;
import java.util.TreeSet;

//Class to remove duplicates
public class TreeSetRemoveDuplicateFromArray {

	// Main driver method
	public static void main(String[] args) {
		// Input custom entries in an array
		// String type
		// Custom inputs
		String[] input = new String[] { "Hello", "hi", "Wow", "cute", "thanks", "hi", "Aww", "cute", "baby", "beloved",
				"Aww" };

		// Converting Array to String and printing it
		System.out.print("Initial String Array(Containing Duplicates) : " + (Arrays.toString(input)));

		// Creating an object of TreeSet
		TreeSet<String> dupliCheckr = new TreeSet<String>();

		// For added elements in TreeSet
		for (String element : input) {
			dupliCheckr.add(element);

		}

		// Next line
		System.out.println();

		// Print and display elements in an array
		// after removing duplicates from it.
		System.out.println("TreeSet(After Removing Duplicates) : " + dupliCheckr);

		// Next line
		System.out.println();

		// Getting size of TreeSet using size() method
		int length = dupliCheckr.size();

		// Converting above TreeSet to arrays
		// Using toArray() method
		input = dupliCheckr.toArray(input);

		// Iterating over array elements
		for (int i = length; i < input.length; i++)
			input[i] = null;

		// Print and display above string array
		// after removing duplicate entries from it
		System.out.println("Final String Array is : " + Arrays.toString(input));
	}
}
