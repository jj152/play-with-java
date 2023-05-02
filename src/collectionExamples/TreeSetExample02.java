package collectionExamples;

import java.util.TreeSet;

public class TreeSetExample02 { 	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet h = new TreeSet();
		h.add(new StringBuffer("L"));
		h.add(new StringBuffer("B"));
		h.add(new StringBuffer("Z"));
		h.add(new StringBuffer("A"));
		System.out.println(h);
		System.out.println("B".compareTo("E"));
		System.out.println("B".compareTo("A"));
		System.out.println("B".compareTo("B"));
		//System.out.println("B".compareTo(null)); //NPE
	}

}
