package memoryManagementAndJVMExamples;

class ClassExample 
{ 
    public void doStuff() {
    	
    } 
    public void doStuff(int x) {
    	
    }
    
    public int doMoreStuff(int x) {
    	return x;
    }
} 

class ClassClassObjExample {

	public static void main(String[] args) {
		//int count = 0;
		try {
//			Class<?> c = Class.forName("ClassExample");
//			Method[] m = c.getDeclaredMethods();
//			for(Method m1 : m) {
//				count++;
//				System.out.println(m1.getName());
//			}
//			System.out.println(count);
			ClassExample ce1 = new ClassExample();
			Class<?> c1 = ce1.getClass();
			ClassExample ce2 = new ClassExample();
			Class<?> c2 = ce2.getClass();
			System.out.println(c1.hashCode());
			System.out.println(c2.hashCode());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

