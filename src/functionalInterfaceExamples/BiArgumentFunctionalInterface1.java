package functionalInterfaceExamples;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student2{
	String name;
	int rollno;
	public Student2(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
}

/* Use of BiFunction */
public class BiArgumentFunctionalInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student2> l = new ArrayList<Student2>();
		BiFunction<String, Integer, Student2> std = (name,rollno) -> new Student2(name,rollno);
		l.add(std.apply("a",20));
		l.add(std.apply("a1",40));
		l.add(std.apply("a2",60));
		l.add(std.apply("a3",80));
		for(Student2 s : l) {
			System.out.println("Student name - "+ s.name);
			System.out.println("Student roll - "+ s.rollno);
			System.out.println("-----------------");
		}
	}
}
