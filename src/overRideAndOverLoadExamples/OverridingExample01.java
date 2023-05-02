package overRideAndOverLoadExamples;

//case - 1
//class Parent2{
//	public void m2(int i) {
//		System.out.println("i in Parent");
//	};
//}
//
//class Child2 extends Parent2{
//	public void m2(int i) {
//		System.out.println("i in child");
//	};	
//}

//case - 2
//class Parent2{
//	public void m2(int i) {
//		System.out.println("i in Parent");
//	};
//}
//
//class Child2 extends Parent2{
//	public void m2(int... i) {
//		System.out.println("i in child");
//	};	
//}

//case - 3
class Parent2{
	public void m2(int... i) {
		System.out.println("i in Parent");
	};
}

class Child2 extends Parent2{
	public void m2(int i) {
		System.out.println("i in child");
	};	
}


public class OverridingExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		case - 1
//		Parent2 p = new Parent2();
//		p.m2(1);
//		Child2 c = new Child2();
//		c.m2(1);
//		Parent2 p1 = new Child2();
//		p1.m2(1);
//		i in Parent
//		i in child
//		i in child
		
//		case - 2
//		Parent2 p = new Parent2();
//		p.m2(1);
//		Child2 c = new Child2();
//		c.m2(1);
//		Parent2 p1 = new Child2();
//		p1.m2(1);
//		i in Parent
//		i in Parent
//		i in Parent
//		case - 2
		Parent2 p = new Parent2();
		p.m2(1);
		Child2 c = new Child2();
		c.m2(1);
		Parent2 p1 = new Child2();
		p1.m2(1);
//		i in Parent
//		i in child
//		i in Parent

	}

}
