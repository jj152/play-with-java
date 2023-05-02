package functionalInterfaceExamples;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;

public class CustomizedComparator {
	public static void main(String[] args) {
		MyPerson ram1 = new MyPerson("Ram", "xx",29);
		MyPerson ram2 = new MyPerson("Ram", "yy",29);
		
		Function<MyPerson, String> getLastName = p->p.getLastname();
		Function<MyPerson, String> getFirstName = p->p.getFirstName();
		Function<MyPerson, Integer> getAge = p->p.getAge();
		
		// using java.util.Comparator;
		Comparator<MyPerson> cmp1 = Comparator.comparing(getLastName).thenComparing(getFirstName).thenComparing(getAge);
		System.out.println("ram and ram1 - " + cmp1.compare(ram1, ram2));
		
		// using customized Comparator(e.g., MyComparator)
		MyComparator<MyPerson> cmp = MyComparator.comparing(getLastName).thenComparing(getFirstName).thenComparing(getAge);
		System.out.println("ram and ram1 - " + cmp.compare(ram1, ram2));
		
		Comparator<String> cmp2 = Comparator.nullsLast(Comparator.naturalOrder());
		int result = cmp2.compare("Hello", null);
		System.out.println("result = " + result);
	}
}

class MyPerson {
	String lastname;
	String firstName;
	Integer age;
	public MyPerson(String lastname, String firstName, Integer age) {
		super();
		this.lastname = lastname;
		this.firstName = firstName;
		this.age = age;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}

@FunctionalInterface
interface MyComparator<T>{
	int compare(T t1, T t2);
	default MyComparator<T> reversed(){
		return (T t1, T t2) -> this.compare(t2, t1); //reverse the order instead of using minus
	}
	static <T,U extends Comparable<? super U>> MyComparator<T> comparing(Function<T,U> keyExtractor){
		Objects.requireNonNull(keyExtractor);
		return (p1,p2) -> {
			U u1 = keyExtractor.apply(p1);
			U u2 = keyExtractor.apply(p2);
			return u1.compareTo(u2);
		};
	}	
	default <U extends Comparable<? super U>> MyComparator<T> thenComparing(Function<T,U> keyExtractor){
		Objects.requireNonNull(keyExtractor);
		return (p1,p2) -> {
			int cmp = this.compare(p1, p2);
			if(cmp == 0) {
				 MyComparator<T> other = comparing(keyExtractor);
				 return other.compare(p1, p2);
			}else
				return cmp;
		};
	}
}
