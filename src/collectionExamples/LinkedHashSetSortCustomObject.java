package collectionExamples;

//Java Program to sort LinkedHashSet of custom class objects using TreeSet
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class friendsMarks {

	// class field
	String name;
	String nickName;
	int marks;

	// parameterised constructor
	public friendsMarks(String name, String nickName, int marks) {
		this.name = name;
		this.nickName = nickName;
		this.marks = marks;
	}

	// getter for name
	public String getName() {
		return name;
	}

	// setter for name
	public void setName(String name) {
		this.name = name;
	}

	// getter for marks
	public int getMarks() {
		return marks;
	}

	// setter for marks
	public void setMarks(int marks) {
		this.marks = marks;
	}

	// getter for nickname
	public String getNickName() {
		return nickName;
	}

	// setter for nickname
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	// @Override toString method
	public String toString() {
		return "friendsMarks{" + "name='" + name + '\'' + ", nickName='" + nickName + '\'' + ", marks=" + marks + '}';
	}
}

// for comparing names and nick name
interface nameCompare extends Comparator<friendsMarks> {}

//for comparing marks
interface marksCompare extends Comparator<friendsMarks> {
}

public class LinkedHashSetSortCustomObject {

	public static void main(String[] args) {

		// Creating LinkedHashSet
		LinkedHashSet<friendsMarks> linkedHashSet = new LinkedHashSet<>();

		// adding elements to LinkedHashSet
		linkedHashSet.add(new friendsMarks("Raushan", "Chamgader", 99));
		linkedHashSet.add(new friendsMarks("Yashdeep", "Dopa", 95));
		linkedHashSet.add(new friendsMarks("Rupesh", "Gian", 92));
		linkedHashSet.add(new friendsMarks("Shishya", "Gorilla", 47));
		linkedHashSet.add(new friendsMarks("Sarthak", "Nagin", 78));
		linkedHashSet.add(new friendsMarks("Sonika", "Chipkali", 67));
		linkedHashSet.add(new friendsMarks("Himanshu", "Lalten", 57));

		// Creating TreeSet
		// and we have to pass Comparator object
		// of marksCompare class
		// in the TreeSet constructor
		// so that we can sort according to the marks
		TreeSet<friendsMarks> treeSet0 = new TreeSet<>(new marksCompare() {
			@Override
			public int compare(friendsMarks f1, friendsMarks f2) {
				if (f1.getMarks() > f2.getMarks()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		
		// storing elements of LinkedHashSet
		// into TreeSet by using method addAll()
		treeSet0.addAll(linkedHashSet);
		System.out.println("Sorting on the basis of marks");

		// Displaying using loop
		for (friendsMarks tree : treeSet0)
			System.out.println(tree);

		// Creating TreeSet
		// and we have to pass Comparator object
		// of nameCompare class
		// in the TreeSet constructor
		// so that we can sort according to the name
		TreeSet<friendsMarks> treeSet1 = new TreeSet<>(new nameCompare() {
				@Override
				public int compare(friendsMarks friend1, friendsMarks friend2) {
					return friend1.getName().compareTo(friend2.getName());
				}
		});

		// storing elements of LinkedHashSet
		// into TreeSet by using method addAll()
		treeSet1.addAll(linkedHashSet);

		// Displaying using loop
		System.out.println("\n\nSorting on the basis of name");
		for (friendsMarks tree : treeSet1)
			System.out.println(tree);

		// Creating TreeSet
		// and we have to pass Comparator object
		// of nickNameCompare class
		// in the TreeSet constructor
		// so that we can sort according to the nickname
		TreeSet<friendsMarks> treeSet2 = new TreeSet<>(new nameCompare(){
			@Override
			public int compare(friendsMarks friend1, friendsMarks friend2) {
				return friend1.getNickName().compareTo(friend2.getNickName());
			}
	});

		// storing elements of LinkedHashSet
		// into TreeSet by using method addAll()
		treeSet2.addAll(linkedHashSet);

		// Displaying using loop
		System.out.println("\n\nSorting on the basis of nick-name");
		for (friendsMarks tree : treeSet2)
			System.out.println(tree);
	}
}
