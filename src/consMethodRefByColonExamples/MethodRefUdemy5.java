package consMethodRefByColonExamples;

interface Creator1<T> {
    T create();
}
 
abstract class Gift {
     public Gift() {
         super();
     }
 
     public String toString() {
         return "Gift";
     }
}
 
class Book1 extends Gift {
     public Book1() {
         super();
     }
 
     public String toString() {
         return "Book";
     }
}
 
public class MethodRefUdemy5 {
     public static void main(String[] args) {
         //Creator1<Gift> obj = Gift::new;
         //System.out.println(obj.create());
     }
}
