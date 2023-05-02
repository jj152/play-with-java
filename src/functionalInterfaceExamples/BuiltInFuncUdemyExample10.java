package functionalInterfaceExamples;

import java.util.function.Predicate;

public class BuiltInFuncUdemyExample10 {
    public static void main(String[] args) {
        String [] arr = {"*", "**", "***", "****", "*****", "******"};
        Predicate<String> pr1 = s -> s.length() > 3;
        print(arr, pr1.negate());
    }
    
    private static void print(String [] arr, Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}