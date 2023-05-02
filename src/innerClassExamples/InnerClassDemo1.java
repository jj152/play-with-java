package innerClassExamples;

public class InnerClassDemo1 {
	class InnerClass{
		public void m1() {
			System.out.println("inner class");
		}
	}
	public void m2() {
		InnerClass i = new InnerClass();
		i.m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassDemo1().new InnerClass().m1(); // accessing inner class from static area of outer class
		new InnerClassDemo1().m2(); // accessing inner class from instance area(through m2() method) of outer class
	}
}
