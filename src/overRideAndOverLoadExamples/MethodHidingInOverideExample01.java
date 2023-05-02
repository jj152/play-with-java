package overRideAndOverLoadExamples;

class Parent1{
	public void m1() {
		System.out.println("m1 in Parent");
	};
	public static void m2() {
		System.out.println("m2 in Parent");
	};
}

class Child1 extends Parent1{
	public static void m2() {
		System.out.println("m2 in Child");
	};	
}

public class MethodHidingInOverideExample01 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p = new Parent1();
		p.m2();
		Child1 c = new Child1();
		c.m2();
		Parent1 p1 = new Child1();
		p1.m2();
	}

}

