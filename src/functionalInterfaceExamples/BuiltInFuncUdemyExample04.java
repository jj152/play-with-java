package functionalInterfaceExamples;

import java.util.Date;
import java.util.function.*;
 
public class BuiltInFuncUdemyExample04 {
    public static void main(String[] args) {
        //Constructor reference for Date() constructor
        Supplier<Date> obj = Date::new;
 
        //Creates an instance of Date class.
        Date date = obj.get();
        System.out.println(date);
    }
}