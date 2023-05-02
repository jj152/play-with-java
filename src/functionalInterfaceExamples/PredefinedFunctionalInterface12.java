package functionalInterfaceExamples;

import java.util.function.Consumer;

/* consumer chaining*/

class Movie1{
	String name;
	String result;
	public Movie1(String name, String result) {
		this.name = name;
		this.result = result;
	}
}

public class PredefinedFunctionalInterface12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Movie1> c1 = m -> {
			System.out.println(m.name + " is goint 2 release");
		};
		Consumer<Movie1> c2 = m -> {
			System.out.println(m.name + " is " + m.result);
		};
		Consumer<Movie1> c3 = m -> {
			System.out.println("info stored");
		};
		Consumer<Movie1> chained = c1.andThen(c2).andThen(c3);
		Movie1 mv = new Movie1("a","flop");
		chained.accept(mv);
	}

}
