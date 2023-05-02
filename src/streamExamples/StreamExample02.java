package streamExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample02 {

	public static void main(String[] args) {
		 
		List<Integer> l = Arrays.asList(1,10,20,30,15,22,12,-28,1,15,-12,15);
		
		List<Integer> l1 = l.stream().map(e->e*e).toList();
		List<Integer> evn = l.stream().filter(e->e%2==0).collect(Collectors.toList());
		double d = l.stream().map(e->e*e).mapToInt(e->e).average().getAsDouble();
		List<Integer> numWith2 = l.stream().map(e-> String.valueOf(e))
				.filter(e-> e.startsWith("2") || e.startsWith("-2")).map(Integer::valueOf).collect(Collectors.toList());
		Set<Integer> dup = l.stream().filter(e->Collections.frequency(l, e)>1).collect(Collectors.toSet());
		int max = l.stream().max(Comparator.comparing(Integer::valueOf)).get();
		int min = l.stream().min(Comparator.comparing(Integer::valueOf)).get();
		List<Integer> sal = l.stream().sorted().toList();
		List<Integer> sdl = l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		int minEle = 1;
		int maxEle = l.size();
		int limitEle = (int)((Math.random()*maxEle) + minEle);
		int firstNNumSum = l.stream().limit(limitEle).reduce((p,q)->p+q).get();
		int lastNNumSum = l.stream().skip(limitEle).reduce((p,q)->p+q).get(); //skipping first N number of elements
		int totalSum = l.stream().reduce((p,q)->p+q).get();
		//int NThLowest = l.stream().distinct().sorted().limit(limitEle).skip(limitEle-1).findFirst().get();
		int NThLowest = l.stream().distinct().sorted().skip(limitEle-1).findFirst().get();
		//int NThHighest = l.stream().distinct().sorted(Collections.reverseOrder()).limit(limitEle).skip(limitEle-1).findFirst().get();
		int NThHighest = l.stream().distinct().sorted(Collections.reverseOrder()).skip(limitEle-1).findFirst().get();
		
		System.out.println(d);
		System.out.println(l1);
		System.out.println(evn);
		System.out.println(numWith2);
		System.out.println(dup);
		System.out.println(max);
		System.out.println(min);
		System.out.println(sal);
		System.out.println(sdl);
		System.out.println(firstNNumSum);
		System.out.println("Printing sum of first "+ limitEle + " elements = " + firstNNumSum);
		System.out.println("Skipping the first "+ limitEle + " elements and Printing the sum of the remaining elements = " + lastNNumSum);
		System.out.println("total sum = " + totalSum);
		System.out.println("The "+ limitEle + "th lowest element = " + NThLowest);
		System.out.println("The "+ limitEle + "th highest element = " + NThHighest);
		
		

	}

}
