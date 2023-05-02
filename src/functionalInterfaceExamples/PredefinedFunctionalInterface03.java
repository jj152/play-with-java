package functionalInterfaceExamples;

import java.util.ArrayList;
import java.util.function.Predicate;

/* Find the names start with "R" */
//public class PredefinedFunctionalInterface3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String[] names = {"Ranadip", "Ritban", "Santwana", "Koyel", "Ranen"};
//		Predicate<String> startsWithR = s -> s.charAt(0) == 'R';
//		System.out.println("names start with R - ");
//		for(String s : names) {
//			if(startsWithR.test(s)) {
//				System.out.println(s);
//			}
//		}
//	}
//
//}

/* Remove null and empty string */
public class PredefinedFunctionalInterface03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {null, "", "Ranadip", "Ritban", null, "Santwana", "Koyel", "Ranen"};
		Predicate<String> nullVal = s -> s!=null && s.length()!=0;
		ArrayList<String> l = new ArrayList<String>();
		System.out.println("The list of valid names - ");
		for(String s : names) {
			if(nullVal.test(s)) {
				l.add(s);
			}
		}
		System.out.println(l);
		System.out.println("new length - " + l.size());
	}

}
