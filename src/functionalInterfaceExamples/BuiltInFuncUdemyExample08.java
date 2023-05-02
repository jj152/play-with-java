package functionalInterfaceExamples;

import java.util.function.Function;

public class BuiltInFuncUdemyExample08 {
    public static void main(String[] args) {
        Function<String, Integer> f1 = Integer::new;
        Function<String, String> f2 = s -> new StringBuilder(s).reverse().toString();
        System.out.println(f1.compose(f2).apply("12345"));
    }
}