package memoryManagementAndJVMExamples;

public class ClassLoaderHeapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(String.class.getClassLoader());
//		System.out.println(Customer.class.getClassLoader());
//		System.out.println(ClassLoaderHeapExample.class.getClassLoader());
		long mb = 1024*1024;
		Runtime r = Runtime.getRuntime();
		System.out.println("heap size - " + r.maxMemory()/mb);
		System.out.println("total size - " + r.totalMemory()/mb);
		System.out.println("free size - " + r.freeMemory()/mb);
		System.out.println("consumed size - " + (r.totalMemory()/mb - r.freeMemory()/mb));

	}

}
