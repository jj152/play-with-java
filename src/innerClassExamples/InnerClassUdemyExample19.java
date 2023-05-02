package innerClassExamples;

class Message {
    public void printMessage() {
        System.out.println("Hello!");
    }
}
 
public class InnerClassUdemyExample19 {
    public static void main(String[] args) {
        Message msg = new Message() {}; //Line 9
        msg.printMessage(); //Line 10
    }
}
