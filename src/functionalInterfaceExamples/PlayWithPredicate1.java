package functionalInterfaceExamples;

import java.util.Objects;

public class PlayWithPredicate1 {
	
	public static void main(String args[]) {
		
		Predicate<String> p = String::isEmpty;
        Predicate<String> pNot = p.negate();

        System.out.println("For Hello = " + pNot.test("Hello"));
        System.out.println("For empty string = " + pNot.test(""));
        
        Predicate<String> p1 = Objects::nonNull;
        Predicate<String> p2 = String::isEmpty;

        Predicate<String> p3 = p1.and(p2);
        
        System.out.println("For Hello 1 = " + p3.test("Hello"));
        System.out.println("For null : " + p3.test(null));
        System.out.println("For empty string  1 = " + p3.test(""));
        
        Predicate<String> p11 = s -> s.length() == 4;
        Predicate<String> p12 = s -> s.startsWith("J");

        Predicate<String> p13 = p11.xOr(p12);

        System.out.println("For True = " + p13.test("True"));
        System.out.println("For Julia = " + p13.test("Julia"));
        System.out.println("For Java = " + p13.test("Java"));
        
        Predicate<String> p14 = s -> s.length() == 4;
        Predicate<String> p15 = s -> s.startsWith("J");

        Predicate<String> p16 = p14.or(p15);

        System.out.println("For True = " + p16.test("True"));
        System.out.println("For Julia = " + p16.test("Julia"));
        System.out.println("For Java = " + p16.test("Java"));
		
	}
	

}
