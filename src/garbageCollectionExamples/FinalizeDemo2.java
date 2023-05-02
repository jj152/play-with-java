package garbageCollectionExamples;

public class FinalizeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeDemo1 s1 = new FinalizeDemo1();
		s1.finalize();
		s1.finalize();
		s1 = null;
		System.gc();
		System.out.println("end of main");

	}
	public void finalize() {
		System.out.println("in finalize");
	}

}
