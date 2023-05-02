package collectionExamples;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSearchExample01 {

	public static void main(String[] args) {
		
		/* START : Default Natural Sort Order on primitive type */
		int[] a = { 10, 5, 20, 11, 6, 100 };
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 14));
		/* END : Default Natural Sort Order */
		
		/* START : Default Natural Sort Order on object */
		String[] s = { "A", "Z", "B" };
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "B"));
		System.out.println(Arrays.binarySearch(s, "P"));
		/* END : Default Natural Sort Order */
		
		/* START : Customized Sort Order on object */
		Arrays.sort(s, new SearchArraysComparator());
		System.out.println(Arrays.binarySearch(s, "Z", new SearchArraysComparator()));
		System.out.println(Arrays.binarySearch(s, "P", new SearchArraysComparator()));
		/* END : Customized Sort Order */
	}

}

class SearchArraysComparator implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
			return o2.toString().compareTo(o1.toString());
	}
}
