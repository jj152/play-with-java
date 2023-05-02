package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample02 extends Thread{
	static CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<String>();
	//static ArrayList<String> l = new ArrayList<String>(); // if using ArrayList then RE : ConcurrentModificationException
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child thread updating... ");
		l.add("C");
		System.out.println("The cloned copy. Not in sync. with the original list - "+l); // printing the cloned copy used in this update. So newly added element will be printed
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		l.add("A");
		l.add("B");
		l.add("D");
		l.add("E");
		System.out.println("The original List b4 any update - "+l);
		CopyOnWriteArrayListExample02 concurrentHashMapExample02 = new CopyOnWriteArrayListExample02();
		concurrentHashMapExample02.start();
		Iterator<String> itr = l.iterator();
		while(itr.hasNext()) { // newly added element(e.g., C) is in the separate cloned copy and iterator is iterating on the original one. So newly added element won't be printed
			String i = (String) itr.next();
			System.out.println("Main thread is iterating Map and current entry is - " + i );
			//if(i.equals("E")) 
				//itr.remove();// RE : UnsupportedOperationException			
			Thread.sleep(3000);
		}
		System.out.println("The updated and synchronized(the cloned copy with the original one. Responsibility of JVM) list - " +l);
	}
}
