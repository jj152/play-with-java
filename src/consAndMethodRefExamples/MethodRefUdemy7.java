package consAndMethodRefExamples;

interface I1 {
    void m(int i, int j);
}
 
class MyClass {
    public void add(int i, int j) {
        System.out.println(i * j);
    }
}
 
public class MethodRefUdemy7 {
     public static void main(String[] args) {
         MyClass obj = new MyClass();
//         I1 i1 = (i, j) -> System.out.println(i * j); //Line 16
//         I1 i1 = obj::add; //Line 16
         I1 i1 = (i,j) -> obj.add(i, j); //Line 16
         i1.m(24, 12);
     }
}