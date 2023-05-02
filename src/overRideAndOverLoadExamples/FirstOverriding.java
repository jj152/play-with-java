package overRideAndOverLoadExamples;

class Parent{
	public void m1() {
		System.out.println("m1 in Parent");
	};
	public void m2() {
		System.out.println("m2 in Parent");
	};
}

class Child extends Parent{
	public void m2() {
		System.out.println("m2 in Child");
	};	
}

public class FirstOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.m2();
		Child c = new Child();
		c.m2();
		Parent p1 = new Child();
		p1.m2();
	}

}
