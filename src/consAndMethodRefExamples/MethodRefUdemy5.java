package consAndMethodRefExamples;

interface Creator111<T> {
    T create();
}

class Book111 {
    public Book111() {
        System.out.println(1);
    }

    public String toString() {
        return "2";
    }
}

public class MethodRefUdemy5 {
    public static void main(String[] args) {
        Creator111<Book111> obj = Book111::new;
            obj.create().toString();
    }
}