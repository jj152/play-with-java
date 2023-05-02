package collectionExamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", 1);
		hm.put("c", 3);
		hm.put("b", 2);
		hm.put("d", 4);
		hm.put("e", 5);
		System.out.println(hm);
		System.out.println("-------");
		hm.put("a", 11);
		System.out.println(hm);
		System.out.println("-------");
		Set<String> ks = hm.keySet();
		System.out.println(ks);
		System.out.println("-------");
		Collection<Integer> c = hm.values();
		System.out.println(c);
		System.out.println("-------");
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
		System.out.println(hm.containsKey("e"));
		System.out.println(hm.containsValue(5));
		System.out.println(hm.get("e"));
		System.out.println(hm.remove("e"));		
		System.out.println("-------");
		Set<?> es = hm.entrySet();
		System.out.println(es);
		System.out.println("-------");
		Iterator<?> it = es.iterator();
		while(it.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<String, Integer> m1 = (Map.Entry<String, Integer>)it.next();
			System.out.println(m1.getKey() + " - " + m1.getValue());
			if(m1.getKey().equals("d")) {
				m1.setValue(101);
			}
		}
		System.out.println(hm);
	}
}
