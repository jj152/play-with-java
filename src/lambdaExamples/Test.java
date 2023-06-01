package lambdaExamples;

/*abstract class Greetings {
    abstract void greet(String s);
}

public class Test {
    public static void main(String[] args) {
        Greetings obj = s -> System.out.println(s.toUpperCase());
        obj.greet("Happy New Year!");
    }    
}*/

/*@FunctionalInterface
interface I4 {
     void print();
     boolean equals(Object obj);
}
 
public class Test {
     public static void main(String[] args) {
         I4 obj = () -> System.out.println("Lambda expression");
         obj.print();
     }
}*/

/*interface I1 {
	int calc(int x);
}

public class Test {
    public static void main(String[] args) {
        I1 obj = (x) -> return x*x;
    }
}
*/

/*@FunctionalInterface
interface I5 {
    void print();
}

public class Test {
    int i = 100;

    I5 obj1 = new I5() {
        int i = 200;
        public void print() {
            System.out.println(this.i);
        }
    };

    I5 obj2 = () -> {
        int i = 300;
        System.out.println(this.i);
    };

    public static void main(String[] args) {
        Test ques = new Test();
        ques.obj1.print();
        ques.obj2.print();
    }
} */

/*@FunctionalInterface
interface I7 {
     void print();
}
 
public class Test {
     String var = "Lambda";
 
     class Inner {
         int var = 1000;
         I7 obj = () -> System.out.println(this.var);
     }
 
     public static void main(String[] args) {
         Inner inner = new Test().new Inner();
         inner.obj.print();
     }
}*/

/*interface I9 {
    void print();
}

public class Test {
    public static void main(String[] args) {
        int i = 400;
        I9 obj = () -> System.out.println(i);
        obj.print();
        System.out.println(++i);
    }
}*/

/*interface I6 {
    void m6();
}

public class Test {
    public static void main(String[] args) {
        I6 obj = () ->  {
            int i = 10;
            i++;
            System.out.println(i);
        };
        obj.m6();
     }
}*/

/*interface I10 {
    void m(String s);
}

public class Test {
    public static void main(String[] args) {
        method(s -> s.toUpperCase(), "good morning!");
    }
     
   private static void method(I10 obj, String text) {
        obj.m(text);
    }
}*/

/*interface Formatter {
    public abstract String format(String s1, String s2);
}

public class Test {
    public static void main(String[] args) {
        Formatter f1 = (str1, str2) -> str1 + "_" + str2.toUpperCase();
        System.out.println(f1.format("Udayan", "Khattry"));
    }
}*/

/*interface Operator<T> {
    public abstract T operation(T t1, T t2);
}
 
public class Test {
     public static void main(String[] args) {
         Operator<String> opr1 = (s1, s2) -> s1 + s2;
         Operator<Integer> opr2 = (i1, i2) -> i1 + i2;
         opr1.operation("Hello", "World");
         opr2.operation(10, 40);
     }
}*/

/*interface Operator<T> {
    public abstract T operation(T t1, T t2);
}
 
public class Test {
     public static void main(String[] args) {
         System.out.println((s1,s2) -> {return s1+s2});
     }
}*/

/*import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
class Name {
     String first;
     String last;
 
     public Name(String first, String last) {
         this.first = first;
         this.last = last;
     }
 
     public String getFirst() {
         return first;
     }
 
     public String getLast() {
         return last;
     }
 
     public String toString() {
         return first + " " + last;
      }
}
 
public class Test {
     public static void main(String[] args) {
         List<Name> names = Arrays.asList(new Name("Peter", "Lee"), 
             new Name("John", "Smith"), new Name("bonita", "smith"));
 
         INSERT
         Collections.sort(names, (o1, o2) -> o1.getFirst().toLowerCase().compareTo(o2.getFirst().toLowerCase()));
 
         System.out.println(names);
     }
}*/

/*interface Formatter<T> {
    T format(T t);
}

public class Test {
    public static void main(String[] args) {
        System.out.println(formatString("hello", s->s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase()));
        System.out.println(formatString("hELP", s->s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase()));
    }

    private static String formatString(String str, Formatter<String> formatter) {
        return formatter.format(str);
    }
}*/

/*interface Operation<T extends Integer>{
	T operate(T x, T y);
}

public class Test {
    public static void main(String[] args) {
        Operation o1 = (x, y) -> x + y; 
        System.out.println(o1.operate(5, 10));
    }
}*/

/*interface Operation {
    int operate(int x, int y);
}

public class Test {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        Operation o1 = (x, y) -> x * y; 
        System.out.println(o1.operate(5, 10));
    }
}*/

import java.util.Arrays;

public class Test {
     public static void main(String[] args) {
         String [] arr = {"**", "***", "*", "*****", "****"};
         Arrays.sort(arr, (s1, s2) -> s1.length()-s2.length());
         for(String str : arr) {
             System.out.println(str);
         }
     }
}