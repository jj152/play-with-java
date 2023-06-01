package streamExamples;

import java.util.Arrays;
import java.util.List;

public class StreamProperties {
	public static void main(String[] args) {
	    List<Integer> numbers = Arrays.asList(6,1, 2, 8, 3, 4, 5, 1, 2, 3, 4, 5);
	    
	    numbers.stream()
	           .filter(e -> e % 2 == 0 )
	           .forEach(System.out::println); //sized, ordered, non-distinct, non-sorted
	    
	    System.out.println("---- x ------");
	    
	    numbers.stream()
        .filter(e -> e % 2 == 0 )
        .distinct()
        .forEach(System.out::println); //sized, ordered, distinct, non-sorted
	    
	    System.out.println("---- x ------");
	    
	    numbers.stream()
        .filter(e -> e % 2 == 0 )
        .distinct()
        .sorted()
        .forEach(System.out::println); //sized, ordered, distinct, sorted
	    
	    System.out.println("---- x ------");
	    
	    numbers.stream()
        .filter(e -> e % 2 == 0 )
        .sorted()
        .forEach(System.out::println); //sized, ordered, non-distinct, sorted
	    
	  }

}
