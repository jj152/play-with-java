package lambdaExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PlayWithConsumers {

	public static void main(String[] args) {	
		playConsume();
	}
	
	@Test
	public static void playConsume() {
		Consumer<String> c = (s) -> System.out.println(s);
		c.accept("Hello World");
		
		Consumer<String> c1 = System.out::println;
		c1.accept("Hello World");
		
		Consumer<List<String>> c2 = (s)-> s.clear();
		ArrayList<String> l = new ArrayList<String>(Arrays.asList("a", "b", "c")); 
		c2.accept(l);
		
		System.out.println("strings = " + l);
		
		Consumer<List<String>> c3 = List::clear;
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("a", "b", "c")); 
		c3.accept(l1);
		
		System.out.println("strings = " + l1);
		
		Consumer<List<String>> c4 = list-> list.add("one");
		Consumer<List<String>> c5 = list-> list.add("two");
		Consumer<List<String>> c6 = c4.andThen(c5);
		
		List<String> strings = new ArrayList<String>();
		strings.add("three");
		c6.accept(strings);
		System.out.println(strings);
		
	}

}

@FunctionalInterface
interface Consumer<T> {
	void accept(T t);
	default Consumer<T> andThen(Consumer<T> other) {
		return (T t) -> {this.accept(t);other.accept(t);};
	}
	
	/*default Consumer<T> andThen(Consumer<T> other) {
		return (T t) -> {other.accept(t);this.accept(t);};
	}*/
}
