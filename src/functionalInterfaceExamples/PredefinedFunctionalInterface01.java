package functionalInterfaceExamples;

import java.util.ArrayList;
import java.util.function.Predicate;

/* Use of Predicate */
public class PredefinedFunctionalInterface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Predicate<Integer> p = i -> i>10;
//		System.out.println(p.test(100));
//		System.out.println(p.test(10));
		
//		Predicate<String> p = i -> i.length()>10;
//		System.out.println(p.test("qwerty"));
//		System.out.println(p.test("qwerty123edfc"));
		
		Predicate<ArrayList<Integer>> p = i -> i.isEmpty();
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l.add(1);
		System.out.println(p.test(l));
		System.out.println(p.test(l1));

	}

}
