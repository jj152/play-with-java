package lambdaExamples;

interface Interf12{
	public void m1();
}

public class InnerClassWithLambdaExp4 {
	int x =12;
	public void m2() {
		int y = 100; // by default final
		Interf12 i = () -> {
			x = 99;
			System.out.println(x); 
			//y = 30;
			System.out.println(y); 
		};
		
		i.m1();
	}
	public static void main(String[] args) {
		new InnerClassWithLambdaExp4().m2();
	}
}
