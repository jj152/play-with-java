/**
 * 
 */
package basicsOfJavaExamples;

import java.util.Stack;

/**
 * @author ranadip.das
 *
 * There are a number of obvious violations of this principle in the Java platform libraries. 
 * For example, a stack is not a vector, so Stack should not extend Vector. 
 * Similarly, a property list is not a hashtable, so Properties should not extend HashTable. 
 * In both cases, composition would have been preferable.
 * 
 */
public class AbuseofInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
	    stack.push("1");
	    stack.push("2");
	    stack.push("3");
	    System.out.println(stack);
	    
	    System.out.println("After squeezing me in - ");	    
	    // shows the problem of Stack allowing un-Stack-like behavior
	    stack.insertElementAt("squeeze me in!", 1);  // insertElementAt() is from Vector
	    
		System.out.println(stack);
	    
	}

}
