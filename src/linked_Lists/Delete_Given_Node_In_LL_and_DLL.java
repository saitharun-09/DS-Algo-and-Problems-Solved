package linked_Lists;

public class Delete_Given_Node_In_LL_and_DLL {

	public static void main(String[] args) {
		//Node head = Node.createList(new int[] {1,2,3,4,5});
		DLLNode head = DLLNode.createList(new int[] {1,2,3,4,5});
		//head = deleteNodeInSinglyLL(head);
		head = deleteNodeInDoublyLL(head);

	}

	private static DLLNode deleteNodeInDoublyLL(DLLNode head) {
		// Solve later - delete given node. and Node != head.
		return null;
	}

	private static Node deleteNodeInSinglyLL(Node head) {
		head.data=head.next.data;
		head.next=head.next.next; 
		return head;
	}

}
