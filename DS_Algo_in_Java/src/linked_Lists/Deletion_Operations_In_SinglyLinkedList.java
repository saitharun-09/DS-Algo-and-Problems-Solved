package linked_Lists;

import java.util.LinkedList;

public class Deletion_Operations_In_SinglyLinkedList {

	public static void main(String[] args) {
		Node head = Node.createList(new int[] {1,2,3,4,5});
		int key = 7;
		head = removekeyNode(head, key); 
	//	removeHead(linkedList);
	//	removeTail(linkedList);
		head = removeElements(head, 3);
		Node temp = head; 
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	// To Remove Head of Linked List 
	private static LinkedList<Integer> removeHead(LinkedList<Integer> linkedList) {
		if (linkedList==null) return linkedList;
		linkedList.removeFirst();
		return linkedList;
	}
	 
	private static LinkedList<Integer> removeTail(LinkedList<Integer> linkedList) {
		if (linkedList==null) return linkedList;
		linkedList.removeLast();
		// or 
		/*
		if (head == null || head.next == null) {
		        return null; // The list becomes empty after removal
		}
	   	Node temp = head;
	    	while (temp.next.next != null) {
		        temp = temp.next;
		    }
		    temp.next = null;
		    return head;
		    */
		return linkedList;
	}
	
	private static Node removekeyNode(Node head, int key) {
		if (head == null) return head;
		if (key == 1) return head.next;
		int count = 1;
        Node temp = head;
        Node prev = head;
        while (temp != null) {
            if (count == key) {
                prev.next = temp.next;
            
            }
            prev = temp;
            temp = temp.next;
            count++;
        }
		return head;
	}
	
	private static Node removeElements(Node head, int val) {
        if (head == null) return head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node temp = head; 
        Node prev = dummy ;
        while (temp != null) {
            if (temp.data == val) {
                prev.next = temp.next;
            }else prev = temp;
            temp = temp.next;
        }
        return dummy.next;
    }
}
