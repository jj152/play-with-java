package garbageCollectionExamples;

public class FinalizeDemo4 {
	static int i = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i< 1000000; i++) {
			@SuppressWarnings("unused")
			FinalizeDemo4 fd4 = new FinalizeDemo4();
			fd4 = null;
		}
	}
	public void finalize() {
		System.out.println("in finalize - " + ++i );
	}
}
