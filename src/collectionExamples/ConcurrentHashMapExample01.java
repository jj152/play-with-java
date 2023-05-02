package collectionExamples;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample01 {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();
		m.put(1,"C");
		m.put(2,"B");
		System.out.println(m);
		m.put(1,"A");
		System.out.println(m);
		System.out.println("---putIfAbsent() method demo---");
		m.putIfAbsent(1,"C");
		System.out.println(m);
		m.putIfAbsent(3,"C");
		System.out.println(m);
		System.out.println("---remove() method demo----");
		m.remove(3,"D");
		System.out.println(m);
		m.remove(3,"C");
		System.out.println(m);
		System.out.println("---replace() method demo----");
		m.put(3,"X");
		System.out.println(m);
		m.replace(3,"P","C");
		System.out.println(m);
		m.replace(3,"X","C");
		System.out.println(m);
	}
}
