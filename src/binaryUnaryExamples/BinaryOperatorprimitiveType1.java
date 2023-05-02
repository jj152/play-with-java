package binaryUnaryExamples;

import java.util.function.IntBinaryOperator;

public class BinaryOperatorprimitiveType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBinaryOperator b=(i1,i2)->i1+i2; 
		System.out.println(b.applyAsInt(10,20));
	}

}
