package innerClassExamples;

class RanaOuter {
    public static void m1() {
        System.out.println("Foo : m1()");
    }
 
    class RanaInner {
        public static void m1() {
            System.out.println("Bar : m1()");
        }
    }
}
 
class InnerClassUdemyExample08 {
    public static void main(String [] args) {
    	RanaOuter foo = new RanaOuter();
    	RanaOuter.RanaInner bar = foo.new RanaInner();
        bar.m1();
    }
}
