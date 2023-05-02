package collectionExamples;

import java.util.PriorityQueue;

public class PriorityQueueExample01 {

	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		System.out.println(p.peek()); // returns null if the queue is empty 
		//System.out.println(p.element()); // RE : NoSuchElementException if the queue is empty 
		for(int i =0; i<=10;i++) {
			p.offer(i);
		}
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
	}

}
