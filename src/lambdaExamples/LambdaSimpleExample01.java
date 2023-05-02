package lambdaExamples;

public class LambdaSimpleExample01 {

	public static void main(String[] args) {
		// START : Using lambda expression
		LambdaSimpleExample01Helper myFactorialFunc = (num) -> {
			int fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = i * fact;
			}
			return fact;
		};
		System.out.println("Factorial of 7 is " + myFactorialFunc.getValue(7));
		// END : Using lambda expression
		
		// START : Without using lambda expression
		LambdaSimpleExample01Helper myFactorialFunc1 = new LambdaSimpleExample01Helper() {
			@Override
			public int getValue(int num) {
				int fact = 1;
				for (int i = 1; i <= num; i++) {
					fact = i * fact;
				}
				return fact;
			}
		};
		System.out.println("Factorial of 6 is " + myFactorialFunc1.getValue(6));
		// END : Without using lambda expression
	}
}

interface LambdaSimpleExample01Helper {
	int getValue(int num);
}
