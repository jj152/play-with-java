package basicsOfJavaExamples;

class A1 {
	protected void m1() {
		System.out.println("A protected method");
	}
}

class InheritanceExample01 extends A1{
	public static void main(String[] args) {
        A1 a = new A1();
        a.m1();
        A1 a1 = new InheritanceExample01();
        a1.m1();
        InheritanceExample01 b = new InheritanceExample01();
        b.m1();
    }
}
