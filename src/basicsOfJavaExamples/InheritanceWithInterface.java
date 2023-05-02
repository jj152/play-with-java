package basicsOfJavaExamples;

interface I1 {
	public abstract void m1();

}

interface I2 {
	public abstract void m1();
}

interface Inter extends I1, I2 {
	public void m1();
	public void m2();

}

abstract class C implements Inter{
	public void m1(){};
}

class D extends C{
	public void m2() {
		
	}
//	C c = new C();
//	C c = new C();
	D d = new D();

}

public class InheritanceWithInterface extends D {	
	InheritanceWithInterface e = new InheritanceWithInterface();
	D d = new D();
	D d1 = new InheritanceWithInterface();
}
