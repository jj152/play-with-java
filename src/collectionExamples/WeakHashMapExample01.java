package collectionExamples;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapExample01 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("---HashMap Example---");
		MyTemp t = new MyTemp();
		HashMap<MyTemp, String> h = new HashMap<MyTemp, String>();
		h.put(t,"abc");
		System.out.println(h);
		t = null;
		System.gc(); // Though the reference to MyTemp object is null then also GC won't be called as it is HashMap
		Thread.sleep(1000);
		System.out.println(h);		
		Thread.sleep(1000);
		System.out.println("---WeakHashMap Example---");		
		MyTemp t1 = new MyTemp();
		WeakHashMap<MyTemp, String> h1 = new WeakHashMap<MyTemp, String>();
		h1.put(t1,"abc");
		System.out.println(h1);
		t1 = null;
		Thread.sleep(1000);
		System.gc(); // GC will be called once the reference to MyTemp object is null as it is WeakHashMap
		Thread.sleep(1000);
		System.out.println(h1);		
	}
}

class MyTemp{
	public String toString() {
		return "temp";
	}
	public void finalize() {
		System.out.println("finalize called");
	}
}