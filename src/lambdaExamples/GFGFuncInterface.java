package lambdaExamples;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.IntSummaryStatistics;

public class GFGFuncInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> operator = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		System.out.println(operator.stream().filter(i->i%2==0).mapToInt(i->i*i).sum());
		
		List<String> cities = Arrays.asList("kolkata", "bombay", "chennai", "bangalore");
		System.out.println(cities.stream().collect(Collectors.joining(" ")));
		
		String output = String.join(" ", cities);
		System.out.println(output);
		
		cities.stream().sorted().forEach(System.out::println);
		cities.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		cities.stream().sorted((a,b)->a.length()-b.length()).forEach(System.out::println);
		cities.stream().sorted((a,b)->b.length()-a.length()).forEach(System.out::println);
		
		List<List<String>> namesNested = Arrays.asList( 
			      Arrays.asList("Jeff", "Bezos"), 
			      Arrays.asList("Bill", "Gates"), 
			      Arrays.asList("Mark", "Zuckerberg"));

			    List<String> namesFlatStream = namesNested.stream()
			      .flatMap(Collection::stream)
			      .collect(Collectors.toList());
			    
			    System.out.println(namesFlatStream);
			    
			    namesFlatStream.stream()
			      .peek(System.out::println)
			      .collect(Collectors.toList());
			    
			    Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 3);

			    List<Integer> collect1 = infiniteStream
			      .skip(2)
			      .limit(5)
			      .collect(Collectors.toList());
			    
			    System.out.println(collect1);
			    
			    List<Integer> intList = Arrays.asList(2, 4, 5, 7, 8);
			    
			    System.out.println(intList.stream().allMatch(i -> i % 2 == 0));
			    System.out.println(intList.stream().anyMatch(i -> i % 2 == 0));
			    System.out.println(intList.stream().noneMatch(i -> i % 3 == 0));
			    System.out.println(intList.stream().noneMatch(i -> i % 3 != 0));
			    
			    IntSummaryStatistics stats = cities.stream().collect(Collectors.summarizingInt(x->x.toString().length()));
			    System.out.println(stats);
			    
			    List<Integer> intList1 = Arrays.asList(2, 4, 5, 6, 8);
			    Map<Boolean, List<Integer>> isEven = intList1.stream().collect(Collectors.partitioningBy(i->i % 2==0));
			    System.out.println(isEven);
			    
			    Map<Character, List<String>> groupByAlphabet = cities.stream()
			    		.collect(
			    					Collectors.groupingBy(
			    								s->s.charAt(0)
			    							)
			    				);
			    System.out.println(groupByAlphabet);
			    
			    Stream.generate(Math::random)
			      .limit(5)
			      .forEach(System.out::println);
			    
			    Stream<Integer> evenNumStream = Stream.iterate(2, i -> i * 2);
			    
			    evenNumStream
			      .limit(5)
			      .collect(Collectors.toList()).forEach(System.out::println);
			    
			    String[] words = {
			    	      "hello", 
			    	      "hi",
			    	      "bye",
			    	      "bye"
			    	    };
			    	    
			    	    try (PrintWriter pw = new PrintWriter(
			    	      Files.newBufferedWriter(Paths.get("D:\\Personal_Docz\\Study\\eclipse_workspace\\play-with-java\\src\\a.txt")))) {
			    	        Stream.of(words).forEach(pw::println);
			    	    } catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	}

}
