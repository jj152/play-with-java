package innerClassExamples;

class A17 {
    public void print(String name) {
        class B17 {
            B17() {
                System.out.println(name); //Line 5
            }
        }
    }
    //B17 obj = new B17(); //Line 9
}
 
public class InnerClassUdemyExample17 {
    public static void main(String[] args) {
        new A17().print("Udayan"); //Line 14
    }
}