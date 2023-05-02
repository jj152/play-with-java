
package overRideAndOverLoadExamples;

class Animal {
	public void m1() {
		System.out.println("Animal1");
	}
}

class Monkey extends Animal{
	public void m1() {
		System.out.println("monkey1");
	}
}


public class OverloadingExample02 {
	
	public void m(Animal a) {
		System.out.println("Animal");
	}
	
	public void m(Monkey m) {
		System.out.println("monkey");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingExample02 t = new OverloadingExample02();
		Animal a11 = new Monkey();
		a11.m1(); // monkey1
		Animal a = new Animal();
		t.m(a); // Animal
		Monkey m = new Monkey();
		t.m(m); // monkey
		Animal a1 = new Monkey();
		t.m(a1); // Animal		

	}

}
