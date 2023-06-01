package streamExamples;

import java.util.*;
import static java.util.stream.Collectors.*;

public class CollectToMap {
  public static List<Person> createPeopleList() {
    return Arrays.asList(
	    new Person("Sara", Gender.FEMALE, 20),
	    new Person("Sara", Gender.FEMALE, 22),
	    new Person("Bob", Gender.MALE, 20),
	    new Person("Paula", Gender.FEMALE, 32),
	    new Person("Paul", Gender.MALE, 32),
	    new Person("Jack", Gender.MALE, 2),
	    new Person("Jack", Gender.MALE, 72),
	    new Person("Jill", Gender.FEMALE, 12)
	  );
  }

  public static void main(String[] args) {
    List<Person> people = createPeopleList();
    
    //create a Map with name and age as key, and the person as value.    
    System.out.println(
      people.stream()
            .collect(toMap(
              person -> person.getName() + "-" + person.getAge(),
              person -> person)));
  }
}

class Person {
	  private final String name;
	  private final Gender gender;
	  private final int age;
	  
	  public Person(String theName, Gender theGender, int theAge) {
	    name = theName;
	    gender = theGender;
	    age = theAge;
	  }
	  
	  public String getName() { 
	    return name; 
	  }
	  public int getAge() { 
	    return age; 
	  }
	  public Gender getGender() { return gender; }
	  
	  public String toString() {
	    return String.format("%s -- %s -- %d", name, gender, age);
	  }  
}

enum Gender { MALE, FEMALE }