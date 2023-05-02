package lambdaExamples;

abstract class Greetings {
    abstract void greet(String s);
}

public class LambdaUdemyExample02 {
    public static void main(String[] args) {
		
		  Greetings obj = new Greetings() { public void greet(String s) {
		  System.out.println(s); } };
		 
    	
		/*
		 * Greetings obj = (String s) -> {System.out.println(s.toUpperCase());};
		 * Greetings obj = s -> {System.out.println(s.toUpperCase());}; Greetings obj =
		 * s -> System.out.println(s.toUpperCase());
		 */
        obj.greet("Happy New Year!");
    }    
}
