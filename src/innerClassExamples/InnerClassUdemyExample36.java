package innerClassExamples;

class Outer36 {
    abstract static class Animal { //Line 2
        abstract void eat();
    }

    static class Dog extends Animal { //Line 6
        void eat() { //Line 7
            System.out.println("Dog eats biscuits");
        }
    }
}

public class InnerClassUdemyExample36 {
    public static void main(String[] args) {
    	Outer36.Animal animal = new Outer36.Dog(); //Line 15
        animal.eat();
    }
}