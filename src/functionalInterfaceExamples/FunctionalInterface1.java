package functionalInterfaceExamples;

@FunctionalInterface
public interface FunctionalInterface1 {
	public void m1();
	//public void m4();
	public static void m2() {
		
	}
	default void m3() {
		
	}
}
