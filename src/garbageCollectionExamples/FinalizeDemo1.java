package garbageCollectionExamples;

public class FinalizeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		//String s = new String("hello world");
		FinalizeDemo1 s = new FinalizeDemo1();
		s = null;
		System.gc();
		System.out.println("end of main");

	}
	public void finalize() {
		//System.out.println(10/0);
		System.out.println("in finalize");
	}
}
