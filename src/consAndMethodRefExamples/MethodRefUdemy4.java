package consAndMethodRefExamples;

interface Creator<T> {
    T create();
}

class Book {
    public Book() {
        System.out.println(1);
    }

    public String toString() {
        return "2";
    }
}

public class MethodRefUdemy4 {
    public static void main(String[] args) {
        Creator<Book> obj = Book::new;
            obj.create().toString();
    }
}
