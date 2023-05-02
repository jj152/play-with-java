package collectionExamples;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample01 {

	public static void main(String[] args) {
		TreeMap t = new TreeMap(new TreeMapComparator());
		t.put("XXX", 10);
		t.put("AAA", 20);
		t.put("ZZZ", 30);
		t.put("LLL", 40);
		System.out.println(t);
	}

}

class TreeMapComparator implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		return o2.toString().compareTo(o1.toString());
	}

}
