package collectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSortExample01 {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>(); 
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		l.add("r");
		//l.add(10); // RE : ClassCastException
		//l.add(null); // RE : NullPointerException
		System.out.println(l);
		//Collections.sort(l); // D.N.S.O
		Collections.sort(l, new SortArrayListComparator()); // C.S.O
		System.out.println(l);

	}

}

class SortArrayListComparator implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
			return o2.toString().compareTo(o1.toString());
	}

}
