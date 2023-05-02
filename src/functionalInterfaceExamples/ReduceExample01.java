package functionalInterfaceExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class ReduceExample01 {
	public static void main(String[] args) {
		Double[] intarray = { 2d, 3.0, 4.0, 5.0 };
		List<Double> l1 = new ArrayList<>(Arrays.asList(intarray));
		System.out.println(l1);	
		BinaryOperator<Double> getSum = (acc,x) -> {
			Double result = acc*x;
			System.out.println("acc: " + acc + " x: " + x + " result: "+result);
			return result;
		};		
		Optional<Double> d = l1.stream().reduce(getSum);
		System.out.println(d);
	}
}
