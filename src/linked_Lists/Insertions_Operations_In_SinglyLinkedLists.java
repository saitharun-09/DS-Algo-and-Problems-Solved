package linked_Lists;

public class Insertions_Operations_In_SinglyLinkedLists {

	public static void main(String[] args) {
		Node head = Node.createList(new int[] {1,2,3,4,5});
		int val = 0;
		//head = insertHead(head, val);
		//head = insertAtEnd(head, val);
		//head = insertAtKthPosition(head,4,val);
		head = insertBeforeGivenValue(head,5,val);
		Node curr = head; 
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

	private static Node insertBeforeGivenValue(Node head, int x, int val) {
		if (head == null) return new Node(val);
		if (head.data == x) {
			Node node = new Node(val);
			node.next = head;
			return node;
		}
		Node temp = head;
		while(temp.next != null) {
			if (temp.next.data == x) {
				Node node = new Node(val);
				node.next = temp.next;
				temp.next = node;
				return head;
			}
			temp = temp.next;
		}
		return head;
	}

	private static Node insertHead(Node head, int val) {
		Node node = new Node(val);
		node.next = head;
		return node;
	}
	
	private static Node insertAtEnd(Node head, int x) {
        if (head == null) return new Node(x);
        Node curr = head;
        Node node = new Node(x);
        node.next = null;
        while (curr.next != null) curr = curr.next;
        curr.next = node;
        return head;
    }
	
	private static Node insertAtKthPosition(Node head, int pos, int val) {
		if (head == null && pos == 1) return new Node(val);
        Node curr = null;
        if (pos == 1) {
            curr = new Node(val);
            curr.next = head;
            return curr;
        }
        Node temp = head;
        int count = 1;
        while (temp != null) {
            if (pos-1 == count) {
                curr = new Node(val);
                curr.next = temp.next;
                temp.next = curr;
                return head;
            }
            count++;
            temp = temp.next;
        }
        return head;
    }
}
