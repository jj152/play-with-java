package collectionExamples;

import java.util.TreeMap;

public class NavigableMapExample01 {

	public static void main(String[] args) {
		TreeMap<String, String> h = new TreeMap<String, String>(); // TreeSet which uses all the methods of NavigableMap
		h.put("a", "apple");
		h.put("b", "banana");
		h.put("c", "cucumber");
		h.put("d", "date");
		h.put("e", "elephant apple");
		System.out.println(h);
		System.out.println(h.lowerKey("c"));
		System.out.println(h.floorKey("c"));
		System.out.println(h.higherKey("c"));
		System.out.println(h.ceilingKey("c"));
		System.out.println(h.descendingMap());
		System.out.println(h.pollFirstEntry());
		System.out.println(h.pollLastEntry());
		System.out.println(h);
	}

}
