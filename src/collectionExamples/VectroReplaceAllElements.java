package collectionExamples;

import java.util.Collections;
import java.util.Vector;

public class VectroReplaceAllElements {

	public static void main(String[] args) {
		// Create a vector
	      Vector<Integer> storage =new Vector<Integer>(6);
	        
	      // adding elements to the vector
	      storage.add(20);      
	      storage.add(10);
	      storage.add(30);
	      storage.add(40);
	      storage.add(60);
	      storage.add(70);
	        
	      // val to replace with 
	      int val=1;	        
	        
	      // printing the vector before replacing 
	      System.out.println("Vector before Replacing is: " + storage);
	        
	      // using Collections.fill to replace all the elements
	      Collections.fill(storage,val);
	        
	        
	      //printing the vector after replacing 
	      System.out.println("Vector after Replacing is:  " + storage);

	}

}
