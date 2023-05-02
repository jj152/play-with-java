package lambdaExamples;

interface I10 {
    void m(String s);
}

public class LambdaUdemyExample08 {
    public static void main(String[] args) {
		/*
		 * method(new I10() {
		 * 
		 * @Override public void m(String s) { System.out.println(s.toUpperCase()); } },
		 * "good morning!");
		 */
		
		/* method(s -> { System.out.println(s.toUpperCase()) }, "good morning!"); */
    	method(s -> System.out.println(s.toUpperCase()), "good morning!");
    	/* method(s -> s.toUpperCase(), "good morning!"); */
		/* method(s -> System.out.println(s.toUpperCase())); */
    }
     
   private static void method(I10 obj, String text) {
        obj.m(text);
    }
}





