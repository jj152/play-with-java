package streamExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(20);
		al.add(2);
		al.add(10);
		al.add(19);
		al.add(17);
		System.out.println("original list - "+ al);
		/* START :  problem statement => Filter the list with even numbers */
		// Without Streams (before java 1.8)
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for(Integer i : al) {
			if(i%2==0) {
				al1.add(i);
			}
		}
		System.out.println(al1);
		// With Streams (java 1.8 onwards)
		List<Integer> al2 = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(al2);
		/* END :  problem statement => Filter the list with even numbers */
		
		/* START :  problem statement => double all the elements */
		// Without Streams (before java 1.8)
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		for(Integer i : al) {
				al3.add(i*2);
		}
		System.out.println(al3);
		// With Streams (java 1.8 onwards)
		List<Integer> al4 = al.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(al4);
		/* END :  problem statement => Filter the list with even numbers */
		
		/* START :  problem statement => sort in ascending order */
		// With Streams (java 1.8 onwards)
		List<Integer> al5 = al.stream().sorted().collect(Collectors.toList());
		System.out.println(al5);
		/* END :  problem statement => sort in ascending order */
		
		/* START :  problem statement => sort in descending order */
		// With Streams (java 1.8 onwards)
		List<Integer> al6 = al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(al6);
		/* END :  problem statement => sort in descending order */
		
		/* START :  problem statement => find the min of the list */
		// With Streams (java 1.8 onwards)
		Integer x = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(x);
		/* END :  problem statement => find the min of the list */
		
		/* START :  problem statement => find the max of the list */
		// With Streams (java 1.8 onwards)
		Integer x1 = al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(x1);
		/* END :  problem statement => find the max of the list */
		
		/* START :  problem statement => forEach with lambda exp. */
		// With Streams (java 1.8 onwards)
		al.stream().forEach(s -> System.out.print(s));
		System.out.println();
		/* END :  problem statement => forEach with lambda exp. */
		
		/* START :  problem statement => forEach with method ref */
		// With Streams (java 1.8 onwards)
		al.stream().forEach(System.out::print);
		System.out.println();
		/* END :  problem statement => forEach with method ref */
		
		/* START :  problem statement => toArray with method ref */
		// With Streams (java 1.8 onwards)
		System.out.println("toArray() ->");
		Integer[] ar = al.stream().toArray(Integer[]::new);
		for(Integer ae : ar) {
			System.out.println(ae);
		}	
		//System.out.print("");
		System.out.println("<- toArray()");
		/* END :  problem statement => toArray with method ref */
		
		/* START :  problem statement => of method for group of values */
		// With Streams (java 1.8 onwards)
		System.out.println("of() ->");
		Stream<Integer> sr = Stream.of(9,99,999,999);
		sr.forEach(System.out::println);
		System.out.println("<- of()");
		/* END :  problem statement => of method for group of values */
		
		/* START :  problem statement => of method for array */
		// With Streams (java 1.8 onwards)
		Double[] d = {10.0,10.1,10.2,10.3};
		Stream<Double> sr1 = Stream.of(d);
		sr1.forEach(System.out::println);
		/* END :  problem statement => of method for array */
	}

}
