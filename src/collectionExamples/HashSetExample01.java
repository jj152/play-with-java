package collectionExamples;

import java.util.HashSet;

public class HashSetExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> h = new HashSet<Object>();
		h.add("a");
		h.add("b");
		h.add("z");
		h.add("a");
		h.add(null);
		h.add(10);
		System.out.println(h.add("a"));
		System.out.println(h);

	}

}
