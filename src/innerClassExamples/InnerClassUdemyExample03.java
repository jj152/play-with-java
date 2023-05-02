package innerClassExamples;

class A3 {
    private String str = "Hello";

    public class B {
        public B(String s) {
            if(s != null)
                str = s;
        }

        public void m1() {
            System.out.println(str);
        }
     }
}

public class InnerClassUdemyExample03 {
    public static void main(String[] args) {
        //Insert statement here
    	new A3().new B("hello").m1();
    }
}