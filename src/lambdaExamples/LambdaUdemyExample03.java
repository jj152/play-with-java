package lambdaExamples;

@FunctionalInterface
interface I4 {
	void print();
    //boolean equals(Object obj);
}

interface I2 {
    int calc(int x);
}

/*
 * @FunctionalInterface interface I8 { boolean equals(Object obj); }
 */

public class LambdaUdemyExample03 {
    public static void main(String[] args) {
        I4 obj = () -> System.out.println("Lambda expression");
        //obj.print();
        I2 obj4 = (x) -> x*x;
    }
}