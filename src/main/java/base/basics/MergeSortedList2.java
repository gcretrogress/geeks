package base.basics;

public class MergeSortedList2 {
	
	static class Node {
		int data;
		Node next;
	}
	
	public static void addNodeAtTheEnd(Node n, int data) {
		// if node length is 1 add one right after
		if (n.next == null) {
			n.next = new Node();
			n.next.data = data;
			return;
		}
		
		Node curr = n;
		while (curr.next != null) {
			curr = curr.next;
		}
		
		curr.next = new Node();
		curr.next.data = data;
		return;
	}
	
	public static void printList(Node n) {
		Node tail = n.next;
		System.out.println(n.data);
		while (tail != null) {
			System.out.println(tail.data);
			tail = tail.next;
		}
	}
	
	
	
	// Merge two sorted lists
	public static void main(String [] args) {
		Node n = new Node();
		n.data = 1;

		addNodeAtTheEnd(n, 2);
		addNodeAtTheEnd(n, 3);
		addNodeAtTheEnd(n, 5);
		addNodeAtTheFront(n, 0);
		printList(n);
	}

	private static void addNodeAtTheFront(Node n, int i) {
		// TODO Auto-generated method stub
		
	}
	

}
