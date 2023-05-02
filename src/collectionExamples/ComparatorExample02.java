package collectionExamples;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample02 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new StringComparator());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}

}

class StringComparator implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		int l1 = o1.toString().length();
		int l2 = o2.toString().length();
		// in ascending order
		/*
		 * if(l1<l2) return -1; else if(l1>l2) return 1; else return
		 * o1.toString().compareTo(o2.toString());
		 */

		// in descending order
		if (l1 < l2)
			return 1;
		else if (l1 > l2)
			return -1;
		else
			return o2.toString().compareTo(o1.toString());
	}

}
