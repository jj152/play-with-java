package basicsOfJavaExamples;

public class IntegerSwap {
	static class Wrapper<T> {
		T value;

		public Wrapper(T value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {
		Wrapper<Integer> first = new Wrapper<>(10);
		Wrapper<Integer> second = new Wrapper<>(20);
		swap(first, second);
		System.out.println(first.value);
		System.out.println(second.value);
	}

	static void swap(Wrapper<Integer> first, Wrapper<Integer> second) {
		Integer tmp = first.value;
		first.value = second.value;
		second.value = tmp;
	}
}
