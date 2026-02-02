package linked_Lists;

import java.util.LinkedList;

public class Deletion_Ops_In_LinkedList {

	public static void main(String[] args) {
		Node head = LinkedListUtil.createList(new int[] {1,2,3,4,5});
		int key = 3;
		head = removekeyNode(head, key); 
	//	removeHead(linkedList);
	//	removeTail(linkedList);
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
}
