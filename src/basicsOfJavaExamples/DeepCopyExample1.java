package basicsOfJavaExamples;

import java.util.Arrays;

public class DeepCopyExample1 {
	public static void main(String[] args) {
        int[] vals = {3, 7, 9};
        Ex1 e = new Ex1(vals);
        e.showData(); // prints out [3, 7, 9]
        vals[0] = 13;
        e.showData(); // prints out [3, 7, 9] // changes in array values will not be shown in data values.
  
        
    }
}

//code illustrating shallow copy
class Ex1 {
	private int[] data;
	
	// makes a shallow copy of values
	/*
	 * public Ex(int[] values) { data = values; }
	 */	
	
	// altered to make a deep copy of values
    public Ex1(int[] values) {
        data = new int[values.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = values[i];
        }
    }
    
	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}
