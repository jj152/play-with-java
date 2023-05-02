/* Interface inside Interface */
package innerClassExamples;

interface Outer{
	public void m1();
	interface innner{
		public void m2();
	}
}

class One implements Outer{
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Outer interface method");		
	}	
}

class Two implements Outer.innner{
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Inner interface method");		
	}	
}

public class InnerClassDemo9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One one = new One();
		one.m1();
		
		Two two = new Two();
		two.m2();
	}
}
