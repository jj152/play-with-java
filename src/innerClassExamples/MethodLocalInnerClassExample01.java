package innerClassExamples;

public class MethodLocalInnerClassExample01 {
	public void myOutClsMtd() {
		int myVar = 2;
		class MyMtdLocInner{
			public void myInClsMtd() {
				System.out.println(myVar);
			}
		}
		new MyMtdLocInner().myInClsMtd();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MethodLocalInnerClassExample01().myOutClsMtd();
	}

}
