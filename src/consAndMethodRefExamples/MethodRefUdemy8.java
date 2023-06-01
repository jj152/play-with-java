package consAndMethodRefExamples;

interface DoubleToByte {
    byte getValue();
}

public class MethodRefUdemy8 {
    public static void main(String[] args) {
        DoubleToByte obj = new Double("123")::byteValue;
        System.out.println(obj.getValue());
    }
}
