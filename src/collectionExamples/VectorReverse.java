package collectionExamples;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import java.util.stream.Collectors;

public class VectorReverse {

	public static void main(String[] args) {
        Vector<Integer> elements = new Vector<>();
        elements.add(4);
        elements.add(3);
        elements.add(2);
        elements.add(6);
        elements.add(7);
        System.out.print("Before sorting elements "); 
        for (Integer number : elements) {
            System.out.print(number + " ");
        }
        System.out.println();      
        
 
         
        // Sorting the vector elements in descending order - java 8
        System.out.println("After sorting elements ");
        elements.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
        
        // Sorting the vector elements in descending order - java 7
        Collections.sort(
            elements, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2)
                {
                    // Changing the order of the elements
                    return o2 - o1;
                }
            });
        System.out.print("After sorting elements ");
        for (Integer number : elements) {
            // Printing the elements
            System.out.print(number + " ");
        }
        System.out.println();

	}

}
