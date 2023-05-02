package functionalInterfaceExamples;


//import java.util.function.IntFunction;
//import java.util.function.IntPredicate;
//import java.util.function.ToIntFunction;
import java.util.function.IntToDoubleFunction;

public class PrimitiveFunctionalInterface01 {

	public static void main(String[] args) {
		// Program for IntPredicate
//		int[] x = { 0, 5, 10, 15, 20, 25 };
//		IntPredicate p = i -> i % 2 == 0;
//		for (int x1 : x) {
//			if (p.test(x1)) {
//				System.out.println(x1);
//			}
//		}
		
		// find square of given integer by using IntFunction
//		IntFunction<Integer> f=i->i*i; 
//		System.out.println(f.apply(5)); 
		
		// find length of the given String by using ToIntFunction
//		ToIntFunction<String> f=s->s.length(); 
//		System.out.println(f.applyAsInt("durga")); 
		
		// find square root of given integer by using Function
		IntToDoubleFunction f=i->Math.sqrt(i); 
		System.out.println(f.applyAsDouble(9));
	}

}
