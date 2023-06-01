package collectionExamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//Java program to demonstrate difference between HashSet, LinkedHashSet and TreeSet according to insertion order and insertion time
class SetComparison {

	public static void main(String args[]) {
		insertionOrder();
		insertionDeletionTime();
	}

	// Function show insertion order of LinkedHashSet, TreeSet and HashSet
	private static void insertionOrder() {
		LinkedHashSet<String> geekLinkSet = new LinkedHashSet<>();
		TreeSet<String> geekTreeSet = new TreeSet<>();
		HashSet<String> geekHashSet = new HashSet<String>();
		// Add three object in HashSet, LinkedHashSet and TreeSet
		for (String str : Arrays.asList("Geek2", "Geek1", "Geek3", "Geek1")) {
			geekLinkSet.add(str);
			geekTreeSet.add(str);
			geekHashSet.add(str);
		}
		// should not be sorted order HashSet doesn't store element in sorted order
		System.out.println("Insertion Order of objects in HashSet :" + geekHashSet);
		// insertion order or elements LinkedHashSet stores elements as insertion
		System.out.println("Insertion Order of objects in LinkedHashSet :" + geekLinkSet);
		// should be sorted order TreeSet stores element in sorted order
		System.out.println("Insertion Order of objects in TreeSet :" + geekTreeSet);
	}

	// Function calculate insertion and deletion time of 1000 objects of LinkedHashSet, TreeSet and HashSet
	private static void insertionDeletionTime() {
		HashSet<Integer> numbersHS = new HashSet<>();
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			numbersHS.add(i);
		}
		long endTime = System.nanoTime();
		System.out.println("Total time to insert 1000 elements in HashSet in nanoseconds: " + (endTime - startTime));

		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			numbersHS.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("Total time to Delete 1000 elements in HashSet in nanoseconds: " + (endTime - startTime));

		LinkedHashSet<Integer> numbersLLS = new LinkedHashSet<>();
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			numbersLLS.add(i);
		}
		endTime = System.nanoTime();
		System.out.println("Total time to insert 1000 elements in LinkedHashSet nanoseconds: " + (endTime - startTime));

		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			numbersLLS.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println(
				"Total time to Deletion 1000 elements in LinkedHashSet in nanoseconds: " + (endTime - startTime));

		TreeSet<Integer> numbersTS = new TreeSet<>();
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			numbersTS.add(i);
		}
		endTime = System.nanoTime();
		System.out.println("Total time to insert 1000 elements in TreeSet in nanoseconds: " + (endTime - startTime));

		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			numbersTS.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("Total time to Deletion 1000 elements in TreeSet in nanoseconds: " + (endTime - startTime));

	}
}
