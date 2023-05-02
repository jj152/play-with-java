package collectionExamples;

import java.util.Vector;

public class VectorExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		System.out.println(v.capacity());
		for(int i = 0 ;i<10 ; i++) {
			v.add(Integer.toString(i));
		}
		System.out.println(v.capacity());
		v.add("A");
		System.out.println(v.capacity());
		
		// START - with initial capacity
		System.out.println("---with initial capacity---");
		Vector<String> v1 = new Vector<String>(13); 
		System.out.println(v1.capacity());
		for(int i = 0 ;i<13 ; i++) {
			v1.add(Integer.toString(i));
		}
		System.out.println(v1.capacity());
		v1.add("A");
		System.out.println(v1.capacity());
		// END - with initial capacity
		
		// START - with initial and incremental capacity
		System.out.println("---with initial and incremental capacity---");
		Vector<String> v2 = new Vector<String>(7,11);   
		System.out.println(v2.capacity());
		for(int i = 0 ;i<7 ; i++) {
			v2.add(Integer.toString(i));
		}
		System.out.println(v2.capacity());
		v2.add("A");
		System.out.println(v2.capacity());
		// END - with initial and incremental capacity
	}

}
