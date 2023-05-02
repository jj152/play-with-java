package lambdaExamples;

interface I9 {
    void print();
}

public class LambdaUdemyExample06 {
    public static void main(String[] args) {
        int i = 400;
        //I9 obj = () -> System.out.println(i);
        //obj.print();
        System.out.println(++i);
    }
}