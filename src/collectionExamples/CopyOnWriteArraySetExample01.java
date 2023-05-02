package collectionExamples;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArraySet l = new CopyOnWriteArraySet();
		l.add("A");
		l.add("B");
		l.add("D");
		l.add("E");
		l.add("A");
		l.add(10);
		l.add(null);
		System.out.println(l);
	}

}
