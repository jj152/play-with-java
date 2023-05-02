package functionalInterfaceExamples;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie{
	String name;
	String hero;
	String heroine;
	public Movie(String name, String hero, String heroine) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
}

public class PredefinedFunctionalInterface10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> l = new ArrayList<Movie>();
		populate(l);
		Consumer<Movie> c = m -> {
			System.out.println("movie name " + m.name);
			System.out.println("movie hero " + m.hero);
			System.out.println("movie heroine " + m.heroine);
		};
		for(Movie mv : l) {
			c.accept(mv);
			System.out.println("-----------------");
		}
	}
	public static void populate(ArrayList<Movie> mv) {
		mv.add(new Movie("a","an","ann"));
		mv.add(new Movie("a1","an1","ann2"));
		mv.add(new Movie("a2","an1","ann5"));
	}
}
