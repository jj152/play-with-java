package streamExamples;

import java.util.stream.Stream;

class Employee {
    private String name;
    private double salary;
 
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
 
    public String getName() {
        return name;
    }
 
    public double getSalary() {
        return salary;
    }
 
    public String toString() {
        return "{" + name + ", " + salary + "}";
    }
 
    public static int salaryCompare(double d1, double d2) {
        return new Double(d2).compareTo(d1);
    }
}
 
public class StreamUdemyExample32 {
    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(new Employee("Jack", 10000),
                new Employee("Lucy", 12000), new Employee("Tom", 7000));
        
        highestSalary(employees);
    }
 
    private static void highestSalary(Stream<Employee> emp) {
        System.out.println(emp.map(e -> e.getSalary()).max(Employee::salaryCompare));
    }
}
