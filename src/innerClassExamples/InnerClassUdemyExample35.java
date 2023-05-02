package innerClassExamples;

public class InnerClassUdemyExample35 {
    private static class B35 {
        private void log() {
            System.out.println("static nested class");
        }
    }

    public static void main(String[] args) {
        /*INSERT*/
    	B35 obj1 = new B35();
    	obj1.log();
    }
}
