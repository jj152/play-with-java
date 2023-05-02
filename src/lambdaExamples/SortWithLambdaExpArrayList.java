package lambdaExamples;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.Comparator;

public class SortWithLambdaExpArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(34);
		al.add(43);
		al.add(0);
		al.add(13);
		al.add(27);
		System.out.println(al);
		Comparator<Integer> cmp = (a,b)-> a>b?-1:b>a?1:0;
		Collections.sort(al, cmp);
		//Collections.sort(al, (a,b)-> a>b?-1:b>a?1:0);
		System.out.println(al); 
	}

}
