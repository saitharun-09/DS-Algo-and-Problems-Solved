package linked_Lists;

public class Delete_Middle_In_SinglyLinkedList {

	public static void main(String[] args) {
		Node head = Node.createList(new int[] {1,2,3,4,5});
		head = deleteMiddle(head);
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	public static Node deleteMiddle(Node head) {
	    if (head == null || head.next == null) return null;
	    Node slow = head;
	    Node fast = head;
	    Node prev = null;
	    while (fast != null && fast.next != null) {
	        prev = slow;
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    prev.next = slow.next;
	    return head;
	}
	
	/*
	// O(2n) equal to O(n) T.C 
	private static Node deleteMiddle(Node head) {
        if (head == null || head.next == null) return null;
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        count = (count/2)+1;
        int cnt = 1;
        curr = head;
        Node prev = null;
        while(curr != null) {
            if (cnt == count) {
                prev.next = curr.next;
            }else prev = curr;
            cnt++;
            curr = curr.next;
            
        }
        return head;
    }
    */
}
