package linked_Lists;

import java.util.ArrayList;

public class Reverse_DLL {

	public static void main(String[] args) {
		DLLNode head = DLLNode.createList(new int[] {1,2,3,4,5});
		head = reverseDll(head);
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	private static DLLNode reverseDll(DLLNode head) {
		
		return head;
	}

	/*
	private static DLLNode reverseDll(DLLNode head) {
		ArrayList<Integer> array = new ArrayList<>();
		DLLNode temp = head;
        while (temp != null) {
            array.add(temp.data);
            temp = temp.next;
        }
        int i = array.size()-1;
        temp = head;
        while(temp != null) {
            temp.data = array.get(i--);
            temp = temp.next;
        }
		return head;
	}
	*/
}
