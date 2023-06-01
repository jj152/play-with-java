package consAndMethodRefExamples;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.function.BiFunction;

class MySample {

	private int id;
	private String name;

	public MySample() {
		super();
	}

	public MySample(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MySample [id=" + id + ", name=" + name + "]";
	}

}

interface MySampleInterf {

	public MySample get();

}

interface MySampleInterf1 {

	public MySample get(int id, String name);

}

public class ConstructorRefByDoubleColon2 {

	public static void main(String[] args) {

		// Start : with constructor reference

		MySampleInterf defCons1 = MySample::new; // default cons
		MySample ms1 = defCons1.get();
		ms1.setId(new Random().nextInt());
		ms1.setName(("qwerty" + new Random().nextInt()));
		System.out.println("default cons with cons ref = " + ms1.toString());

		MySampleInterf1 paramCons1 = MySample::new;
		MySample ms2 = paramCons1.get(new Random().nextInt(), ("qwerty" + new Random().nextInt()));
		System.out.println("param cons with cons ref = " + ms2.toString());

		// End : with constructor reference

		// Start : without constructor reference

		MySampleInterf defCons2 = () -> { // default cons
			return new MySample();
		};
		MySample ms3 = defCons2.get();
		ms3.setId(new Random().nextInt());
		ms3.setName(("qwerty" + new Random().nextInt()));
		System.out.println("default cons without cons ref = " + ms3.toString());

		MySampleInterf paramCons2 = () -> { // param cons
			return new MySample(new Random().nextInt(), ("qwerty" + new Random().nextInt()));
		};
		MySample ms4 = paramCons2.get();
		System.out.println("param cons without cons ref = " + ms4.toString());

		// End : without constructor reference
	}

}
