package lambdaExamples;

import java.util.function.UnaryOperator;

public class LambdaExample01 {
	public static void main(String[] args) {
		class test {
			final UnaryOperator<Integer> a = i -> i == 0 ? 1 : i * this.a.apply(i - 1);
		}
		System.out.println(new test().a.apply(5));
	}
}