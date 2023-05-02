package functionalInterfaceExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionCompositionExample02 {

	static class Employee {
		public final String name;
		public final Integer age;
		public final String jobTitle;
		public final Float salary;

		public Employee(String name, Integer age, String jobTitle, Float salary) {
			this.name = name;
			this.age = age;
			this.jobTitle = jobTitle;
			this.salary = salary;
		}
	}
	public static void main(String[] args) {
		Employee[] employeesArr = { 
			new Employee("John", 34, "developer", 80000f),
			new Employee("Hannah", 24, "developer", 95000f), 
			new Employee("Bart", 50, "sales executive", 100000f),
			new Employee("Sophie", 49, "construction worker", 40000f), 
			new Employee("Darren", 38, "writer", 50000f),
			new Employee("Nancy", 29, "developer", 75000f),
			new Employee("Bob", 29, "construction worker", 30000f), 
		};
		List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));
		Function<Employee,String> getEmpName = e -> e.name;
		Function<String, String> getReverseEmpName = str -> new StringBuilder(str).reverse().toString();
		Function<String, String> getUpperCaseEmpName = str -> str.toUpperCase();
		
		Function<Employee,String> reverseUpperCaseEmpName = getEmpName.andThen(getReverseEmpName).andThen(getUpperCaseEmpName);
		
		List<String> results = employees
				.stream()
				.map(reverseUpperCaseEmpName)
				.collect(Collectors.toList());
		System.out.println(results);
	}

}
