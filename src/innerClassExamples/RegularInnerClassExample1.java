package innerClassExamples;

public class RegularInnerClassExample1 {
	private class InnerOne {
		static int x = 99;
		public void m1() {
			//static int y = 99;
			System.out.println("x - " + x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RegularInnerClassExample1().new InnerOne().m1();
	}

}
