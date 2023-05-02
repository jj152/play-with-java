package functionalInterfaceExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class BuiltInFuncUdemyExample19 {
     public static void main(String[] args) {
          List<String> list = Arrays.asList("#####", "#", "##", "####", "###");
          Comparator<String> comp = Comparator.comparing(s -> s);
          Collections.sort(list, comp.reversed());
          printCodes(list);     }     private static void printCodes(List<String> list) {
          for (String str : list) {
               System.out.println(str);
          }
    }
}