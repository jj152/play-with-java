package collectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionReverseExample02 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>(); 
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		l.add("r");
		System.out.println("Initial list - " + l);
		
		/* START : Default Natural Sort Order */
		Collections.sort(l);
		System.out.println("sorted in ascending order by Default Natural Sort Order - " + l);
		Collections.sort(l, Collections.reverseOrder()); // D.N.S.O
		System.out.println("sorted in descending order using reverseOrder() of Collections - " + l);
		/* END : Default Natural Sort Order */
		
		/* START : Customized Sort Order */
		Collections.sort(l, new CollectionSearchComparator());
		System.out.println("sorted in descending order by Customized Sort Order - " + l);
		Collections.sort(l, Collections.reverseOrder(new CollectionSearchComparator()));
		System.out.println("sorted in ascending order using reverseOrder() of Collections - " + l);
		/* END : Customized Sort Order */
	}
}

class CollectionReverseComparator implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
			return o2.toString().compareTo(o1.toString());
	}
}
