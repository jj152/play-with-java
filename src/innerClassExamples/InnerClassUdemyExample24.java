package innerClassExamples;

interface Flyable {
    void fly();
}

public class InnerClassUdemyExample24 {
    public static void main(String[] args) {
        /*INSERT*/
    	Flyable flyable = new Flyable(){
    		public void fly() {
    			
    		}
    	};
    }
}