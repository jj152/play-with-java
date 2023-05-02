package lambdaExamples;

interface Operator {
    int operate(int i, int j);
}

public class LambdaUdemyExample01 {
    public static void main(String[] args) {
		/*
		 * Operator opr = new Operator() { public int operate(int i, int j) { return i +
		 * j; } };
		 */
//    	Operator opr = (int x, int y) -> {return x+y;};
//    	Operator opr = (x, y) -> {return x+y;};
//    	Operator opr = (x, y) -> return x+y;
    	Operator opr = (x, y) -> x+y;
//    	Operator opr = x, y -> x+y;
    	
        System.out.println(opr.operate(10, 20));
    }
} 
