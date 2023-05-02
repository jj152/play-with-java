package innerClassExamples;

class Message21 {
    public void printMessage21() {
        System.out.println("Hello!");
    }
}
 
public class InnerClassUdemyExample21 {
    public static void main(String[] args) {
    	Message21 msg = new Message21() {
            public void PrintMessage21() {
                System.out.println("HELLO!");
            }
        };
        //msg.PrintMessage21();
    }
}

