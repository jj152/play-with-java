package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {
	public static void main(String[] args) {

		List<String> list = new CopyOnWriteArrayList<>(); // fail-safe
		list.add("a");
		list.add("b");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			list.add("c");
		}
		
		list = new ArrayList<String>(); // fail-fast
		list.add("x");
		list.add("y");
		
		iterator = list.iterator();
		
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			list.add("z");
		}
	}

}
