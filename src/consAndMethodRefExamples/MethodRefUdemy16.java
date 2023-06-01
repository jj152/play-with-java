package consAndMethodRefExamples;

interface Creator16<T, R> {
    R create(T t);
}

abstract class Animal16 {
    abstract void eat();
}

class Dog16 extends Animal16 {
    private String name;
    Dog16(String name){
    	this.name=name;
    }

    void eat() {
        System.out.println(this.name +" eats biscuits.");
    }
}

public class MethodRefUdemy16 {
    public static void main(String[] args) {
        Creator16<String, Animal16> obj =  Dog16::new; //Line n1
        obj.create("Cooper"); //Line n2
    }
}
