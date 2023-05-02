package collectionExamples;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"A","Z","B"};
		List l = Arrays.asList(s);
		System.out.println(l);
		s[0]="K";
		System.out.println(l);
		l.set(1, "L");
		for(String a : s)
			System.out.println(a);
		//l.add("X"); // RE : UnsupportedOperationException
		//l.remove(2); // RE : UnsupportedOperationException
		//l.set(1,10); // RE : ArrayStoreException
	}

}
