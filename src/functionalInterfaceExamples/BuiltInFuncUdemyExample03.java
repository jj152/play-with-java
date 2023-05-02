package functionalInterfaceExamples;

import java.util.function.Supplier;

public class BuiltInFuncUdemyExample03 {
     public static void main(String[] args) {
         Supplier<StringBuilder> supplier = () -> new StringBuilder(" olleH").reverse().append("!dlroW").reverse();
         System.out.println(supplier.get());
     }
}
