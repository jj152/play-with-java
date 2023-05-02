package streamExamples;

import java.util.*;

class Employee02 {
    private String name;
    private double salary;
 
    public Employee02(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
 
    public String getName() {
        return name;
    }
 
    public double getSalary() {
        return salary;
    }
 
    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    public String toString() {
        return "{" + name + ", " + salary + "}";
    }
}
 
public class StreamWithCollectionUdemyExample02 {
    public static void main(String[] args) {
        List<Employee02> employees = Arrays.asList(new Employee02("Jack", 10000), new Employee02("Lucy", 12000));
        employees.forEach(e -> e.setSalary(e.getSalary() + (e.getSalary() * .2)));
        employees.forEach(System.out::println);
    }
}