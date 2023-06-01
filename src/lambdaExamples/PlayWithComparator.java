package lambdaExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class PlayWithComparator {

	public static void main(String[] args) {
		Person michael = new Person("Jackson", "Michael", 51);
        Person michaelBis = new Person("Jackson", null, 51);
        Person rod = new Person("Rod", "Stewart", 71);
        Person paul = new Person("Paul", "McCartney", 74);
        Person mick = new Person("Mick", "Jagger", 73);
        Person jermaine = new Person("Jackson", "Jermaine", 61);
        Person michaelOld = new Person("Jackson", "Michael", 51);
        
        Function<Person, String> getLastName = p -> p.getLastName();      
        //Comparator<Person> cmp = getCmp(getLastName);         
        //List<Person> people = Arrays.asList(rod, mick, jermaine, michael, michaelBis,paul);
        //people.sort(cmp);
        //people.forEach(System.out::println);
        
        Function<Person, String> getFirstName = p -> p.getFirstName();
        Function<Person, Integer> getAge = p -> p.getAge();
        
        Comparator<Person> cmp = Comparator.comparing(getLastName).thenComparing(getFirstName).thenComparing(getAge);
        System.out.println("For michael and rod : "+ cmp.compare(michael, jermaine));
        
        Comparator<Person> cmpReversed = cmp.reversed();
        System.out.println("For michael and rod : "+ cmpReversed.compare(michael, jermaine));
        
        /*List<Person> people = Arrays.asList(michael,null,jermaine);
        Comparator<Person> cmpNllFst = Comparator.nullsFirst(cmp);
        people.sort(cmpNllFst);
        people.forEach(System.out::println);*/
        
        

	}
	/*private static Comparator<Person> getCmp(Function<Person, String> getLastName) {
		return new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				String lastName1 = getLastName.apply(p1);
				String lastName2 = getLastName.apply(p2);
				return lastName1.compareTo(lastName2);
			}
    	};
    };*/	

}

@FunctionalInterface
interface Comparator<T> {
	int compare(T t1, T t2);	
	
	/*static Comparator<Person> comparing(Function<Person, String> keyExtractor){
		Objects.nonNull(keyExtractor);
		return (p1,p2) -> {
			String u1 = keyExtractor.apply(p1);
			String u2 = keyExtractor.apply(p2);
			return u1.compareTo(u2);
		};		
	}*/
	
	static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<T, U> keyExtractor){
		Objects.nonNull(keyExtractor);
		return (p1,p2) -> {
			U u1 = keyExtractor.apply(p1);
			U u2 = keyExtractor.apply(p2);
			return u1.compareTo(u2);
		};		
	}
	
	default <U extends Comparable<? super U>> Comparator<T> thenComparing(Function<T, U> keyExtractor){
		Objects.nonNull(keyExtractor);
		return (p1,p2) -> {
			int cmp = this.compare(p1, p2);
			if(cmp==0) {
				Comparator<T> other = comparing(keyExtractor);
				return other.compare(p1, p2);
			}else {
				return cmp;
			}
			
		};		
	}
	
	default Comparator<T> reversed(){
		return (t1,t2) -> this.compare(t2, t1);
		
	}
	
}

class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public Person(String lastName, int age) {
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
