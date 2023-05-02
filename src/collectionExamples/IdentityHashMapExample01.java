package collectionExamples;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> h = new HashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		h.put(i1, "ab");
		h.put(i2, "abc"); // jvm uses .equals() method to compare the keys. The content is same for i1 and i2. So equals method returns true. So the value gets replaced
		System.out.println(h);
		IdentityHashMap<Integer, String> h1 = new IdentityHashMap();
		h1.put(i1, "ab");
		h1.put(i2, "abc");// jvm uses == operator to compare the keys. The reference/address is not same for i1 and i2. So returns false. So the value gets added
		System.out.println(h1);

	}

}
