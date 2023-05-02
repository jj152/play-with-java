package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveFromCollectionExample01 {
	public static void main(String[] args) {
		// java 8 onwards
		List<Integer> collect1 = Stream.of(10, 20, 30, 40).collect(Collectors.toList());
		collect1.removeIf(Integer -> Integer > 30);
		collect1.add(70);
		System.out.println(collect1);
		// java 7 way
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer mark = iterator.next();
			if (mark > 30)
				iterator.remove(); // ==> Safe to call remove() on Iterator
		}
		System.out.println(list);
	}
}
