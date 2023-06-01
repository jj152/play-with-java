package collectionExamples;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

//Java program to find out the least value element in a TreeSet
class TreeSetLeastValueElement {

	// Main driver method
	public static void main(String[] args) {

		// Implementing sorting functionality with TreeSet
		// by implementing Comparator and
		// calling (MySort) from TreeSet constructor

		// Creating an object of Treeset
		// where object type is Element
		TreeSet<Element> Tree = new TreeSet<Element>(new MySort());

		// Adding elements to adobe object of TreeSet
		// Custom inputs
		Tree.add(new Element("A", 36778));
		Tree.add(new Element("B", 456456));
		Tree.add(new Element("C", 76433));
		Tree.add(new Element("D", 4564));

		// Printing first element of above created TreeSet
		// which will be least value among all elements
		System.out.println("Least value =>" + Tree.first());
	}
}

// comparator holds the sorting logic
class MySort implements Comparator<Element> {

	@Override
	// Overriding
	// To provide the sorting logic to below created TreeSet
	// in main() method using compare() method
	public int compare(Element e1, Element e2) {
		// Condition check
		// Comparing values of element
		if (e1.getvalue() > e2.getvalue()) {

			// If condition holds true
			return 1;
		} else {

			// If condition is false
			return -1;
		}
	}
}

// key for TreeSet --> Name
class Element {

	// Member variables of this class
	private String name;
	private int value;

	// Constructor of this class
	public Element(String n, int s) {
		// Referring to same object
		// using this keyword
		this.name = n;
		this.value = s;
	}

	// key--> Name
	// Using name as a key for TreeSet
	public String getname() {
		return name;
	}

	// Return value for the given key(name)
	public int getvalue() {
		return value;
	}

	// Format in which output is returned
	public String toString() {
		return "element: " + this.name + ", value: " + this.value;
	}
}
