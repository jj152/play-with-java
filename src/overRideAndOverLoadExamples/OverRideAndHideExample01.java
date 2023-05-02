package overRideAndOverLoadExamples;

class OverRideAndHideExample01 {
	OverRideAndHideExample01() {
		greeting();
		prints();
	}

	void greeting() {
		System.out.println("instance method from A");
	}

	static void prints() {
		System.out.println("Static method from A");
	}

	public static void main(String[] args) {
		new B();
	}
}

class B extends OverRideAndHideExample01 {
	B() {
		/*
		 * Compiler will automatically insert calls to no-args A's constructor using
		 * super();
		 */
		greeting();
		prints();
	}

	void greeting() {
		System.out.println("instance method from B");
	}

	static void prints() {
		System.out.println("Static method from B");
	}
}
