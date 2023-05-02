package lambdaExamples;

import java.util.TreeMap;

public class SortWithLambdaExpTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>((a,b)-> a>b?-1:b>a?1:0);
		tm.put(1, "a");
		tm.put(26, "z");
		tm.put(11, "k");
		tm.put(2, "b");
		System.out.println(tm);
	}

}
