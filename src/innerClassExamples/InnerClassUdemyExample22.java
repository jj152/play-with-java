package innerClassExamples;

class Message22 {
    public void printMessage22() {
        System.out.println("Hello!");
    }
}
 
public class InnerClassUdemyExample22 {
     public static void main(String[] args) {
    	 Message22 msg = new Message22() {
				/*
				 * @Override public void PrintMessage22() { System.out.println("HELLO!"); }
				 */
         };
         msg.printMessage22();
     }
}
