package innerClassExamples;

class Foo12 {
    static { //static initialization block
        System.out.print(1);
    }
 
    class Bar {
        static { //static initialization block
            System.out.print(2);
        }
    }
}
 
public class InnerClassUdemyExample12 {
    public static void main(String [] args) {
        new Foo12().new Bar();
    }
}