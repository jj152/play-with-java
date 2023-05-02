package functionalInterfaceExamples;

import java.util.Objects;

public class CustomizedPredicateExample01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPredicate<String> p = String::isEmpty;
		MyPredicate<String> pNot = p.negate();
		System.out.println("For Hello World - " + p.test("Hello"));
		System.out.println("For Hello World - " + p.test(""));
		System.out.println("For Hello World - " + pNot.test("Hello"));
		System.out.println("For Hello World - " + pNot.test(""));
		
		MyPredicate<String> p1 = Objects::nonNull;
		MyPredicate<String> p2 = String::isEmpty;
		MyPredicate<String> p3 = p1.and(p2);
		p3.test("Hello");
		System.out.println("for null : " + p3.test(null));
		
		MyPredicate<String> p11 = s->s.length()==4;
		MyPredicate<String> p12 = s-> s.startsWith("j");
		MyPredicate<String> p13 = p11.xOr(p12);
		System.out.println("for true - "+ p13.test("true"));
		System.out.println("for julia - "+ p13.test("julia"));
		System.out.println("for java - "+ p13.test("java"));
		
	}
	
}

@FunctionalInterface
interface MyPredicate<T> {
	boolean test(T t);
	default MyPredicate<T> negate(){
		return t -> !this.test(t);
	}
	default MyPredicate<T> and(MyPredicate<T> other){
		//Objects.requireNonNull(other);
		return t -> this.test(t) && other.test(t);		
	}
	default MyPredicate<T> xOr(MyPredicate<T> other){
		//Objects.requireNonNull(other);
		return t -> this.test(t) ^ other.test(t);		
	}
}