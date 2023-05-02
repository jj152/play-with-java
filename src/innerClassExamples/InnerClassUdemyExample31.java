package innerClassExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InnerClassUdemyExample31 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("James", "diana", "Anna");

		/* INSERT */
		Collections.sort(names, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});

		System.out.println(names);
	}
}
