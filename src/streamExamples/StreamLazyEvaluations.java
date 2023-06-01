package streamExamples;

import java.util.Arrays;
import java.util.List;

public class StreamLazyEvaluations {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		
		//given an ordered list find the double of the first even number greater than 3.
		
		int result = 0;
	    for(int e : numbers) {
	      if(e > 3 && e % 2 == 0) {
	        result = e * 2;
	        break;
	      }
	    }
	    System.out.println(result);  //how much work? 8 units work
		
		System.out.println(
			numbers.stream()
				.filter(StreamLazyEvaluations::isGt3)
				.filter(StreamLazyEvaluations::isEvn)
				.map(StreamLazyEvaluations::dbl)
				.findFirst()
		);

	}
	
	public static boolean isGt3(int num) {
		System.out.println("isGT3 " + num);
		return num>3;
	}
	public static boolean isEvn(int num) {
		System.out.println("isEvn " + num);
		return num%2==0;
	}
	public static int dbl(int num) {
		System.out.println("dbl " + num);
		return num*2;
	}

}
