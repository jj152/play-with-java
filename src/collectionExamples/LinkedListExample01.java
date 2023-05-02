package collectionExamples;

import java.util.LinkedList;

public class LinkedListExample01 {
	
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("aa");
		ll.add(null);
		ll.add("a1");
		System.out.println(ll);
		ll.set(0, "wertdfyguk");
		System.out.println(ll);
		ll.add(0, "recrtyfvu");
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.addFirst("erwxrctvyubin");
		System.out.println(ll);
	}


}
