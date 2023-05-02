package functionalInterfaceExamples;

import java.util.function.Predicate;

/* isEqual static method usage */
class Employee1{
	String name;
	String designation;
	double salary;
	String city;
	public Employee1(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	public String toString() {
		String s = String.format("(%s,%s,%.2f,%s)",name,designation,salary,city);
		return s;		
	}
	public boolean equals(Object o) {		
		Employee1 emp = (Employee1)o;
		if(designation.equals(emp.designation)) {
			return true;
		} else {
			return false;
		}		
	}
}

public class PredefinedFunctionalInterface07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Predicate<Employee1> isCeo = Predicate.isEqual(new Employee1("ceo", "ceo", 20, "kol"));
		Employee1 e1 = new Employee1("x", "ceo", 2000000, "kol");
		Employee1 e2 = new Employee1("y", "coo", 2000000, "pun");
		System.out.println(isCeo.test(e1));
		System.out.println(isCeo.test(e2));
	}
}
