package collectionExamples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < 20; i++) {
			al.add(Integer.toString(i));
		}
		System.out.println(al);
		ListIterator<String> itr = al.listIterator();
		System.out.println(itr.getClass().getName());
		while (itr.hasNext()) {
			Integer j = Integer.parseInt(itr.next());
			if (j % 6 == 0)
				itr.remove();
			else if (j % 13 == 0)
				itr.set(Integer.toString(j * j));
			else if (j % 11 == 0)
				itr.add(Integer.toString(j * j));
		}
		System.out.println(al);
		ArrayList<String> al1 = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			al1.add(Integer.toString(i+1));
		}
		ListIterator<String> itr1 = al1.listIterator();

		while (itr1.hasNext()) {
			Integer j = Integer.parseInt(itr1.next());
			if (j!=0 && j%7==0) {
				System.out.println(j);
				System.out.println(itr1.previousIndex());
				System.out.println(itr1.nextIndex());
				System.out.println(itr1.previousIndex());
				System.out.println(itr1.hasPrevious());
				System.out.println(itr1.previousIndex());
				//System.out.println(itr1.previous());
			}
		}

		System.out.println(al1);
	}
}
