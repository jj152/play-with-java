package binaryUnaryExamples;

import java.util.function.BinaryOperator;

public class BinaryOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<String> b=(s1,s2)->s1+s2; 
		System.out.println(b.apply("durga ","software")); 
	}

}
