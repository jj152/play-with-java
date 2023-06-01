package consAndMethodRefExamples;


interface InterfaceDoubleColon{
	public void m1();
}

public class MethodRefByDoubleColon1 {
	
	public static void m2() {
		System.out.println("Method Ref By Double Colon(::) ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDoubleColon i = MethodRefByDoubleColon1::m2;
		i.m1();
	}

}
