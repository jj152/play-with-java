package streamExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,1,2,3,4,5);
		
		List<Integer> doubledNumbers = new ArrayList<>();
		
		// Bad coding practice. Shared(doubledNumbers is shared outside) mutability is devil's work
		numbers.stream()
			.filter(e->e%2==0)
			.map(e->e*2)
			.forEach(e -> doubledNumbers.add(e));
		
		System.out.println(doubledNumbers);
		
		// The correct way to do this
		List<Integer> doubledNumbers1 = 
			numbers.stream()
				.filter(e->e%2==0)
				.map(e->e*2)
				.collect(Collectors.toList());
			
			System.out.println(doubledNumbers1);
			

	}

}
