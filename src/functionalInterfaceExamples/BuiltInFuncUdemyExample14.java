package functionalInterfaceExamples;

import java.util.function.Consumer;

public class BuiltInFuncUdemyExample14 {
     public static void main(String[] args) {
         Consumer<Integer> consumer = System.out::print;
         Integer i = 5;
         consumer.andThen(consumer).accept(i++); //Line 7
     }
}
