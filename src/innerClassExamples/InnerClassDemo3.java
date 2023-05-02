package innerClassExamples;


public class InnerClassDemo3 {
	int x = 10;
	class InnerClass{
		int x = 100;
		public void m1() {
			int x = 1000;
			System.out.println("inner class");
			System.out.println(x);
			System.out.println(this.x);
			//System.out.println(InnerClass.this.x);
			System.out.println(InnerClassDemo3.this.x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassDemo3().new InnerClass().m1(); // accessing inner class from static area of outer class
	}
}