package linked_Lists;

public class Insertion_Ops_before_In_DLL {

	public static void main(String[] args) {
		DLLNode head = DLLNode.createList(new int[] {1,2,3,4,5});
		//head = insertBeforeHeadInDLL(head);
		//head = insertBeforeTailInDLL(head);
		head = insertBeforeKthNodeInDLL(head, 1);
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	private static DLLNode insertBeforeKthNodeInDLL(DLLNode head, int pos) {
		if (head == null) return null;
		if (pos == 1) {
			DLLNode curr = new DLLNode(0,head,null);
			head.prev = curr;
			return curr;
		}
		DLLNode temp = head;
		int count = 1;
		DLLNode prev = null;
		while (temp != null) {
			if (count == pos) {
				DLLNode node = new DLLNode(0,temp,prev);
				temp.prev = node;
				prev.next = node;
				return head;
			}
			count++;
			prev = temp;
			temp = temp.next;
		}
		return head;
	}

	private static DLLNode insertBeforeTailInDLL(DLLNode head) {
		if (head == null) return null;
		DLLNode temp = head;
		DLLNode node = new DLLNode(0); 
		DLLNode prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		node.next = temp;
		node.prev = prev;
		temp.prev = node;
		prev.next = node;
		return head;
	}

	private static DLLNode insertBeforeHeadInDLL(DLLNode head) {
		DLLNode curr = new DLLNode(0,head,null);
		head.prev = curr;
		return curr;
	}

}
