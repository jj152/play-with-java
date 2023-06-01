package consAndMethodRefExamples;

interface Creator3<T> {
    T create();
}
 
public class MethodRefUdemy9 {
     public static void main(String[] args) {
          Creator3<String> obj = process("  abc d")::toUpperCase;
          System.out.println(">" + obj.create() + "<");
     }
 
     private static String process(String str) {
          return str.trim();
     }
}
