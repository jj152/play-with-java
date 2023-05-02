package lambdaExamples;

interface Operation {
    int operate(int x, int y);
}

public class LambdaUdemyExample12 {
    public static void main(String[] args) {
		/*
		 * int x = 10; int y = 20;
		 */
        Operation o1 = (x, y) -> x * y; 
        System.out.println(o1.operate(5, 10));
    }
}
