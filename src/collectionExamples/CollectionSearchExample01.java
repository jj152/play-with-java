package collectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSearchExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l = new ArrayList<String>(); 
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		l.add("r");
		System.out.println("Initial list - " + l);
		
		/* START : Default Natural Sort Order */
		Collections.sort(l); 
		System.out.println("sorted by Default Natural Sort Order - " + l);
		System.out.println(Collections.binarySearch(l, "K")); 
		System.out.println(Collections.binarySearch(l, "P")); 
		/* END : Default Natural Sort Order */
		
		/* START : Customized Sort Order */
		Collections.sort(l, new CollectionSearchComparator());
		System.out.println("sorted by Customized Sort Order - " + l);
		System.out.println(Collections.binarySearch(l, "K",new CollectionSearchComparator())); 
		System.out.println(Collections.binarySearch(l, "P",new CollectionSearchComparator()));
		/* END : Customized Sort Order */
	}
}

class CollectionSearchComparator implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
			return o2.toString().compareTo(o1.toString());
	}

}
