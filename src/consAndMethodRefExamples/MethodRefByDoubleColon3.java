package consAndMethodRefExamples;

import java.util.function.BiFunction;

public class MethodRefByDoubleColon3 {
    
    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }
    
    public static String appendStrings(String a, String b) {
        return a + b;
    }
    
    public String appendStrings2(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        
    	MethodRefByDoubleColon3 myApp = new MethodRefByDoubleColon3();

        // Calling the method mergeThings with a lambda expression
        System.out.println(MethodRefByDoubleColon3.
            mergeThings("Hello ", "World!", (a, b) -> a + b));
        
        // Reference to a static method
        System.out.println(MethodRefByDoubleColon3.
            mergeThings("Hello ", "World!", MethodRefByDoubleColon3::appendStrings));

        // Reference to an instance method of a particular object        
        System.out.println(MethodRefByDoubleColon3.
            mergeThings("Hello ", "World!", myApp::appendStrings2));
        
        // Reference to an instance method of an arbitrary object of a
        // particular type
        System.out.println(MethodRefByDoubleColon3.
            mergeThings("Hello ", "World!", String::concat));
    }
}
