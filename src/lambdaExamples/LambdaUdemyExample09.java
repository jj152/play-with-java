package lambdaExamples;

interface Formatter {
    public abstract String format(String s1, String s2);
}

public class LambdaUdemyExample09 {
    public static void main(String[] args) {
        Formatter f1 = (str1, str2) -> str1 + "_" + str2.toUpperCase();
        System.out.println(f1.format("Udayan", "Khattry"));
    }
}
