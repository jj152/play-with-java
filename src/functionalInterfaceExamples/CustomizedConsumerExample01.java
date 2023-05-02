package functionalInterfaceExamples;

// Creating customized functional interface as same as predefined interface

import java.util.ArrayList;
import java.util.List;

public class CustomizedConsumerExample01 {
	public static void main(String[] args) {
		MyConsumer<List<String>> c1 = list -> list.add("one");
		MyConsumer<List<String>> c2 = list -> list.add("two");
		MyConsumer<List<String>> c3 = c1.andThen(c2);
		List<String> strings = new ArrayList<String>();
		strings.add("zero");
		c3.accept(strings);
		System.out.println(strings);
	}
}

@FunctionalInterface
interface MyConsumer<T> {
	void accept(T t);
	default MyConsumer<T> andThen(MyConsumer<T> other) {
		return (T t) -> {
			this.accept(t);
			other.accept(t);
		};
	}
}
