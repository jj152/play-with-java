package lambdaExamples;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.function.Supplier;
import java.util.function.BiConsumer;

public class methodsAsLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// w/o method reference
		IntFunction<String> intFunc = num -> Integer.toString(num);
		System.out.println(intFunc.apply(234));
		
		// static method reference
		IntFunction<String> intFunc1 = Integer::toString;
		System.out.println(intFunc1.apply(234));
		
		// w/o constructor reference
		Function<String, Integer> strToInt = Integer::new;
		System.out.println(strToInt.apply("34567"));
		
		// constructor reference
		Function<String, Integer> strToInt1 = num -> Integer.parseInt(num);
		System.out.println(strToInt1.apply("34567"));
		
		// w/o method reference
		Consumer<String> csm = m -> System.out.println(m);
		csm.accept("Hello World");
		
		// instance method reference
		Consumer<String> csm1 = System.out::println;
		csm1.accept("Hello World");
		
		UnaryOperator<String> strConcat = m -> "Hello ".concat(m);
		System.out.println(strConcat.apply("World Again"));
		
		UnaryOperator<String> strConcat1 = "Hello "::concat;
		System.out.println(strConcat1.apply("World Again"));
		
		Calculate add = (a,b)-> a+b;
		Calculate subs = (a,b)-> a-b;
		
		Supplier<String> oldStartDisplay = Calculate::startDisplay;
		
		Supplier<String> newStartDisplay = new switchONMessageSystem()::startDisplay;
		BiConsumer<String, String> totalStartDisplay = (a,b) -> System.out.println(a.concat(b));
		totalStartDisplay.accept(newStartDisplay.get().toString(),oldStartDisplay.get().toString());
		
		System.out.println(add.calc(2,3));
		System.out.println(subs.calc(2,3));
		
		Supplier<String> oldEndDisplay = Calculate::endDisplay;
		Supplier<String> newEndDisplay = new switchOffMessageSystem()::endDisplay;
		UnaryOperator<String> totalEndDisplay = oldEndDisplay.get()::concat;
		System.out.println(totalEndDisplay.apply(newEndDisplay.get()));
		
		/*
		 * Supplier<String> x = () -> "Hello!"; System.out.println(x.get());
		 */

	}

}

@FunctionalInterface
interface Calculate{
	int calc(int a, int b);
	static String startDisplay() {
		return "Let's Calculate";
	}
	static String endDisplay() {
		return "Good Bye. ";
	}
}

class switchOffMessageSystem{	
	public String endDisplay() {
		return "Have A Nice Day";
	}	
}

class switchONMessageSystem{	
	public String startDisplay() {
		return "Welcome. ";
	}
}
