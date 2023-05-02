/* Anonymous Inner class */
package innerClassExamples;

class Popcorn{
	public void taste() {
		System.out.println("salty");
	};
	public void m1() {
		System.out.println("m1");
	};
	public void m2() {
		System.out.println("m2");
	};
	public void m3() {
		System.out.println("m3");
	}
}

public class InnerClassDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Popcorn p = new Popcorn() {
			public void taste() {
				System.out.println("spicy");
			};
		};
		p.taste();
		Popcorn p1 = new Popcorn();
		p1.taste();
		Popcorn p3 = new Popcorn() {
			public void taste() {
				System.out.println("sweet");
			};
		};
		p3.taste();
		System.out.println(p.getClass().getName());
		System.out.println(p1.getClass().getName());
		System.out.println(p3.getClass().getName());
	}
}
