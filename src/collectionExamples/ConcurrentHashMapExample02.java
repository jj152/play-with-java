package collectionExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample02 extends Thread{	
	//static HashMap<Integer, String> m = new HashMap<Integer, String>(); // if using HashMap then RE : ConcurrentModificationException
	static ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();	// Simultaneous read and update operation
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child thread updating... ");
		m.put(4,"D");
	}
	public static void main(String[] args) throws InterruptedException {
		m.put(1,"A");
		m.put(2,"B");
		m.put(3,"C");
		ConcurrentHashMapExample02 concurrentHashMapExample02 = new ConcurrentHashMapExample02();
		concurrentHashMapExample02.start();
		Set<Integer> s1 = m.keySet();
		Iterator<Integer> itr = s1.iterator();
		while(itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println("Main thread is iterating Map and current entry is - " + i + " " + m.get(i));
			Thread.sleep(3000);
		}
		System.out.println(m);
	}
}
