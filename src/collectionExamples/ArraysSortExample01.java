package collectionExamples;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,6,0,3,20,100};
		System.out.println("primitive array b4 sorting - ");
		for(int i :a) {
			System.out.println(i);
		}
		Arrays.sort(a);
		System.out.println("primitive array after default natural sorting - ");
		for(int i :a) {
			System.out.println(i);
		}
		
		String[] s = {"A","Z","B"};
		System.out.println("Object array b4 sorting - ");
		for(String i :s) {
			System.out.println(i);
		}
		Arrays.sort(s);
		System.out.println("Object array after default natural sorting - ");
		for(String i :s) {
			System.out.println(i);
		}
		
		Arrays.sort(s, new SortArraysComparator());
		System.out.println("Object array after customized sorting - ");
		for(String i :s) {
			System.out.println(i);
		}
	}

}

class SortArraysComparator implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
			return o2.toString().compareTo(o1.toString());
	}
}
