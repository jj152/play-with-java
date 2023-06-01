package lambdaExamples;

import java.util.Arrays;
import java.util.List;

public class FunctionComposition {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		int result = 0;
		
		// Imperative style coding
		for(int e : numbers) {
			if(e%2 == 0)
			result += e*2;
		}
		System.out.println("result - " + result);
		
		// Declarative style coding
		System.out.println(
			numbers.stream()
				.filter(e -> e%2 == 0)
				.map(e -> e*2)
				.reduce(0,(total,e) -> Integer.sum(total,e))
		);
		
		// Declarative style coding
		// more precise than the previous one
		System.out.println(
			numbers.stream()
				.filter(e -> e%2 == 0)
				.mapToInt(e -> e*2)
				.sum()
		);

	}

}
