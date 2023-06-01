package consAndMethodRefExamples;

import java.util.Arrays;
import java.util.List;

public class MethodRefDiffOptions {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//parameter as an argument to an instance method
		//passing the parameter(e.g., value) as an argument(e.g., value) to another instance method(e.g., println() of System.out class) where the target is already defined.
		numbers.forEach((Integer value) -> System.out.println(value)); 
		System.out.println("----------");
		
		//parameter as an argument to an instance method
		// more precise than the previous one
		numbers.forEach(System.out::println);
		System.out.println("----------");
		
		//parameter as an argument to a static method
		//passing the parameter(e.g., value) as an argument(e.g., value) to another static method(e.g., valueOf of String class) where the target is already defined.
		numbers.stream().map(value -> String.valueOf(value)).forEach(System.out::println);
		System.out.println("----------");
		
		//parameter as an argument to a static method
		// more precise than the previous one
		numbers.stream().map(String::valueOf).forEach(System.out::println);
		System.out.println("----------");
		
		//parameter as an target
		// The parameter has become a target to the function
		numbers.stream().map(value -> value.toString()).forEach(System.out::println);
		System.out.println("----------");
		
		// Two parameters as argument
		System.out.println(numbers.stream().reduce(0,(total,value) -> Integer.sum(total, value)));
		System.out.println("----------");
		
		// Two parameters as argument
		// more precise than the previous one
		System.out.println(numbers.stream().reduce(0,Integer::sum));
		System.out.println("----------");
		
		// Two parameters, one as target the other as an argument
		System.out.println(numbers.stream().map(String::valueOf).reduce("",(carry, e) -> carry.concat(e)));
		System.out.println("----------");
		
		// Two parameters, one as target the other as an argument
		// more precise than the previous one
		System.out.println(numbers.stream().map(String::valueOf).reduce("",String::concat));
		System.out.println("---------- xx ------------");

	}

}
