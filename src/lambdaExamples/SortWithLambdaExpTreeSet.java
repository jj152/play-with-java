package lambdaExamples;

import java.util.TreeSet;

public class SortWithLambdaExpTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet<Integer> al = new TreeSet<Integer>();
		TreeSet<Integer> al = new TreeSet<Integer>((a,b)-> a>b?-1:b>a?1:0);
		al.add(34);
		al.add(43);
		al.add(0);
		al.add(13);
		al.add(27);
		System.out.println(al);
	}

}
