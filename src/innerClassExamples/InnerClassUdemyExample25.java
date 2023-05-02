package innerClassExamples;

interface I25 {
    void m1();
}

public class InnerClassUdemyExample25 {
    public static void main(String[] args) {
    	I25 i1 = new I25() {
            @Override
            public void m1() {
                System.out.println(1234);
            }
        };
        i1.m1();
    }
}