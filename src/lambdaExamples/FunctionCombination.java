package lambdaExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FunctionCombination {

	public static void main(String[] args) {
		List<Predicate<String>> lps = Arrays.asList(s -> s != null, s -> !s.isEmpty(), s -> s.length() > 4);
		
		List<IntUnaryOperator> operator = Arrays.asList(i -> i + 1, i -> i * 2, i -> i + 3);

		Predicate<String> cmbnp = lps.stream().reduce(s -> true, Predicate::and);

		System.out.println(cmbnp.test(""));
		System.out.println(cmbnp.test(null));
		System.out.println(cmbnp.test("Java"));
		System.out.println(cmbnp.test("Hello"));

		System.out.println("------------------------");

		// equivalent of reduce function(built in)
		Predicate<String> temp = String -> true;
		for (Predicate<String> cur : lps)
			temp = temp.and(cur);

		System.out.println(temp.test(""));
		System.out.println(temp.test(null));
		System.out.println(temp.test("Java"));
		System.out.println(temp.test("Hello"));

		System.out.println("------------------------");

		Optional<IntUnaryOperator> combinedOperator = operator.stream().reduce( IntUnaryOperator::andThen); // i -> i
		System.out.println(combinedOperator.get().applyAsInt(5));
		
		System.out.println("------------------------");
		
		IntUnaryOperator combinedOperator1 = operator.stream().reduce(IntUnaryOperator.identity(), IntUnaryOperator::andThen); // i -> i
		System.out.println(combinedOperator1.applyAsInt(5));	
	}

}
