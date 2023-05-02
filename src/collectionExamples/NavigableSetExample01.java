package collectionExamples;

import java.util.TreeSet;

public class NavigableSetExample01 {

	public static void main(String[] args) {
		TreeSet<Integer> h = new TreeSet<Integer>(); // TreeSet which uses all the methods of NavigableSet 
		h.add(1000);
		h.add(2000);
		h.add(3000);
		h.add(4000);
		h.add(5000);
		System.out.println(h);
		System.out.println(h.lower(3000));
		System.out.println(h.floor(3000));
		System.out.println(h.higher(3000));
		System.out.println(h.ceiling(3000));
		System.out.println(h.descendingSet());
		System.out.println(h.pollFirst());
		System.out.println(h.pollLast());
		System.out.println(h);
	}

}
