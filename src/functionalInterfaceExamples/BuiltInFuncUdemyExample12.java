package functionalInterfaceExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class BuiltInFuncUdemyExample12 {
     public static void main(String[] args) {
         List<String> emails = Arrays.asList("udayan@outlook.com", "sachin@outlook.com",
             "sachin@gmail.com", "udayan@gmail.com");
         
         Collections.sort(emails, Comparator.comparing(str -> 
             str.substring(str.indexOf("@") + 1)));
         
         for(String email : emails) {
             System.out.println(email);
         }
     }
}
