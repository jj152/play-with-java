package consAndMethodRefExamples;

/*@FunctionalInterface
interface I01<T>{
	Integer create(String str);
}
*/

/*@FunctionalInterface
interface I01<T extends Integer>{
	Integer create(String str);
}
*/

@FunctionalInterface
interface I01<T>{
	Integer create(String str);
}

/*@FunctionalInterface
interface I01<T extends Number>{
	Integer create(String str);
}*/

public class MethodRefUdemy12 {
    public static void main(String[] args) {
        I01<Integer> obj = Integer::new;
        System.out.println(obj.create("6013"));
    }
}
