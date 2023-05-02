package innerClassExamples;

class Outer18 {
    private String msg = "A";
 
    public void print() {
        final String msg = "B";
        class Inner {
            public void print() {
                //System.out.println(this.msg);
            }
        }
        Inner obj = new Inner();
        obj.print();
    }
}
 
public class InnerClassUdemyExample18 {
    public static void main(String[] args) {
        new Outer18().print(); 
    }
}
