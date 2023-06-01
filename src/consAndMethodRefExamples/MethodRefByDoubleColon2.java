package consAndMethodRefExamples;

public class MethodRefByDoubleColon2 {
	public void m() {
		for (int i = 0; i < 10; i++) {
			System.out.println("C thread");
		}
	}

	public static void main(String[] args) {
		MethodRefByDoubleColon2 mr = new MethodRefByDoubleColon2();
		Runnable r = mr::m;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 103; i++) {
			System.out.println("M thread");
		}
	}
}
