package functionalInterfaceExamples;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* Use of Predicate, Function and Consumer together - print the name, marks and grade of the student scored more than 80*/
public class PredefinedFunctionalInterface11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> l = new ArrayList<Student>();
		populate(l);
		Predicate<Student> p = s -> s.marks>60;
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
		Consumer<Student> c = s -> {
			System.out.println("Name - " + s.name + " Marks - " + s.marks + " Grade - " + f.apply(s));
		};
		for(Student s : l) {
			if(p.test(s))
				c.accept(s);
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
