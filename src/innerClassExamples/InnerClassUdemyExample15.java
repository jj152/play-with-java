package innerClassExamples;

class A15 {
    public void someMethod(final String name) {
        final class B {
            void print() {
                System.out.println("Hello " + name);
            }
        }
        new B().print();
        
    }
}
 
public class InnerClassUdemyExample15 {
    public static void main(String[] args) {
        new A15().someMethod("World!");
    }
}