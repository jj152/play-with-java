package collectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayList {

	public static void main(String[] args) {
		// sorting an ArrayList of object using Comparator 
		Course restWithSpring = new Course("REST with Spring", 99);
		Course restWithSpring1 = new Course("REST with Spring", 49);
		Course learnSpringSecurity = new Course("Learn Spring Security", 49);
		Course learnSpringSecurity1 = new Course("Learn Spring Security", 110); 
		Course introToSpringMVC4 = new Course("Introduction to Spring MVC 4", 0); 
		
		List<Course> listOfCourses = new ArrayList<>(); 
		listOfCourses.add(restWithSpring); 
		listOfCourses.add(restWithSpring1);  
		listOfCourses.add(learnSpringSecurity);  
		listOfCourses.add(learnSpringSecurity1); 
		listOfCourses.add(introToSpringMVC4); 
		
		// let's sort this list of course by title first using Comparator 
		Comparator<Course> titleComparator = (c1, c2) -> c1.title().compareTo(c2.title()); 
		Comparator<Course> feeComparator = (c1, c2) -> (int) (c1.fee() - c2.fee()); 
		
		// printing ArrayList before sorting 
		System.out.println("unsorted list: " + listOfCourses); 
		
		// sorting list in descending order - without using comparator. No logic to reverse so it has reversed according to the insertion order.
		Collections.reverse(listOfCourses);
		System.out.println("sorted list in descending order: " + listOfCourses);
		
		// sorting list of objects using comparator - using title on ascending order 
		listOfCourses.sort(titleComparator); 
		System.out.println("sorted list in ascending order of title: " + listOfCourses); 
		
		// sorting list of objects using comparator - using fee on ascending order 
		listOfCourses.sort(feeComparator); 
		System.out.println("sorted list in ascending order of fee: " + listOfCourses);
		
		// sorting list in descending order of title 
		listOfCourses.sort(Collections.reverseOrder(titleComparator)); 
		System.out.println("sorted list in descending order of title: " + listOfCourses); 
		
		// sorting arraylist in descending order of fee 
		listOfCourses.sort(Collections.reverseOrder(feeComparator)); 
		System.out.println("sorted list in descending order of fee: " + listOfCourses);
		
		// let's sort this list of course by title first using Comparator 
		Comparator<Course> titleComparator1 = Comparator.comparing( Course::title ); 
		Comparator<Course> feeComparator1 = Comparator.comparing( Course::fee );
		
		//Compare by first name and then last name (multiple fields)
		Comparator<Course> compareByAll = titleComparator1.thenComparing(feeComparator1);
		 
		//Use Comparator
		Collections.sort(listOfCourses, compareByAll);
		
		System.out.println("sorted list in ascending order of title and fee: " + listOfCourses);
		
		//Use Comparator
		listOfCourses.sort(compareByAll.reversed());
		
		System.out.println("sorted list in descending order of title and fee: " + listOfCourses);

	}

}

class Course {
	String title;
	long fee;

	public Course(String title, long fee) {
		this.title = title;
		this.fee = fee;
	}

	public String title() {
		return title;
	}

	public long fee() {
		return fee;
	}

	@Override
	public String toString() {
		return String.format(title + " @ " + fee);
	}
}
