package innerClassExamples;

class Outer14 {
	public void print(int x) {
		class Inner {
			public void getX() {
				System.out.println(++x);
			}
		}
		Inner inner = new Inner();
		inner.getX();
	}
}

public class InnerClassUdemyExample14 {
	public static void main(String[] args) {
		new Outer14().print(100);
	}
}
