package consMethodRefByColonExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
class Student {
     private String name;
     private int age;
 
     public Student(String name, int age) {
         this.name = name;
         this.age = age;
     }
 
     public String toString() {
         return "Student (" + name + ", " + age + ")";
     }
 
     public static int compareByAge(Student s1, Student s2) {
         return s1.age - s2.age;
     }
}
 
public class MethodRefUdemy13 {
     public static void main(String[] args) {
         List<Student> students = new ArrayList<>();
         students.add(new Student("john", 25));
         students.add(new Student("lucy", 21));
         students.add(new Student("ivy", 23));
 
         Collections.sort(students, Student::compareByAge);
 
         System.out.println(students);
     }
}
