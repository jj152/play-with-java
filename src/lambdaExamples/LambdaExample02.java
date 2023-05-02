package lambdaExamples;

interface LambdaExample02Helper{  
    public String show(String msg);  
} 

public class LambdaExample02 {
	public static void main(String[] args) {  
	      
        // Single-parameter lambda expression.  
		LambdaExample02Helper s1= msg -> "Hello, "+1;
        System.out.println(s1.show("Sonoo"));  
          
        // The function parentheses can be omitted.
        LambdaExample02Helper s2= msg -> "Hello, "+msg; 
        System.out.println(s2.show("Sonoo"));  
    } 
}
