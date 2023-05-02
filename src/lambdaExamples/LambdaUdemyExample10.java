package lambdaExamples;

interface Operator1<T> {
    public abstract T operation(T t1, T t2);
}
 
public class LambdaUdemyExample10 {
     public static void main(String[] args) {
         Operator1<String> opr1 = (s1, s2) -> s1 + s2;
         Operator1<Integer> opr2 = (i1, i2) -> i1 + i2;
         opr1.operation("Hello", "World");
         opr2.operation(10, 40);
     }
}
