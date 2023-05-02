package functionalInterfaceExamples;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String name;
	String designation;
	double salary;
	String city;
	public Employee(String name, String designation, double salary, String city) {
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
		Employee emp = (Employee)o;
		if(designation.equals(emp.designation)) {
			return true;
		} else {
			return false;
		}		
	}
}

/* All Predicate cases */
public class PredefinedFunctionalInterface06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empArray = new ArrayList<Employee>();
		populate(empArray);
		Predicate<Employee> p1 = emp -> emp.designation.contains("mngr");
		System.out.println("The managers are - ");
		display(p1, empArray);
		Predicate<Employee> p2 = emp -> emp.city.contains("pun");
		System.out.println("Base location pun - ");
		display(p2, empArray);
		Predicate<Employee> p3 = emp -> emp.salary<100;
		System.out.println("Need hike if salary less than 100 - ");
		display(p3, empArray);
		System.out.println("Give pink sleep to managers from pun - ");
		display(p1.and(p2), empArray);
		System.out.println("Not managers - ");
		display(p1.negate(), empArray);
		
		Predicate<Employee> isCeo = Predicate.isEqual(new Employee("ceo", "ceo", 20, "kol"));
		Employee e1 = new Employee("x", "ceo", 2000000, "kol");
		Employee e2 = new Employee("y", "coo", 2000000, "pun");
		System.out.println(isCeo.test(e1));
		System.out.println(isCeo.test(e2));
	}
	
	public static void populate(ArrayList<Employee> emp) {
		emp.add(new Employee("a", "dev", 20, "kol"));
		emp.add(new Employee("b", "qa", 20, "pun"));
		emp.add(new Employee("c", "pm", 100, "kol"));
		emp.add(new Employee("d", "pmo", 1000, "hyd"));
		emp.add(new Employee("e", "mngr", 100000, "pun"));
		emp.add(new Employee("f", "mngr", 100000, "kol"));
		emp.add(new Employee("g", "mngr", 200000, "usa"));
	}
	public static void display(Predicate<Employee> p, ArrayList<Employee> empArray) {
		for(Employee emp : empArray) {
			if(p.test(emp)) {
				System.out.println(emp);
			}
		}
				
	}
}
