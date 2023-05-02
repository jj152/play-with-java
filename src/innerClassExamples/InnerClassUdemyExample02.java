package innerClassExamples;

public class InnerClassUdemyExample02 {
    class A {
        void m() {
            System.out.println("INNER");
        }
    }

    public static void main(String [] args) {
        //Insert statement here
    	A a1 = new InnerClassUdemyExample02().new A();
    	//InnerClassUdemyExample2.A a1 = new InnerClassUdemyExample2().new A();
    	a1.m();
    }
}
