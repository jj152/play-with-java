package streamExamples;

//Java code for skip() function
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

public class StreamSkipExample{
    
  // Function to skip the elements of stream upto given range, i.e, 3
  public static Stream<String> skip_func(Stream<String> ss, int range){
      return ss.skip(range);
  }
    
  // Driver code
  public static void main(String[] args){
        
      // list to save stream of strings
      List<String> arr = new ArrayList<>();
        
      arr.add("geeks");
      arr.add("for");
      arr.add("geeks");
      arr.add("computer");
      arr.add("science");
        
      // calling function to skip the elements to range 3
      arr.stream().skip(3).forEach(System.out::println);
      
      arr.stream().skip(3).forEach(s-> System.out.println(s));
  }
}

/*
Difference between limit() and skip() :

1. The limit() method returns a reduced stream of first N elements but skip() method returns a stream of remaining elements after skipping 
first N elements.

2. limit() is a short-circuiting stateful intermediate operation i.e, when processed with an infinite input, it may produce a finite 
stream as a result without processing the entire input but skip() is a stateful intermediate operation i.e, it may need to process the 
entire input before producing a result.

*/