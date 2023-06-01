package innerClassExamples;

class Outer16 {
    public static void sayHello() {}
 
    static {
        class Inner16 {
			
			 Inner16() { System.out.println("HELLO1"); }
			 
        	
        	{
        		System.out.println("HELLO");
        	}
        }
        new Inner16();
    }
}
 
public class InnerClassUdemyExample16 {
    public static void main(String[] args) {
        Outer16.sayHello();
    }
}
