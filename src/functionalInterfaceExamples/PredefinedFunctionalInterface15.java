package functionalInterfaceExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/* 
Employees who are Male and age greater than 25
Employees who are Female and are Managers.
*/

enum Role {
    Employee2,
    MANAGER,
    SENIOR_MANAGER
}

enum Gender {
    MALE,
    FEMALE,
    OTHER
}

class Employee2 {
    private final String id;
    private final String name;
    private final int age;
    private final Gender gender;
    private final Role role;
    private final double salary;

    Employee2(String id, String name, int age, Gender gender, Role role, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.role = role;
        this.salary = salary;
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public int getAge() { return age; }

    public Gender getGender() { return gender; }

    public Role getRole() { return role; }

    public double getSalary() { return salary; }
    
    @Override
    public String toString() {
        return String.format("Id: %s, Name: %s, Age: %d, Gender: %s, Role: %s",
                this.id, this.name, this.age, this.gender, this.role);
    }
}

public class PredefinedFunctionalInterface15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Employee2> maleAndAgeGreaterThan25 =
                Employee2 -> Gender.MALE.equals(Employee2.getGender()) 
                    && Employee2.getAge() > 25;

        Predicate<Employee2> femaleAndManager =
                Employee2 -> Gender.FEMALE.equals(Employee2.getGender()) 
                    && Role.MANAGER.equals(Employee2.getRole());


        List<Employee2> Employee2s = new ArrayList<Employee2>();

        Employee2s.add(new Employee2("1", "Tony Stark", 23, Gender.MALE, Role.Employee2, 25000));
        Employee2s.add(new Employee2("2", "Steve Rogers", 28, Gender.MALE, Role.MANAGER, 35000));
        Employee2s.add(new Employee2("3", "Natasha Romanoff", 23, Gender.FEMALE, Role.MANAGER, 30000));
        Employee2s.add(new Employee2("4", "Wanda Maximoff", 25, Gender.FEMALE, Role.SENIOR_MANAGER, 50000));

        System.out.println("Male and age greater than 25");
        Employee2s.stream()
                .filter(maleAndAgeGreaterThan25)
                .forEach(Employee2 -> System.out.println(Employee2.toString()));

        System.out.println("\nFemale and Manager");
        Employee2s.stream()
                .filter(femaleAndManager)
                .forEach(Employee2 -> System.out.println(Employee2.toString()));
	}

}
