package innerClassExamples;

class Outer1 {
    private String name = "Udayan";
    //Insert inner class definition here
    class Inner{
    	public void printName() {
    		System.out.println(name);
    	}
    }
}

public class InnerClassUdemyExample01 {
    public static void main(String [] args) {
        new Outer1().new Inner().printName();
    }
}
