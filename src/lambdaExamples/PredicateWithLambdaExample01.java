package lambdaExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*We have a class person and using that person list we want to implement a search criteria where we want to search and print 
the list of drivers (age >= 16), of voters (age >= 18) and senior citizens (age >= 60). 
We'll use the inbuilt functional interface Predicate to set up the search criteria. 
Note that we don’t need to explicitly write the Predicate interface as it is already available, 
we just need to import it from java.util.function package.
*/

public class PredicateWithLambdaExample01 {
	public static void main(String args[]){
		List<PersonPWLE01> personList = createList();		
		
	    Predicate<PersonPWLE01> allDrivers = p -> p.getAge() >= 16; // For age >= 16	    
	    // calling method to list drivers, passing predicate as arg
	    new ListPerson().listDrivers(personList, allDrivers);
	    
	    
	    Predicate<PersonPWLE01> allVoters = p -> p.getAge() >= 18; // For age >= 18
	    // calling method to list voters, passing predicate as arg 
	    new ListPerson().listVoters(personList, allVoters);	    
	    
		/* if we were using anonymous classes to write these search criteria we would
		 * have done the same chore of taking new instance of interface Predicate and
		 * overriding the test method for each search criteria. The anonymous class
		 * implementation for getting the list of senior citizens would have looked like this instead of the commented line. */	   
	    new ListPerson().listSeniorCitizens(personList, new Predicate<PersonPWLE01>(){
	    	   @Override
	    	   public boolean test(PersonPWLE01 p){
	    	       return p.getAge() >=60;
	    	   }
    	});
	    //Predicate<PersonPWLE01> allSeniorCitizens = p -> p.getAge() >= 60;   // For age >= 60
	}
	
	private static List<PersonPWLE01> createList(){
	    List<PersonPWLE01> tempList = new ArrayList<PersonPWLE01>();
	    // Constructor reference
	    PersonPWLE01 person = new PersonPWLE01("Ram","Tiwari", 50, 'M');
	    tempList.add(person);
	    person = new PersonPWLE01("Prem", "Chopra", 13, 'M');
	    tempList.add(person);
	    person = new PersonPWLE01("Tanuja", "Trivedi", 30, 'F');
	    tempList.add(person);
	    person = new PersonPWLE01("Manoj", "Sharma", 40, 'M');
	    tempList.add(person);
	    person = new PersonPWLE01("John", "Trevor", 70, 'M');
	    tempList.add(person);
	    person = new PersonPWLE01("Alicia", "Sliver", 17, 'F');
	    tempList.add(person);
	    System.out.println("List elements are - ");
	    System.out.println(tempList);
	    return tempList;
	  }

}

class ListPerson {
	  // method to list drivers
	  public void listDrivers(List<PersonPWLE01> personList, Predicate<PersonPWLE01> pred){
	    List<PersonPWLE01> driverList = new ArrayList<PersonPWLE01>();
	    for(PersonPWLE01 person : personList){
	      if (pred.test(person)){
	        driverList.add(person);    
	      }
	    }
	    System.out.println("List of drivers ");
	    printList(driverList);
	  }
	  
	// method to list voters
	  public void listVoters(List<PersonPWLE01> personList, Predicate<PersonPWLE01> pred){
	    List<PersonPWLE01> voterList = new ArrayList<PersonPWLE01>();
	    for(PersonPWLE01 person : personList){
	      if (pred.test(person)){
	        voterList.add(person);    
	      }
	    }
	    System.out.println("List of voters ");
	    printList(voterList);
	  }
	    
	  // method to list senior citizens
	  public void listSeniorCitizens(List<PersonPWLE01> personList, Predicate<PersonPWLE01> pred){
	    List<PersonPWLE01> seniorCitizenList = new ArrayList<PersonPWLE01>();
	    for(PersonPWLE01 person : personList){
	      if (pred.test(person)){
	        seniorCitizenList.add(person);    
	      }
	    }
	    System.out.println("List of senior citizens ");
	    printList(seniorCitizenList);
	  }
	  
	  // Method used for printing the lists
	  private void printList(List<PersonPWLE01> personList){
	    personList.forEach((p) -> System.out.print(" FirstName - " + p.getFirstName()  
	            + " LastName - " + p.getLastName() + " Age - " + p.getAge()));
	    System.out.println("");
	  }
}


class PersonPWLE01 {
	  private String firstName;
	  private String lastName;
	  private int age;
	  private char gender;
	  public PersonPWLE01(String firstName, String lastName, int age, char gender){
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
	    
	  public String toString(){
	    StringBuffer sb = new StringBuffer();
	    sb.append(getFirstName()).append(" ");
	    sb.append(getLastName()).append(" ");
	    sb.append(getAge()).append(" ");
	    sb.append(getGender());
	    return sb.toString();    
	  }
	}