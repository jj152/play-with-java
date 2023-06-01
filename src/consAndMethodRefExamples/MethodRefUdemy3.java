package consAndMethodRefExamples;
interface I02 {
    int f(int i, int j, int k);
}

public class MethodRefUdemy3 {
    private static int cube(int i, int j, int k) {
        return i * j * k;
    }


   public static void main(String[] args) {
        I02 obj = MethodRefUdemy3::cube;
        System.out.println(obj.f(10, 20, 30));
    }
}
