package exceptionExamples;

public class StackOverflowErrorExample01 {	
	private int fibonacci(int position)
    {		
		if (position <= 1) { // to prevent the program to go inside infinite loop and and throw StackOverflowError
            return position;
        }
        return fibonacci(position - 1) + fibonacci(position - 2);
    }	
	public static void main(String[] args) {
		StackOverflowErrorExample01 s = new StackOverflowErrorExample01();
		System.out.println(s.fibonacci(6));		
	}
}
