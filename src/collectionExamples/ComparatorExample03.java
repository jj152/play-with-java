package collectionExamples;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample03 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		TreeSet t = new TreeSet(); // If want to use Comparable class
		t.add(new EmployeeC("ravan", 2));
		t.add(new EmployeeC("dasarath", 4));
		t.add(new EmployeeC("ram", 37));
		t.add(new EmployeeC("bharat", 37));
		t.add(new EmployeeC("arya", 12));
		t.add(new EmployeeC("aryaa", 11));
		System.out.println(t); // sort Person objects based on Age, and then Name (when two person has same age)		
		TreeSet t1 = new TreeSet(new EmployeeComparator()); // If want to use Comparator class
		t1.add(new EmployeeC("ravan", 2));
		t1.add(new EmployeeC("dasarath", 4));
		t1.add(new EmployeeC("ram", 37));
		t1.add(new EmployeeC("bharat", 37));
		t1.add(new EmployeeC("arya", 12));
		t1.add(new EmployeeC("aryaa", 11));
		System.out.println(t1); // sort Person objects based on Age, and then Name (when two person has same age)
	}
}

@SuppressWarnings("rawtypes")
class EmployeeC implements Comparable {
	String name;
	int age;
	public EmployeeC(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return age + " - " + name;
	}
	@Override
	public int compareTo(Object o) {
		int age1 = this.age;
		String name1 = this.name;
		EmployeeC ec = (EmployeeC) o;
		int age2 = ec.age;
		String name2 = ec.name;
		if (age1 < age2)
			return -1;
		else if (age1 > age2)
			return 1;
		else
			return name2.compareToIgnoreCase(name1);
	}
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
}

class EmployeeComparator implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		EmployeeC ec1 = (EmployeeC) o1;
		int age1 = ec1.age;
		String name1 = ec1.name;
		EmployeeC ec2 = (EmployeeC) o2;
		int age2 = ec2.age;
		String name2 = ec2.name;
		if (age1 < age2)
			return -1;
		else if (age1 > age2)
			return 1;
		else
			return name2.compareToIgnoreCase(name1);
	}
}
