package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0 ;i<10 ; i++) {
			al.add(i);
		}
		System.out.println(al);
		Iterator<Integer> itr = al.iterator();
		System.out.println(itr.getClass().getName());
		while(itr.hasNext()) {
			Integer j = (Integer) itr.next();
			if(j%2==0)
				System.out.println(j);
			else
				itr.remove();
		}
		System.out.println(al);
	}
}
