package linked_Lists;

class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;
    
    DLLNode(int data, DLLNode next, DLLNode prev) {
    	this.data = data;
    	this.next = next;
        this.prev = prev;
    }

    DLLNode(int data) {
    	this.data = data;
    	this.next = null;
        this.prev = null;
    }
    
    public static DLLNode createList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        DLLNode head = new DLLNode(arr[0]);
		DLLNode prev = head;
		for (int i = 1; i<arr.length; i++) {
			DLLNode node = new DLLNode(arr[i],null,prev);
			prev.next = node;
			prev = node;
		}
        return head;
    }
}


public class Travarsel_Array2DLL_Ops_In_DoublyLL {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		DLLNode head = convertArrayToDLL(arr);
		//head = deleteHeadOfDLL(head);
		//head = deleteTailOfDLL(head);
		head = deleteKthNodeOfDLL(head, 3);
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}

	private static DLLNode deleteKthNodeOfDLL(DLLNode head, int pos) {
		if (head == null) return head;
        if (head.next == null && pos == 1) return null;
        if (pos==1) { 
        	DLLNode curr = head.next;
            curr.prev = null;
            head.next = null;
            return curr;
        }
        DLLNode temp = head;
        DLLNode prev = null;
        int count = 1;
        while (temp != null) {
            if (count==pos) { // If Value is given, check if temp.data == value
                prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                temp.next = null;
                temp.prev = null;
                break;
            }
            count++;
            prev = temp;
            temp = temp.next;
        }
        return head;	
	}

	private static DLLNode deleteTailOfDLL(DLLNode head) {
		if (head == null || head.next == null) return null;
		DLLNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		DLLNode tail = temp.prev;
		tail.next = null;
		temp.prev = null;
		return head;
	}

	private static DLLNode deleteHeadOfDLL(DLLNode head) {
		if (head == null) return head;
        if (head.next == null) return null;
        DLLNode temp = head.next;
        temp.prev = null;
        head.next = null;
        return temp;
    }

	private static DLLNode convertArrayToDLL(int[] arr) {
		DLLNode head = new DLLNode(arr[0]);
		DLLNode prev = head;
		for (int i = 1; i<arr.length; i++) {
			DLLNode node = new DLLNode(arr[i],null,prev);
			prev.next = node;
			prev = node;
		}
		return head;
	}

}
