package lambdaExamples;

import lambdaExamples.LambdaUdemyExample05.Inner.Inner1;

@FunctionalInterface
interface I7 {
     void print();
}
 
public class LambdaUdemyExample05 {
     String var = "Lambda";
 
     class Inner {
         int var = 1000;
         class Inner1 {
             int var = 3000;
				/*
				 * I7 obj = () -> System.out.println(new LambdaUdemyExample5().new Inner().var);
				 * I7 obj = () -> System.out.println(var);
				 */
             I7 obj = () -> System.out.println(this.var);
         }
         //I7 obj = () -> System.out.println(this.var);
     }
 
     public static void main(String[] args) {
         Inner1 inner = new LambdaUdemyExample05().new Inner().new Inner1();
         inner.obj.print();
     }
}
