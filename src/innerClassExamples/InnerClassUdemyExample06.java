package innerClassExamples;

class A6 {
    A6() {
        System.out.print(1);
    }
 
    class B {
        B() {
            System.out.print(2);
        }
    }
}
 
public class InnerClassUdemyExample06 {
    public static void main(String [] args) {
        //B obj = new A6().new B();
    }
}