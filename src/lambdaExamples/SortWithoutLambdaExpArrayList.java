package lambdaExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyCompartor implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1>o2?-1:o2>o1?1:0;
	}
	
}

public class SortWithoutLambdaExpArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(34);
		al.add(43);
		al.add(0);
		al.add(13);
		al.add(27);
		//Collections.sort(al);
		Collections.sort(al, new MyCompartor());
		System.out.println(al);
	}

}
