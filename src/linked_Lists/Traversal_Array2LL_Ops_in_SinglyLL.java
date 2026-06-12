package linked_Lists;

class Node {
	int data;
	Node next;
	
	Node(int value, Node next){
		this.data = value;
		this.next = next;
	}
	
	Node(int value){
		this.data = value;
		this.next = null;
	}

    public static Node createList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        return head;
    }   
}

public class Traversal_Array2LL_Ops_in_SinglyLL {
	
	public static void main(String[] args) {
		int[] arr = {5,9,4,7,6,52,42};
		int key = 7;
		
		
		// To convert an array to a Linked List
		
		Node head = new Node(arr[0]); // Take the Node Head After Creating the Class and Node
		Node mover = head; 			  // Take the mover to move around the next memory address
		for (int i = 1; i<arr.length; i++) {
			Node temp = new Node(arr[i]); // Assign from the 1st index 
			mover.next = temp;            // Assign next to next pointer 
			mover = temp;			      // Move to the next node
		}
		
		// To Traverse the Linked List 
		Node curr = head;             // Always take head to another variable DO NOT modify head
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println("null");
		
		
		// To find the length of Linked List
		int len = 0;
		Node cur = head;              // You'll always be given a head 
		while(cur != null) {
			len++;
			cur = cur.next;
		}
		System.out.println(len);
		
		
		// Search the key in Linked List
		System.out.println(searchKey(head, key));
	}
	
	public static boolean searchKey(Node head, int key) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key) return true;
            curr = curr.next;
        }
    return false;        
    }
}
