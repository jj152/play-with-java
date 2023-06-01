package streamExamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMiscExample1 {
	static List<Employee1> employeeList = new ArrayList<Employee1>();

	public static void main(String[] args) {

		employeeList.add(new Employee1(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee1(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee1(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee1(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee1(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee1(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee1(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee1(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee1(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee1(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee1(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee1(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee1(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee1(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee1(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee1(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee1(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


		// Query 1 : How many male and female employees are there in the organization?
		method1();
		// Query 2 : Print the name of all departments in the organization?
		method2();
		// Query 3 : What is the average age of male and female employees?
		method3();
		// Query 4 : Get the details of highest paid employee in the organization?
		method4();
		// Query 5 : Get the names of all employees who have joined after 2015?
		method5();
		// Query 6 : Count the number of employees in each department?
		method6();
		// Query 7 : What is the average salary of each department?
		method7();
		// Query 8 : Get the details of youngest male employee in the product development department?
		method8();
		// Query 9 : Who has the most working experience in the organization?
		method9();
		// Query 10 : How many male and female employees are there in the sales and marketing team?
		method10();
		// Query 11 : What is the average salary of male and female employees?
		method11();
		// Query 12 : List down the names of all employees in each department?
		method12();
		// Query 13 : What is the average salary and total salary of the whole
		// organization?
		method13();
		// Query 14 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
		method14();
		// Query 15 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
		method15();		

	}

	public static void method1() {
		System.out.println("Query 1 : How many male and female employees are there in the organization? - " + 
			employeeList.stream()
				.collect(Collectors.groupingBy(Employee1::getGender,Collectors.counting()))
		);
	}	
	public static void method2() {
		System.out.println("Query 2 : Print the name of all departments in the organization? - " + 
			employeeList.stream()
				.collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.counting()))
		);
	}
	public static void method3() {
		System.out.println("Query 3 : What is the average age of male and female employees? - " + 
			employeeList.stream()
				.collect(Collectors.groupingBy(Employee1::getGender,Collectors.averagingDouble(Employee1::getAge)))
		);
	}
	public static void method4() {
		System.out.print("Query 4 : Get the details of highest paid employee in the organization? - "); 
		System.out.println(employeeList.stream()
			.collect(Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary))).get().getName()
		);		
	}
	public static void method5() {
		System.out.print("Query 5 : Get the names of all employees who have joined after 2015? - "); 
		employeeList.stream()
			.filter(e->e.getYearOfJoining()>2015).map(Employee1::getName).forEach(System.out::print);
		System.out.println();
	}
	public static void method6() {
		System.out.println("Query 6 : Count the number of employees in each department? - "+ 
		employeeList.stream()
			.collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.counting()))
		);
	}
	public static void method7() {
		System.out.println("Query 7 : What is the average salary of each department? - "+ 
		employeeList.stream()
			.collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.summingDouble(Employee1::getSalary)))
		);
	}
	public static void method8() {
		System.out.println("Query 8 : Get the details of youngest male employee in the product development department? - "+ 
		employeeList.stream()
		.filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
        .min(Comparator.comparingInt(Employee1::getAge)).get()
		);
	}
	public static void method9() {
		System.out.println("Query 9 : Who has the most working experience in the organization? - "+ 
		employeeList.stream()
			.sorted(Comparator.comparingInt(Employee1::getYearOfJoining)).findFirst().get()
		);
	}
	public static void method10() {
		System.out.println("Query 10 : How many male and female employees are there in the sales and marketing team? - "+ 
		employeeList.stream()
			.filter(e->e.getDepartment().equalsIgnoreCase("Sales And Marketing"))
			.collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()))
		);
	}
	public static void method11() {
		System.out.println("Query 11 : What is the average salary of male and female employees? - "+ 
		employeeList.stream()
			.collect(Collectors.groupingBy(Employee1::getGender,Collectors.averagingDouble(Employee1::getSalary)))
		);
	}
	public static void method12() {
		System.out.println("Query 12 : List down the names of all employees in each department? - "+ 
		employeeList.stream()
			.collect(Collectors.groupingBy(Employee1::getDepartment))
		);
	}
	public static void method13() {
		System.out.print("Query 13 : What is the average salary and total salary of the whole - ");
		DoubleSummaryStatistics employeeSalaryStatistics=
				employeeList.stream()
					.collect(Collectors.summarizingDouble(Employee1::getSalary));				         
		System.out.print("Average Salary = "+employeeSalaryStatistics.getAverage() + ", ");		         
		System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());
	}
	public static void method14() {
		System.out.print("Query 14 : Who is the oldest employee in the organization? What is his age and which department he belongs to? - age:"+ 
		employeeList.stream().max(Comparator.comparingInt(Employee1::getAge)).get().getAge());
		System.out.println(", department: "+ 
				employeeList.stream().max(Comparator.comparingInt(Employee1::getAge)).get().getDepartment());
	}
	public static void method15() {
		System.out.println(
				"Query 15 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");
		Map<Boolean, List<Employee1>> partitionEmployeesByAge=
				employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge()>25));
				         
				Set<Entry<Boolean, List<Employee1>>> entrySet = partitionEmployeesByAge.entrySet();
				         
				for (Entry<Boolean, List<Employee1>> entry : entrySet) 
				{
				    System.out.println("----------------------------");
				             
				    if (entry.getKey()) 
				    {
				        System.out.println("Employees older than 25 years :");
				    }
				    else
				    {
				        System.out.println("Employees younger than or equal to 25 years :");
				    }
				             
				    System.out.println("----------------------------");
				             
				    List<Employee1> list = entry.getValue();
				             
				    for (Employee1 e : list) 
				    {
				        System.out.println(e.getName());
				    }
				}
	}
	
}

class Employee1 {
	int id;

	String name;

	int age;

	String gender;

	String department;

	int yearOfJoining;

	double salary;

	public Employee1(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
				+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
	}
}
