package innerClassExamples;

public class RegularInnerClassExample1 {
	private class InnerOne {
		// Compilation error : The field x cannot be declared static in a non-static inner type
		//static int x = 99;
		//static final int x = 99; // It will also work
		int x = 98;		
		public void m1() {
			System.out.println("x - " + x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RegularInnerClassExample1().new InnerOne().m1();
	}

}
