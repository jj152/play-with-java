package collectionExamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class CollectionCornerCaseExample01 {

	public static void main(String[] args) {
		Comparator<String> cso = String::compareTo;
		List<String> str =List.of("ccc","bb","eeeee","a","dddd");
		var tree = new TreeSet<>(cso);
		tree.addAll(str);
		System.out.println(tree);
		tree.add("cz");
		tree.add("TTT");
		System.out.println(tree);
		var list = new ArrayList<>(str);
		System.out.println(list);
		list.sort(cso);
		System.out.println(list);
		Comparator<String> cio = String.CASE_INSENSITIVE_ORDER;
		var tree1 = new TreeSet<>(cio);
		tree1.addAll(List.of("zzz","a","MMM"));
		System.out.println(tree1);
		System.out.println(tree1.contains("mmm"));
		System.out.println(tree1.contains("MMM"));
		var hash = new HashSet<>(tree1);
		System.out.println(hash);
		System.out.println(hash.contains("mmm"));
		System.out.println(hash.contains("MMM"));
		System.out.println(hash.equals(tree1));
		System.out.println(tree1.equals(hash));
		hash.remove("MMM");
		hash.add("mmm");
		System.out.println("-----------------");
		System.out.println(hash.equals(tree1));
		System.out.println(tree1.equals(hash));
		
	}

}
