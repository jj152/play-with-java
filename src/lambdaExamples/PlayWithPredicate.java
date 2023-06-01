package lambdaExamples;

import java.util.Objects;

public class PlayWithPredicate {
	
	public static void main(String[] args) {
		
		Predicate<String> p = String::isEmpty;
	    //Predicate<String> pNot = p.negate();

	    System.out.println("For Hello = " + p.negate().test("Hello"));
	    System.out.println("For empty string = " + p.negate().test(""));
	    
	    Predicate<String> p1 = Objects::nonNull;
	    Predicate<String> p2 = String::isEmpty;
	    
	    Predicate<String> p3 = p1.and(p2);
	    System.out.println("For null = " + p3.test(null));
	    System.out.println("For non null = " + p3.test("qwerty"));
	    System.out.println("For empty string = " + p3.test(""));
	    
	    Predicate<String> p11 = s -> s.length() == 4;
        Predicate<String> p12 = s -> s.startsWith("J");

        Predicate<String> p13 = p11.xOr(p12);

        System.out.println("For True = " + p13.test("True"));
        System.out.println("For Julia = " + p13.test("Julia"));
        System.out.println("For Java = " + p13.test("Java"));
	}
	
	

}

@FunctionalInterface
interface Predicate<T>{
	
	boolean test(T t);
	
	default Predicate<T> negate(){
		return t -> !this.test(t);
	}
	
	default Predicate<T> and(Predicate<T> other){
		Objects.requireNonNull(other);
		return t-> this.test(t) && other.test(t);
	}
	
	default Predicate<T> xOr(Predicate<T> other){
		Objects.requireNonNull(other);
		return t-> this.test(t) ^ other.test(t);
	}
}
