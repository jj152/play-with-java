package collectionExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSmallerThanAValue {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };		 
        List<Integer> list = new ArrayList<>(); 
        for (int i : arr) {
            list.add(i);
        }
        
        list.stream().filter(e->e<4).forEach(System.out::println);
        list.stream().forEach(System.out::println);

	}

}
