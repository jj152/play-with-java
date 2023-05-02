package functionalInterfaceExamples;

interface Interf1 {
	public void m2();
}

interface Interf2 {
	public void add(int a, int b);
}

interface Interf3 {
	public int getLen(String s);
}

interface Interf4 {
	public int sqr(int x);
	default void hi() {
		System.out.println("hi");
	}
}

public class LambdaByFuncInterfaceExm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Interf1 i = ()-> System.out.println("m2 implemented");
//		i.m2();
		
//		Interf2 i = (a,b)-> System.out.println(a+b);
//		i.add(10,20);
		
		//Interf3 i = (s)-> {s.length();};
		//Interf3 i = (s)-> s.length();
//		Interf3 i = s-> s.length();
//		System.out.println(i.getLen("hello"));
		
		Interf4 i = x-> x*x;
		System.out.println(i.sqr(10));
	}

}
