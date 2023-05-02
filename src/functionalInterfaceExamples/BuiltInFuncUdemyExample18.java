package functionalInterfaceExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class BuiltInFuncUdemyExample18 {
     public static void main(String[] args) {
         List<String> swiftCodes = Arrays.asList("ICICINDD016", "ICICINBBRT4", 
            "BOTKINDD075", "BARBINBB011", "SBBJINDD062", "ABNATHBK865", 
            "BKCHTHBK012");
 
         Comparator<String> countryLocationBank = Comparator.comparing(BuiltInFuncUdemyExample18::
            extractCountry).thenComparing(BuiltInFuncUdemyExample18::extractLocation)
            .thenComparing(BuiltInFuncUdemyExample18::extractBank);
 
         Collections.sort(swiftCodes, countryLocationBank);
         printCodes(swiftCodes);
     }
 
     private static String extractCountry(String swiftCode) {
         return swiftCode.substring(4, 6);
     }
 
     private static String extractLocation(String swiftCode) {
         return swiftCode.substring(6, 8);
     }
 
     private static String extractBank(String swiftCode) {
         return swiftCode.substring(0, 4);
     }
 
     private static void printCodes(List<String> list) {
         for (String str : list) {
             System.out.println(str);
          }
     }
}