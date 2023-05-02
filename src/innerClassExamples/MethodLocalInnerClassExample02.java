package innerClassExamples;

class MainClassTest1 {
	   private int x = 10;
	   public void sampleMethod() {
	      int y = 20;
			class MethodLocalInnerClassTest {
				public void accessMainClassVar() {
				   System.out.println(x);

	               // accessing the final variable 
				   System.out.println(y);
				}
			}
			MethodLocalInnerClassTest mainTest = new MethodLocalInnerClassTest();
			mainTest.accessMainClassVar();
		}
}

public class MethodLocalInnerClassExample02 {
	   public static void main(String args[]) {
	      MainClassTest1 test = new MainClassTest1();
		  test.sampleMethod();
	   }
	}