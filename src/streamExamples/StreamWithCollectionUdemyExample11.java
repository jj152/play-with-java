package streamExamples;


import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
class Person {
    int id;
    String name;
 
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
 
    public String toString() {
        return "{" + id + ", " + name + "}";
    }
 
    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            Person p = (Person) obj;
            return this.id == p.id;
        }
        return false;
    }
 
    public int hashCode() {
        return new Integer(this.id).hashCode();
    }
}
 
public class StreamWithCollectionUdemyExample11 {
    public static void main(String[] args) {
        Person p1 = new Person(1010, "Sean");
        Person p2 = new Person(2843, "Rob");
        Person p3 = new Person(1111, "Lucy");
 
        Stream<Person> stream = Stream.of(p1, p2, p3);
        //Map<Integer, Person> map = stream.collect(Collectors.toMap(p -> p.id, Function.identity()));
        Map<Integer, Person> map = stream.collect(Collectors.toMap(p -> p.id, p -> p));
        System.out.println(map.size());
    }
}
