package innerClassExamples;

class Outer5 {
    class Inner {
        public void m() {
            System.out.println("WELCOME!");
        }
    }
}
 
public class InnerClassUdemyExample05 {
    public static void main(String[] args) {
        //Insert statement here
    	Outer5.Inner obj1 = new Outer5().new Inner();
    	//Inner obj1 = new Outer5().new Inner();
    	obj1.m();
    }
}
