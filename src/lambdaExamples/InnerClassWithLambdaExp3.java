package lambdaExamples;

interface Interf{
	public void m1();
}

public class InnerClassWithLambdaExp3 {
	int x =12;
	public void m2() {
//		Interf i = new Interf() {
//			int x = 9;
//			@Override
//			public void m1() {
//				// TODO Auto-generated method stub
//				System.out.println(x); // o/p - 9
//				System.out.println(this.x); // in case of inner class this refers to the current inner class object. o/p - 9
//			}
//		};
		Interf i = () -> {
			int x = 9; // this is not instance var, this is local var
			System.out.println(x); // o/p - 9
			System.out.println(this.x); // here this keyword refers to outer class member. o/p - 9
		};
		
		i.m1();
	}
	public static void main(String[] args) {
		new InnerClassWithLambdaExp3().m2();
	}
}
