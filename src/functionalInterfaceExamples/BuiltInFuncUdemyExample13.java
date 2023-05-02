package functionalInterfaceExamples;

import java.util.function.Consumer;

public class BuiltInFuncUdemyExample13 {
     public static void main(String[] args) {
         Consumer<String> c1 = str -> {
             System.out.println(new StringBuilder(str).reverse().toString().substring(2));
         };
         c1.accept("!yppahnu");
     }
}