package innerClassExamples;

class Outer13 {
	Outer13() {
		System.out.print(2);
	}

	{
		System.out.print(1);
	}

	class Inner {
		Inner() {
			System.out.print(4);
		}

		{
			System.out.print(3);
		}
	}
}

public class InnerClassUdemyExample13 {
	public static void main(String[] args) {
		new Outer13().new Inner();
	}
}
