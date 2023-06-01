package consAndMethodRefExamples;

interface Operator3<T> {
    T operate(T t);
}

public class MethodRefUdemy15 {
    public static void main(String[] args) {
		/* Operator3<String> opr = s -> s.toUpperCase(); */ //Line 7
        Operator3<String> opr =  String::toUpperCase;
        System.out.println(opr.operate("lamdba and method references."));
    }
}
