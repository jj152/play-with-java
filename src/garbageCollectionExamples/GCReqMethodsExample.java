package garbageCollectionExamples;

import java.util.Date;

public class GCReqMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long mb = 1024*1024;
		Runtime r = Runtime.getRuntime();
		System.out.println("total size - " + r.totalMemory()/mb);
		System.out.println("free size - " + r.freeMemory()/mb);
		for(int i = 0; i <= 1000000; i++) {
			@SuppressWarnings("unused")
			Date d = new Date();
			d = null;
		}
		System.out.println("free size - " + r.freeMemory()/mb);
		r.gc();
		System.out.println("free size - " + r.freeMemory()/mb);

	}

}

/* O/P - */
//total size - 184
//free size - 182
//free size - 174
//free size - 182
