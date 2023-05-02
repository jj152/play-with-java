/* class inside interface */
package innerClassExamples;

interface Vehicle{
	public int getNoOfWheel();
	class DefaultVehichle implements Vehicle{ // default implementation
		@Override
		public int getNoOfWheel() {
			// TODO Auto-generated method stub
			return 2;
		}		
	}	
}

class Bus implements Vehicle{
	@Override
	public int getNoOfWheel() { // modified implementation
		// TODO Auto-generated method stub
		return 6;
	}	
}

public class InnerClassDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle.DefaultVehichle cycle = new Vehicle.DefaultVehichle();
		System.out.println(cycle.getNoOfWheel());
		
		Bus b = new Bus();
		System.out.println(b.getNoOfWheel());

	}

}
