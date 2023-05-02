package functionalInterfaceExamples;

import java.util.function.Predicate;

public class BuiltInFuncUdemyExample16 {
     public static void main(String[] args) {
         String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
 
         Predicate<String> p1 = s -> s.startsWith("A");
         Predicate<String> p2 = s -> s.startsWith("a");
         Predicate<String> p3 = s -> s.length() >= 3;
 
         processStringArray(arr, p1.or(p2).and(p3));
     }
 
     private static void processStringArray(String [] arr, Predicate<String> predicate) {
         for(String str : arr) {
             if(predicate.test(str)) {
                 System.out.println(str);
             }
         }
     }
}
