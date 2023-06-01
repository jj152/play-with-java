package collectionExamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorAllMethods {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("second", 26));
		persons.add(new Person("first", 26));
		persons.add(new Person("second", 37));
		persons.add(new Person("third", 26));
		persons.add(new Person("fourth", 17));
		persons.add(new Person("second", 26));
		//persons.add(null);
		persons.sort(Comparator.nullsFirst(Comparator.comparing(Person::getAge)));
		System.out.println(persons);
		System.out.println("-------- ------ -------");
		persons.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
		System.out.println(persons);
		System.out.println("-------- ------ -------");
		persons.sort(Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getName));
		System.out.println(persons);
		System.out.println("-------- ------ -------");
		persons.sort(Comparator.comparingInt(Person::getAge).reversed().thenComparing(Person::getName));
		System.out.println(persons);
		System.out.println("-------- ------ -------");
		persons.sort(Comparator.comparing(Person::getName));
		System.out.println(persons);
		System.out.println("-------- ------ -------");
		persons.sort(Comparator.comparing(Person::getName, (s1, s2) -> {
            return s2.compareTo(s1);
        }));
		System.out.println(persons);
		System.out.println("-------- ------ -------");
		persons.sort(Comparator.<Person>naturalOrder());
		System.out.println(persons);
		System.out.println("-------- ------ -------");
		persons.sort(Comparator.<Person>reverseOrder());
		System.out.println(persons);
		System.out.println("-------- ------ -------");
	}

}

class Person  implements Comparable<Person>{
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

	@Override
	public int compareTo(Person argEmployee) {
		return name.compareTo(argEmployee.getName());
	}
}
