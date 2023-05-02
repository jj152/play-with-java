/* vararg, auto promotion, exact/non-exact match example */
package overRideAndOverLoadExamples;

public class OverloadingWithVarargExample01 {
	
	public void m(int i) {
		System.out.println("int");
	}
	public void m(int... i) {
		System.out.println("int vararg");
	}
//	public void m(float i) {
//		System.out.println("float");
//	}
//	public void m(double i) {
//		System.out.println("double");
//	}
	
	public void m(Object i) {
		System.out.println("obj");
	}
	public void m(String i) {
		System.out.println("str");
	}
	
	public void m(StringBuffer i) {
		System.out.println("StringBuffer");
	}
	public void m(int i,float f) {
		System.out.println("int float");
	}
	public void m(float f, int i) {
		System.out.println("float int");
	}
//	public void m(float f, float fi) {
//		System.out.println("float float");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingWithVarargExample01 t = new OverloadingWithVarargExample01();
		t.m((int) 10.5);
		t.m('a');
//		t.m(null);
		t.m("Hello world");
		t.m(new StringBuffer("Hello world"));
		t.m();
		t.m(10,10f);
		t.m(10f,10);
		//t.m(10,20);
		t.m(10);
	}

}
