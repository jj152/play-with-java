package collectionExamples;

import java.util.Arrays;
import java.util.LinkedList;

//Java program to convert LinkedList to Array
public class LinkedListToArray {	
	// Function to convert LinkedList to Array
	public static <T> Object[] convertListToArray(LinkedList<T> lt) {		
		// Converting LinkedList to Array
		Object[] objArr = lt.toArray();
		return objArr;
	}
	public static void main(String[] args) {
		// Creating linked list
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("H");
		linkedList.add("e");
		linkedList.add("l");
		linkedList.add("l");
		linkedList.add("o");
		
		// Print the LinkedList
		System.out.println("Linked list: " + linkedList);
		
		// Converting LinkedList to Object Array - prior to java 8
		Object[] objArr = convertListToArray(linkedList);
		
		// Convert Object[] to String[]
		String[] array = Arrays.copyOf(objArr, objArr.length, String[].class);
		
		// Print the String Array
		System.out.println("Array prior java 8: " + Arrays.toString(array));
		
		// Converting LinkedList to Object Array - java 8
		Object[] objArr1 = linkedList.stream().toArray();
		
		// Convert Object[] to String[]
		String[] array1 = Arrays.copyOf(objArr1, objArr1.length, String[].class);
		
		// Print the String Array
		System.out.println("Array from java 8: " + Arrays.toString(array1));
	}
}
