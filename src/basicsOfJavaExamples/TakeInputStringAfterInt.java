package basicsOfJavaExamples;

import java.util.Scanner;

public class TakeInputStringAfterInt {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s= scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

/*
	i/p - 
	34 
	4567.56 
	Welcome to Java tutorials!
	
	0/p - 
	String: Welcome to Java tutorials!
	Double: 4567.56
	Int: 34
*/