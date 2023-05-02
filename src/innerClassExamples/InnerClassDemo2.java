package innerClassExamples;

class InnerClassDemo11 {
	class InnerClass1{
		public void m1() {
			System.out.println("inner class 1");
		}
	}
}

public class InnerClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassDemo11().new InnerClass1().m1(); // accessing inner class from outside(from another class) of outer class
	}

}
