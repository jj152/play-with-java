package functionalInterfaceExamples;

interface Left{
	default public void m1() {
		System.out.println("left implementation");
	}
}

interface Right{
	default public void m1() {
		System.out.println("right implementation");
	}
}

public class InterfaceWithDefaultMethodExp1 implements Left, Right{
	
//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//		Left.super.m1();
//	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Right.super.m1();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceWithDefaultMethodExp1 i = new InterfaceWithDefaultMethodExp1();
		i.m1();
	}	

}
