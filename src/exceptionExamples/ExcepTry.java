package exceptionExamples;

public class ExcepTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = new ExcepTry().x();
		System.out.println(x);
	}
	@SuppressWarnings("finally")
	public int x() {
		
		try {
			return 1;
			
		} catch(Exception e) {
			return 2;
			
		} finally {
			return 3;
		}	
	}

}
