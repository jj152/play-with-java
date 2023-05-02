package collectionExamples;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample02 {
	public static void main(String[] args) {
		PriorityQueue<String> p = new PriorityQueue<String>(15, new PriorityQueueComparator());
		p.offer("F");
		p.offer("A");
		p.offer("B");
		System.out.println(p);
	}
}

class PriorityQueueComparator implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		return o2.toString().compareTo(o1.toString());
	}
}

