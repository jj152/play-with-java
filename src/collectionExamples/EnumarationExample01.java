package collectionExamples;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationExample01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		for(int i = 0 ;i<10 ; i++) {
			v.add(i);
		}
		System.out.println(v);
		Enumeration<Integer> e = v.elements();
		System.out.println(e.getClass().getName());
		while(e.hasMoreElements()) {
			Integer i = e.nextElement();
			if(i%2==0) {
				System.out.println(i);
			}					
		}
		System.out.println(v);
	}
}
