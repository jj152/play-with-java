package garbageCollectionExamples;

public class FinalizeDemo3 {
	
	static FinalizeDemo3 s;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FinalizeDemo3 fd = new FinalizeDemo3();
		System.out.println("hashCode 1 " + fd.hashCode());
		fd = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println("hashCode 2" + s.hashCode());
		s = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println("End of main");
	}
	public void finalize() {
		System.out.println("in finalize");
		s = this;
	}
}
