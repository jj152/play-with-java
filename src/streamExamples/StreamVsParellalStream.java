package streamExamples;

import java.util.Arrays;
import java.util.List;

import importantCodeSnippets.TimeIt;

public class StreamVsParellalStream {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		TimeIt.code(() ->
			System.out.println(
					numbers.stream()
					.filter(e -> e%2==0)
					.mapToInt(StreamVsParellalStream::compute)
					.sum()
			)
		);
		
		// Parallel stream
		TimeIt.code(() ->
		System.out.println(
				numbers.parallelStream()
				.filter(e -> e%2==0)
				.mapToInt(StreamVsParellalStream::compute)
				.sum()
		)
	);
	}
	public static int compute(int num) {
		try {
			//Thread.sleep(1000);
		} catch (Exception e) {

		}
		return num*2;
	}
}
