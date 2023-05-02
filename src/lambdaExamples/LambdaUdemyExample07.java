package lambdaExamples;

interface I6 {
    void m6();
}

public class LambdaUdemyExample07 {
    public static void main(String[] args) {
        I6 obj = () ->  {
            int i = 10;
            i++;
            System.out.println(i);
        };
        obj.m6();
     }
}
