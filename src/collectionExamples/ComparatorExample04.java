package collectionExamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample04 {
	static class Person {
		String name;
		int age;
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "{name=" + name + ",age=" + age + '}';
		}
	}

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("second", 26));
		persons.add(new Person("first", 26));
		persons.add(new Person("second", 37));
		persons.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
		System.out.println(persons);
	}
}
