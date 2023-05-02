package lambdaExamples;

interface Operator11<T> {
    public abstract T operation(T t1, T t2);
}
 
public class LambdaUdemyExample11 {
     public static void main(String[] args) {
			
			  System.out.println(new Operator11<String>() { public String operation(String
			  s1, String s2) { return s1 + s2; } });
			 
    	 //System.out.println((s1, s2) -> { return s1 + s2; });
     }
}
