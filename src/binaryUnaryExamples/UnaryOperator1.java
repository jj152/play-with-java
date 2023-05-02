package binaryUnaryExamples;

import java.util.function.UnaryOperator;

public class UnaryOperator1 {
	public static void main(String[] args) {
		UnaryOperator<Integer> f = i -> i * i;
		System.out.println(f.apply(6));
	}
}
