package functionalInterfaceExamples;

import java.util.function.Predicate;

/* Can enter inside the pub if age> 18 and not single */

class SoftwareEng{
	String name;	
	int age;
	boolean isSingle;
	
	public SoftwareEng(String name, int age, boolean isSingle) {
		this.name = name;
		this.age = age;
		this.isSingle = isSingle;
	}
	public String toString() {
		return name;
		
	}
}

public class PredefinedFunctionalInterface05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoftwareEng[] softwareEng = {new SoftwareEng("Ranadip",30,false),new SoftwareEng("bedo",30,true),new SoftwareEng("koyel",18,false)};
		Predicate<SoftwareEng> allow = se -> se.age>21 && !se.isSingle;
		System.out.println("allowed persons inside pub");
		for(SoftwareEng se : softwareEng) {
			if(allow.test(se)) {
				System.out.println(se);
			}
		}
	}
}

/* using predicate joining*/
//public class PredefinedFunctionalInterface5 {
//
//	public static void main(String[] args) {
//		SoftwareEng[] softwareEng = {new SoftwareEng("Ranadip",30,false),new SoftwareEng("bedo",30,true),new SoftwareEng("koyel",18,false)};
//		Predicate<SoftwareEng> allow = se -> se.age>21;
//		Predicate<SoftwareEng> allow1 = se -> se.isSingle;
//		System.out.println("allowed persons inside pub");
//		for(SoftwareEng se : softwareEng) {
//			m1(allow.and(allow1.negate()),se);
//		}
//	}
//	public static void m1(Predicate<SoftwareEng> p, SoftwareEng se) {
//			if(p.test(se)) {
//				System.out.println(se);
//			}		
//	}
//
//}
