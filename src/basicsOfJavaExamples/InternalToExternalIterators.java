package basicsOfJavaExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class InternalToExternalIterators {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//external iterators
		for(int i=0; i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("----------");
		
		//external iterators
		for(int e : numbers) {
			System.out.println(e);
		}
		System.out.println("----------");
		
		//internal iterators
		numbers.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer value) {
				System.out.println(value);
				
			}
		});
		System.out.println("----------");
		
		//internal iterators
		//passing the parameter(e.g., value) as an argument(e.g., value) to another instance method(e.g., println() of System.out class) where the target is already defined.
		numbers.forEach((Integer value) -> System.out.println(value)); 
		System.out.println("----------");
		
		//internal iterators - java 8 has type inference but only for lambda expressions
		numbers.forEach((value) -> System.out.println(value));
		System.out.println("----------");
		
		//internal iterators - parentheses is optional but only for one parameter lambda
		numbers.forEach(value -> System.out.println(value));
		System.out.println("---------- xx ------------");
		
		//internal iterators - method reference
		numbers.forEach(System.out::println);
		System.out.println("---------- xx ------------");

	}

}
