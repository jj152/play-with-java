package functionalInterfaceExamples;

import java.util.Date;
import java.util.function.Supplier;

/* Use of Supplier */
public class PredefinedFunctionalInterface13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> s = ()-> new Date();
		System.out.println(s.get());
		
		Supplier<String> s1 = () -> {
			String[] names = {"a","b","c","d"};
			return names[(int)(Math.random()*4)];
		};
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		
		Supplier<String> s3 = () -> {
			String otp = "";			
			for(int i = 0; i<6; i++) {
				otp = otp + (int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(s3.get());
		System.out.println(s3.get());
		System.out.println(s3.get());
		System.out.println(s3.get());
		System.out.println(s3.get());
	}
}
