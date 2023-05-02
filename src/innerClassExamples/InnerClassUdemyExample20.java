package innerClassExamples;

class Message20 {
    public void printMessage() {
        System.out.println("Hello!");
    }
}
 
public class InnerClassUdemyExample20 {
    public static void main(String[] args) {
    	Message20 msg = new Message20() {
            public void PrintMessage() {
                System.out.println("HELLO!");
            }
        };
        msg.printMessage();
    }
}
