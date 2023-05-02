package consMethodRefByColonExamples;


interface I10 {
    void print(Object obj);
}

public class MethodRefUdemy10 {
    public static void main(String[] args) {
        I10 obj = System.out::println;
        obj.print("Hello World!");
    }
}