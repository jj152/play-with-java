package innerClassExamples;

/* Method local inner class */
//public class InnerClassDemo4 {
//	
//	public void m() {
//		class Inner{
//			void sum(int x, int y) {
//				System.out.println("The sum is - " + (x+y));
//			}
//		}
//		Inner i = new Inner();
//		i.sum(10,20);
//		i.sum(101,20);
//		i.sum(1023,20);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new InnerClassDemo4().m();
//	}
//
//}

///* Inner class inside instance method vs static method - both static and non static var of outer class can be accessed */
//public class InnerClassDemo4 {
//	int x = 10;
//	static int y = 20;
//	public void m() { // instance method
//		class Inner{
//			void m1() {
//				System.out.println("x, y - " + x + ", " + y);
//			}
//		}
//		Inner i = new Inner();
//		i.m1();
//	}	
////	public static void m() { // static method - non static var of outer class can't be accessed
////		class Inner{
////			void m1() {
////				System.out.println("x, y - " + x + ", " + y);
////			}
////		}
////		Inner i = new Inner();
////		i.m1();
////	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new InnerClassDemo4().m();
//	}
//
//}

/* Accessing var of the method where method local inner class is declared */

class InnerClassDemo4 {
	public void m() {
		final int x = 132;
		class InnerX {
			public void m1() {
				System.out.println("x " + x);
			}
		}
		InnerX ix = new InnerX();
		ix.m1();
	}

	public static void main(String[] args) { // TODO Auto-generated method stub
		new InnerClassDemo4().m();
	}

}

/*
 * Accessing var of the outer class if the method(where method local inner class
 * is declared) is not static
 */
/*
 * class InnerClassDemo4 { int x = 13; static int y =14; public void m() { class
 * Inner{ public void m1() { System.out.println(x); System.out.println(y); } }
 * Inner i = new Inner(); i.m1(); } public static void main(String[] args) { //
 * TODO Auto-generated method stub new InnerClassDemo4().m(); }
 * 
 * }
 */

/*
 * Accessing var of the outer class if the method(where method local inner class
 * is declared) is static
 */
//class InnerClassDemo4 {
//	int x = 13;
//	static int y =14;
//	public static void m() { 		
//		class Inner{
//			public void m1() {
//				System.out.println(x); // Cannot make a static reference to the non-static field x
//				System.out.println(y);
//			}
//		}
//		Inner i = new Inner();
//		i.m1();
//	}	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new InnerClassDemo4().m();
//	}
//
//}

/*
 * Accessing The local var of the method(where method local inner class is
 * declared)
 */
//class InnerClassDemo4 {
//	int x = 13;
//	
//	public void m() {
//		int y =14;
//		class Inner{
//			public void m1() {
//				System.out.println(x);
//				System.out.println(y);
//			}
//		}
//		Inner i = new Inner();
//		i.m1();
//	}	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new InnerClassDemo4().m1();
//	}
//
//}
