package consAndMethodRefExamples;

@FunctionalInterface
interface Operator {
     void operate(int i, int j);
}
 
class Calculator {
     public static void add(int i, int j) {
         System.out.println(i + j);
     }
}
 
public class MethodRefUdemy2 {
     public static void main(String[] args) {
//         Operator opr = (i, j) -> System.out.println(i + j); //Line 14
    	 Operator opr = Calculator::add; //Line 14
         opr.operate(15, 25);
     }
}
