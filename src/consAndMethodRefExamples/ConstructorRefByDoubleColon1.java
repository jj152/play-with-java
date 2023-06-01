package consAndMethodRefExamples;

class Sample {
	Sample(){
		System.out.println("inside sample cons.");
	}
}

interface SampleInterf{
	public Sample get(); // This method returns of type Sample
}

public class ConstructorRefByDoubleColon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* START - with lambda exp */
		SampleInterf si = ()->{ // lambda expression creates an obj of Sample type so that the get method can return;
			Sample s = new Sample();
			return s;
		};
		si.get();
		/* END - with lambda exp */
		
		/* START - with Constructor ref */
		SampleInterf si1 = Sample :: new;
		si1.get();
		/* END - with Constructor ref */
	}

}
