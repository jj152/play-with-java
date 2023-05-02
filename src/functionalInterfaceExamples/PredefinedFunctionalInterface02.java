package functionalInterfaceExamples;

import java.util.function.Predicate;

/* predicate joining*/
public class PredefinedFunctionalInterface02 {
	
	public static void m1(Predicate<Integer> p, int[] x) {
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {9,10,11,12};
		Predicate<Integer> p1 = i -> i>10;
		Predicate<Integer> p2 = i -> i%2==0;
		System.out.println("Numbers greater than 10");
		m1(p1, x);
		System.out.println("even numbers");
		m1(p2, x);
		System.out.println("Numbers less than 10");
		m1(p1.negate(), x);
		System.out.println("Numbers greater than 10 or even numbers");
		m1(p1.or(p2), x);
		System.out.println("Numbers greater than 10 and even numbers");
		m1(p1.and(p2), x);
		System.out.println("Numbers less than 10 or even numbers");
		m1(p2.or(p1.negate()), x);
		System.out.println("Numbers less than 10 and even numbers");
		m1(p2.and(p1.negate()), x);

	}

}
