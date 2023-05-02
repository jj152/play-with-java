package functionalInterfaceExamples;


import java.util.function.*; 
import java.util.*; 

/* Primitive version of Consumer - Every employee's salary will be increased by 500/- */

class Employee3 
{ 
 String name; 
 double salary; 
 Employee3(String name,double salary) 
{ 
this.name=name; 
 this.salary=salary; 
} 
 } 
class PrimitiveFunctionalInterface02 
{ 
public static void main(String[] args) 
{ 
ArrayList<Employee3> l= new ArrayList<Employee3>(); 
populate(l); 
ObjDoubleConsumer<Employee3> c=(e,d)->e.salary=e.salary+d; 
for(Employee3 e:l) 
{ 
c.accept(e,500.0); 
} 
for(Employee3 e:l) 
 { 
System.out.println("Employee3 Name:"+e.name); 
System.out.println("Employee3 Salary:"+e.salary); 
System.out.println(); 
} 

} 
public static void populate(ArrayList<Employee3> l) 
{ 
l.add(new Employee3("Durga",1000)); 
l.add(new Employee3("Sunny",2000)); 
l.add(new Employee3("Bunny",3000)); 
 l.add(new Employee3("Chinny",4000)); 
} 
} 

