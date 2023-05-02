package lambdaExamples;

@FunctionalInterface
interface I5 {
    void print();
}

public class LambdaUdemyExample04 {
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
    	LambdaUdemyExample04 ques = new LambdaUdemyExample04();
        ques.obj1.print();
        ques.obj2.print();
    }
}
