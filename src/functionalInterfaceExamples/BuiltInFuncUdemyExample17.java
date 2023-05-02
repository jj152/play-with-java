package functionalInterfaceExamples;

import java.util.function.Predicate;

public class BuiltInFuncUdemyExample17 {
     public static void main(String[] args) {
         String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
 
         processStringArray(arr, p -> p.length() < 10);
     }
 
     private static void processStringArray(String [] arr, Predicate<String> predicate) {
         for(String str : arr) {
             if(predicate.test(str)) {
                 System.out.println(str);
             }
         }
     }
}