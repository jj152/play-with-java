package consMethodRefByColonExamples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
 
@FunctionalInterface
interface Printer {
    void print();
}
 
class Util {
    public static void printCurrentTime() {
        //Format to display date
        DateFormat dateFormat
            = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
 
        //Create a date object representing 
        // current date and time
        Date date = new Date();
 
        //prints the date object in above format
        System.out.println(dateFormat.format(date));
    }
}
 
public class MethodRefUdemy1 {
    public static void main(String[] args) {
        Printer creator =Util::printCurrentTime;
        creator.print();
    }
}
