package collectionExamples;


import java.util.TreeSet;

public class TreeSetExample01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet h = new TreeSet();
		h.add("a");
		h.add("B");
		h.add("Z");
		h.add("A");
		System.out.println(h.add("a"));
		//h.add(10); // no heterogenous element
		//h.add(null); // null unaccepted(java 1.7v onwards)
		System.out.println(h);

	}

}
