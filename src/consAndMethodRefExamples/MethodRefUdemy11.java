package consAndMethodRefExamples;

interface Printable {
    void print(Printer1 p1, Printer1 p2);
}

class Printer1 {
    public static void print(Printer1 p1, Printer1 p2) {
        System.out.println(p1.toString() + "$$" + p2.toString());
    }

    public void print(Printer1 p) {
        System.out.println(p.toString());
    }

        public String toString() {
            return "Hello";
    }
}

public class MethodRefUdemy11 {
    public static void main(String[] args) {
		
//		  Printable obj = Printer1::print; 
//		  obj.print(new Printer1(), new Printer1());
		 
    }
}
