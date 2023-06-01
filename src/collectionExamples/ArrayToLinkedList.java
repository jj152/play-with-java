package collectionExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class ArrayToLinkedList {
	
	public static void main(String[] args)
    {
		// Create a string Array
	    String[] strArr = { "A", "B", "C", "D", "E" };
	    System.out.println("The i/p array : ");
	    for(String s:strArr)
	    	System.out.println(s);
	    
	    
	    List<String> strList = Arrays.asList(strArr);
	    
	    LinkedList<String> llt = new LinkedList<String>(strList);
	    System.out.println("Converted LinkedList : "+ llt);
	    
	    
	    llt = new LinkedList<String>();
        Collections.addAll(llt, strArr);
        System.out.println("Converted LinkedList : "+llt);
    }

}
