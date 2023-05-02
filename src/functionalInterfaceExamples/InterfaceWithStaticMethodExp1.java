package functionalInterfaceExamples;

interface StaticInterf{
	public static void m1() {
		System.out.println("static method in interface");
	}
}

public class InterfaceWithStaticMethodExp1 implements StaticInterf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new InterfaceWithStaticMethodExp1().m1() // - cant be called as static method doesn't belong to implemented class
		StaticInterf.m1(); // static method can be called using interface name
	}

}
