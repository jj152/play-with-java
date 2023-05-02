package exceptionExamples;

//public class ThrowExample1{
//
////	public static void main(String[] args) {
////		// TODO Auto-generated method stub
////		System.out.println(10/0);
////		System.out.println("Hello");
////	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		throw new ArithmeticException("/ by 0");
////		throw new ThrowExample1();
//	}
//	
	@SuppressWarnings("serial")
	public class ThrowExample1 extends RuntimeException{

//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			System.out.println(10/0);
//			System.out.println("Hello");
//		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			throw new ArithmeticException("/ by 0");
			throw new ThrowExample1();
		}


}
