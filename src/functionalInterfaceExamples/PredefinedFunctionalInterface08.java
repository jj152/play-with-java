package functionalInterfaceExamples;

import java.util.function.Function;

/* Use of Function */
public class PredefinedFunctionalInterface08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,String> f = s -> s.replaceAll(" ","_");
		System.out.println(f.apply("Hello World"));
		Function<String,Integer> f1 = s -> s.length()- s.replaceAll(" ","").length() ;
		System.out.println(f1.apply("Hello World"));
	}

}
