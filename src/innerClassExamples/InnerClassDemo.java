package innerClassExamples;

public class InnerClassDemo {
	// Create an array
	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];
	public InnerClassDemo() {
		for (int i = 0; i < SIZE; i++) { // fill the array with ascending integer values
			arrayOfInts[i] = i;
		}
	}
	public void printEven() {	
		DataStructureIterator iterator = this.new EvenIterator();// Print out values of even indices of the array
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
	public void print(DataStructureIterator iterator) {
		//DataStructureIterator iterator = this.new EvenIterator();// Print out values of even indices of the array
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
	interface DataStructureIterator extends java.util.Iterator<Integer> {
	}
	// Inner class implements the DataStructureIterator interface,
	// which extends the Iterator<Integer> interface
	private class EvenIterator implements DataStructureIterator {		
		private int nextIndex = 0;// Start stepping through the array from the beginning
		public boolean hasNext() {			
			return (nextIndex <= SIZE - 1);// Check if the current element is the last in the array
		}
		public Integer next() {			
			Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);// Record a value of an even index of the array			
			nextIndex += 2;// Get the next even element
			return retValue;
		}
	}
	public static void main(String s[]) {
		// Fill the array with integer values and print out only values of even indices 
		InnerClassDemo ds = new InnerClassDemo();
		ds.printEven();
	}
}
