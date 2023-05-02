package collectionExamples;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionReverseExample01 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>(); 
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		l.add("r");
		System.out.println("Initial list - " + l);
		Collections.reverse(l);
		System.out.println("Reversed list - " + l);
	}
}
