package collectionExamples;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet t = new TreeSet(new ReverseIntComparator()); // prior to the java 1.8 onwards way
		TreeSet<Integer> t = new TreeSet<Integer>((a,b)->b.compareTo(a)); // the java 1.8 onwards way
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}

// not needed in the java 1.8 onwards way
class ReverseIntComparator implements Comparator<Object>{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if((Integer)o1<(Integer)o2)
			return 1;
		else if((Integer)o1>(Integer)o2)
			return -1;
		else
			return 0;
	}	
}

