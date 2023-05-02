package collectionExamples;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArraListExample01 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		LinkedList<String> ll = new LinkedList<String>();
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		System.out.println("-----------------");
		System.out.println(ll instanceof Serializable);
		System.out.println(ll instanceof Cloneable);
		System.out.println(ll instanceof RandomAccess);
	}

}
