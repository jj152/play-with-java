package innerClassExamples;

public class ShadowDeclaration {
	public int x = 0;
	class FirstLevel {
		public int x = 1;
		void methodInFirstLevel(int x) {
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			System.out.println("ShadowTest.this.x = " + ShadowDeclaration.this.x);
		}
	}
	public static void main(String... args) {
		ShadowDeclaration.FirstLevel fl = new ShadowDeclaration().new FirstLevel();
		fl.methodInFirstLevel(23);
	}
}