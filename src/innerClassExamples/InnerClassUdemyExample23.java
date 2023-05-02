package innerClassExamples;

abstract class Greetings {
    abstract void greet();
}
 
public class InnerClassUdemyExample23 {
     public static void main(String[] args) {
         Greetings obj = new Greetings() {
             @Override
             public void greet() {
                 System.out.println("Hello");
             }
         };
         obj.greet();
     }
}
