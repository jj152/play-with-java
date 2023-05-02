package innerClassExamples;

class X {
    class Y {
        private void m() {
            System.out.println("INNER");
        }
    }
    
    public void invokeInner() {
        Y obj = new Y(); //Line 9
        obj.m(); //Line 10
    }
}
 
public class InnerClassUdemyExample10 {
    public static void main(String[] args) {
        new X().invokeInner();
    }
}
