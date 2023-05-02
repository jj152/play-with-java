package innerClassExamples;

class P {
    private int var = 100;
 
    class Q {
        String var = "Udayan";
        void print() {
            System.out.println(var);
        }
    }
}
 
public class InnerClassUdemyExample11 {
    public static void main(String[] args) {
        new P().new Q().print();
    }
}
