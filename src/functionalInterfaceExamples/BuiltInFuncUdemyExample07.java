package functionalInterfaceExamples;

import java.util.function.Function;

public class BuiltInFuncUdemyExample07 {
    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x + 10; 
        Function<Integer, Integer> g = y -> y * y; 
        Function<Integer, Integer> fog = g.compose(f); //Line 8
        //Function fog = g.andThen(g)
        System.out.println(fog.apply(10));
    }
}