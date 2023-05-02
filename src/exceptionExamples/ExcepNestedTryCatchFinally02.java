package exceptionExamples;

public class ExcepNestedTryCatchFinally02 {
	public static void main(String[] args) {
		try {
				System.out.println("1");
				System.out.println("2");
				//System.out.println(10/0);
				System.out.println("3");
			try {
				System.out.println("4");
				//System.out.println("5");
				System.out.println(10/0);
				System.out.println("6");
				
			} catch(NullPointerException e) {
				System.out.println("7");
			} finally {
				System.out.println("8");
			}
			System.out.println("9");
		} catch(NullPointerException e) {
			System.out.println("10");
		} finally {
			System.out.println("11");
		}
		System.out.println("12");
	}

}
