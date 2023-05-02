package functionalInterfaceExamples;

import java.util.function.Function;

public class BuiltInFuncUdemyExample06 {
     public static void main(String[] args) {
        Function<char [], String> obj = String::new; //Line 5
        String s = obj.apply(new char[] {'j', 'a', 'v', 'a'}); //Line 6
        System.out.println(s);
     }
}
