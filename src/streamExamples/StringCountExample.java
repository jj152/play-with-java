package streamExamples;

import java.util.Arrays;

public class StringCountExample {
	
	// Driver code
    public static void main(String[] args)
    {
  
        // Using count() to count the number
        // of elements in the stream and
        // Displaying the number of elements
        System.out.println(Arrays.asList(0, 2, 4, 6, 6, 8, 10, 12).stream().count());
        
        // Using count() to count the number
        // of distinct elements in the stream and
        // Displaying the number of elements
        System.out.println(Arrays.asList(0, 2, 4, 6, 6, 8, 10, 12).stream().distinct().count());
    }
}
