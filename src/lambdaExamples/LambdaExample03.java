package lambdaExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample03 {
	public static void main(String[] args) {
		List<Person> personList = createList();

		// comparator implementation as anonymous class
		// and sorting the list element on the basis of first name
		Collections.sort(personList, new Comparator<Person>() {
			public int compare(Person a, Person b) {
				return a.getFirstName().compareTo(b.getFirstName());
			}
		});

		System.out.println("Sorted list with anonymous implementation");
		for (Person p : personList) {
			System.out.print(p.getFirstName() + " ");
		}

		// creating the same list again to use with lambda expression
		personList = createList();
		// Providing the comparator functional interface compare
		/// method as lambda exression
		Collections.sort(personList, (Person a, Person b) -> a.getFirstName().compareTo(b.getFirstName()));
		System.out.println("Sorted list with lambda implementation");
		// Using the new ForEach loop of Java 8
		// used with lambda expression
		personList.forEach((per) -> System.out.print(per.getFirstName() + " "));
	}

	// Utitlity method to create list
	private static List<Person> createList() {
		List<Person> tempList = new ArrayList<Person>();
		LambdaExample03Helper createObj = Person::new;
		Person person = new Person("Ram", "Tiwari", 50, 'M');
		tempList.add(person);
		person = createObj.getRef("Prem", "Chopra", 13, 'M');
		tempList.add(person);
		person = createObj.getRef("Tanuja", "Trivedi", 30, 'F');
		tempList.add(person);
		person = createObj.getRef("Manoj", "Sharma", 40, 'M');
		tempList.add(person);
		System.out.println("List elements are - ");
		System.out.println(tempList);
		return tempList;
	}
}

//Functional interface
@FunctionalInterface
interface LambdaExample03Helper {
	Person getRef(String firstName, String lastName, int age, char gender);
}

class Person {
	private String firstName;
	private String lastName;
	private int age;
	private char gender;

	Person(String firstName, String lastName, int age, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(getFirstName()).append(" ");
		sb.append(getLastName()).append(" ");
		sb.append(getAge()).append(" ");
		sb.append(getGender());
		return sb.toString();
	}
}
