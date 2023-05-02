package overRideAndOverLoadExamples;

/* Java program to show that if static methods are redefined by a derived class, then it is not overriding but hiding. */ 

public class MethodHidingInOverideExample02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base p = new Base();
		p.display();
		p.print();
		Derived c = new Derived();
		c.display();
		c.print();
		Base p1 = new Derived();
		p1.display();
		p1.print();
	}
}

//Superclass
class Base {
	// Static method in base class which will be hidden in subclass
	public static void display() {
		System.out.println("Static or class method from Base");
	}
	// Non-static method which will be overridden in derived class
	public void print() {
		System.out.println("Non-static or Instance method from Base");
	}
}

//Subclass
class Derived extends Base {
	/*
	 * Static is added here (Causes Compiler Error)
	 * Reason for Compiler Error - An instance method cannot override a static method)
	 */
	// public void display() {
	public static void display() {
		System.out.println("Non-static method from Derived");
	}
	/*
	 * Static is removed here (Causes Compiler Error)
	 * Reason for Compiler Error - An static method cannot hide an instance method
	 */
	//public static void print() {
	public void print() { // 
		System.out.println("Static method from Derived");
	}
}
