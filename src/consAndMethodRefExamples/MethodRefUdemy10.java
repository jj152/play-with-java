package consAndMethodRefExamples;


interface I10 {
    void print(Object obj);
}

interface MyInf{
	String s(String s,int i);
}

public class MethodRefUdemy10 {
    public static void main(String[] args) {
        I10 obj = System.out::println;
        obj.print("Hello World!");
        MyInf m = (str, index) -> str.substring(index);
    }
}