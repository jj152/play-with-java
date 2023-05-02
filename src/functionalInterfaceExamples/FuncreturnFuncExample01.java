package functionalInterfaceExamples;

import java.util.function.Function;

public class FuncreturnFuncExample01 {
	
	protected static class MyMath {
        public static Integer timesTwo(Integer x) {
            return x * 2;
        }

        public static Integer timesThree(Integer x) {
            return x * 3;
        }

        public static Integer timesFour(Integer x) {
            return x * 4;
        }

        public static Function<Integer, Integer> createMultiplier(Integer y) {
            return (Integer x) -> x * y;
        }
    }

    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> () -> "Hello functional!";
        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());
        
        //Integer timesTwo1 = MyMath.timesTwo(2);
        //Integer timesThree1 = MyMath.timesThree(2);
        //Integer timesFour1 = MyMath.timesThree(2);
        //System.out.println(timesTwo1);
        //System.out.println(timesThree1);
        //System.out.println(timesFour1);

        /* Equivalent to the commented section */
        Function<Integer, Integer> timesTwo = MyMath.createMultiplier(2);
        Function<Integer, Integer> timesThree = MyMath.createMultiplier(2);
        Function<Integer, Integer> timesFour = MyMath.createMultiplier(2);       
        System.out.println(timesTwo.apply(2));
        System.out.println(timesThree.apply(3));
        System.out.println(timesFour.apply(4));
    }

}
