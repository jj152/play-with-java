package exceptionExamples;

public class ExcepNestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// case 1
//		try {
//			System.out.println("outer try"); //--
//			try {
//				System.out.println("inner try"); //--
//				System.out.println(10/0);
//			} catch(ArithmeticException ae) {
//				System.out.println("inner catch"); //--
//				
//			} finally {
//				System.out.println("inner finally"); //--
//			}
//			System.out.println("outside inner try block"); //--
//			
//		} catch(Exception e) {
//			System.out.println("outer catch");
//			
//		} finally {
//			System.out.println("outer finally"); //--
//		}
//		System.out.println("outside outer try block"); //--
// case 1 o/p - 
//outer try
//inner try
//inner catch
//inner finally
//outside inner try block
//outer finally
//outside outer try block		

// case 2
		try {
			System.out.println("outer try"); //--
			try {
				System.out.println("inner try"); //--
				System.out.println(10/0);
			} catch(NullPointerException npe) {
				System.out.println("inner catch"); 
				
			} finally {
				System.out.println("inner finally"); //--
			}
			System.out.println("outside inner try block"); 
			
		} catch(Exception e) {
			System.out.println("outer catch"); //--
			
		} finally {
			System.out.println("outer finally"); //--
		}
		System.out.println("outside outer try block"); //--
// case 2 o/p -
//outer try
//inner try
//inner finally
//outer catch
//outer finally
//outside outer try block
	}	
}
