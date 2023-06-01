package collectionExamples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {

	public static void main(String[] args) {
		// Get the HashSet
		Set<String> setobj = new HashSet<>();
		setobj.add("Welcome");
		setobj.add("To");
		setobj.add("Geeks");
		setobj.add("For");
		setobj.add("Geeks");
		System.out.println("HashSet: " + setobj);

		// Convert the HashSet to TreeSet
		Set<String> hashSetToTreeSet = new TreeSet<>(setobj);
		// Convert the HashSet to TreeSet
		Set<String> hashSetToTreeSet1 = new TreeSet<>();
		hashSetToTreeSet1.addAll(setobj);
		// Convert the HashSet to TreeSet
		Set<String> hashSetToTreeSet2 = new TreeSet<>();
		for (String i : setobj)
			hashSetToTreeSet2.add(i);

		// Print the TreeSet
		System.out.println("TreeSet: " + hashSetToTreeSet);
		// Print the TreeSet
		System.out.println("TreeSet: " + hashSetToTreeSet1);
		// Print the TreeSet
		System.out.println("TreeSet: " + hashSetToTreeSet2);
	}
}
