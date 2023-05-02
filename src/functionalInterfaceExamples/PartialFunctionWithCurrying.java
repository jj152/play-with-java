package functionalInterfaceExamples;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PartialFunctionWithCurrying {
	public static void main(String[] args) {		
		TriFunction<Integer, Integer, Integer, Integer> add = (x, y, z) -> x + y + z;
		Function<Integer, BiFunction<Integer,Integer, Integer>> addPartial = (x)-> (y,z) -> add.apply(x, y, z);
		BiFunction<Integer,Integer, Integer> add5 = addPartial.apply(5);
		System.out.println(add5.apply(6, 7));
		
		// Currying example
		/*
		 * TriFunction<Integer, Integer, Integer, Integer> add = (x, y, z) -> x + y + z;
		 * Function<Integer, Function<Integer, Function<Integer, Integer>>> addPartial =(x) -> (y) -> (z) -> add.apply(x, y, z); 
		 * Function<Integer, Function<Integer,Integer>> add5 = addPartial.apply(5); 
		 * Function<Integer, Integer> add5And6 = add5.apply(6);
		 * Integer sum = add5And6.apply(7); 
		 * System.out.println(sum);
		 */
	}
}
interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
