package functionalInterfaceExamples;

import java.util.ArrayList;
import java.util.function.Function;

class Student{
	String name;	
	int marks ;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}


/* Use of Function */
public class PredefinedFunctionalInterface09 {
	public static void main(String[] args) {
		ArrayList<Student> l = new ArrayList<Student>();
		Function<Student,String> f = s ->{
			if(s.marks>80) {
				return "A";
			} else if(s.marks>60) {
				return "B";
			} if(s.marks>40) {
				return "C";
			} if(s.marks>20) {
				return "D";
			} else
				return "F";
		};
		populate(l);
		for(Student s : l) {
			System.out.println("Name - " + s.name + " Marks - " + s.marks + " Grade - " + f.apply(s));
		}
	}
	
	public static void populate(ArrayList<Student> std) {
		std.add(new Student("a",20));
		std.add(new Student("a1",40));
		std.add(new Student("a2",60));
		std.add(new Student("a3",80));
		std.add(new Student("a4",100));
	}

}
