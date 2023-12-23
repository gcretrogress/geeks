package base.basics;

public class MergeSortedList {

	static class Node {
		int data;
		Node next;
	}
	
	// How do you define the list we have 
	// head -> Node1 -> Node2 -> null
	
	static Node newNode(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		return node;
	}
	
	static void printList(Node node) {
		while (node != null) {
			System.out.println(node.data + " ");
			node = node.next;
		}
	}
	
	// This method assumes h1.data is less than h2.data
	// if h1 is null or h2 is null it should be checked before calling
	// this method
	static Node mergeNodes(Node h1, Node h2) {
		
		if (h1 !=null && h1.next == null) {
			h1.next = h2;
			return h1;
		}
		
		// Initialize the current and next pointers
		Node curr1 = h1, next1 = h1.next;
		Node curr2 = h2, next2 = h2.next;
		
		while (next1 != null && curr2 != null) {
			// if curr2 is in between curr1 and next1
			// then do curr1->curr2->next1
			if ((curr2.data >= curr1.data) && (curr2.data <= next1.data)) {
				next2 = curr2.next;
				curr1.next = curr2;
				curr2.next = next1;
				
				// now move the curr pointers to immediate next ones
				curr1 = curr2;
				curr2 = next2;
			} else { // this matches situation where curr1 -> next1 -> curr2
				
				// If more nodes in the first list
				if (next1.next !=null) {
					next1 = next1.next;
					curr1 = curr1.next;
				}
				
				// else point the last node of first list
				// to the beginning of second list
				else {
					next1.next = curr2;
					return h1;
				}
			}
		}
		
		return h1;
	}
	
	// h1.data < h2.data
	static Node m1(Node h1, Node h2) {
		
		if (h1.next==null) {
			h1.next = h2;
			return h1;
		}
		
		Node curr1 = h1, next1 = h1.next;
		Node curr2 = h2, next2 = h2.next;
		
		while (next1 !=null && curr2 !=null) {
			// if curr1<curr2<next1 that means start node of h2 is in
			// between curr1 and next1
			if (curr2.data >= curr1.data && curr2.data <= next1.data) {
				next2 = curr2.next; // get hold of next node in curr2 before reassignment
				
				// move the pointers to the right order
				curr1.next = curr2;
				curr2.next = next1;
				
				// reset the beginging of pointers in both lists
				curr1 = curr2;
				curr2 = next2;
			} else { // curr1<next1<curr2
				if (next1.next!=null) {
					next1 = next1.next;
					curr1 = curr1.next;
				} else {
					next1.next = curr2;
					return h1;
				}
				
			}
		}
		
		return h1;
	}
	
	static Node merge(Node h1, Node h2) {
		if (h1==null) {
			return h2;
		} else if (h2==null) {
			return h1;
		}
		
		if (h1.data<h2.data) {
			return m1(h1, h2);
		} else {
			return m1(h2, h1);
		}
	}
	
	public static void main (String [] args) {
		Node head1 = newNode(1);
        head1.next = newNode(3);
        head1.next.next = newNode(5);
        
        //printList(head1);
 
        // 1->3->5 LinkedList created
 
        Node head2 = newNode(0);
        head2.next = newNode(2);
        //head2.next.next = newNode(4);
        
        //printList(head2);
        
        // 0->2->4 LinkedList created
 
        Node mergedhead = merge(head1, head2);
 
        printList(mergedhead);
	}
}
