package collectionExamples;

//Java program to reverse a linked list without pointer
//manipulation

class Node {
	int value;
	Node next;

	Node(int val)
	{
		value = val;
		next = null;
	}
}

public class LinkedList {
	Node head;

	// this function returns the Node which is at a
	// particular index.
	// (The index is passed as the argument)
	private Node fetchNode(int index)
	{
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// this function returns the size of linked list
	int getSize(Node head)
	{
		Node temp = head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	// function to reverse the linked list
	void reverse()
	{
		int l = 0;
		int r = getSize(this.head) - 1;
		while (l < r) {
			Node leftSideNode = fetchNode(l);
			Node rightSideNode = fetchNode(r);

			int t = leftSideNode.value;
			leftSideNode.value = rightSideNode.value;
			rightSideNode.value = t;

			l++;
			r--;
		}
	}

	// function that prints the elements of linked list
	void printLinkedList()
	{
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// Driver code
	public static void main(String[] args)
	{
		LinkedList list1 = new LinkedList();
		list1.head = new Node(1);
		list1.head.next = new Node(2);
		list1.head.next.next = new Node(3);
		list1.head.next.next.next = new Node(4);
		list1.head.next.next.next.next = new Node(5);

		System.out.println("Linked List Before Reversal: ");
		list1.printLinkedList();

		list1.reverse();

		System.out.println("Linked List After Reversal: ");
		list1.printLinkedList();
	}
}
