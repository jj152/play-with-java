package basicsOfJavaExamples;

/* Thumb rule for immutable class */
// Do Not Write Setters for Class
// Include All Argument Constructor
// Make Class As Final
// Use Deep Clone for Mutable Fields in the Constructor
// Return a Deep Cloned Object of Mutable Fields of Class From Getter Methods

public final class ImmutableClassExample1 {
	
	private final int id;
	private final String name;
	private final Engine engine;

	public ImmutableClassExample1(int id, String name, Engine engine) {
		this.id = id;
		this.name = name;
		// Approach 1 - not immutable
		// This is shallow copy. This is referring to the same object referred by engine(point - 1) of main class.
		// So any change(e.g., point -3) to the object by engine reference(point -1) of main class will be visible here.
		// so point -2 and point -4 give different results.
		//this.engine = engine;
		
		// Approach 2 - not immutable
		// This is deep copy. This is not referring to the same object referred by engine(point - 1) of main class.
		// So any change(e.g., point -3) to the object by engine reference(point -1) of main class will not be visible here.
		// so point -2 and point -4 give same result.
		this.engine = new Engine(engine.speed);
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public Engine getEngine() {
		return new Engine(engine.speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine = new Engine(50); // point -1
		ImmutableClassExample1 imce = new ImmutableClassExample1(1,"RD", engine);
		System.out.println(imce.id);
		System.out.println(imce.name);
		System.out.println(imce.engine.speed); // point - 2
		engine.speed = 70; // point -3
		System.out.println(imce.id);
		System.out.println(imce.name);
		System.out.println(imce.engine.speed); // point -3
	}

}

class Engine{
	int speed;

	public Engine(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
    public String toString() {
        return "Engine{" +"speed='" + speed +'}';
    }
}
