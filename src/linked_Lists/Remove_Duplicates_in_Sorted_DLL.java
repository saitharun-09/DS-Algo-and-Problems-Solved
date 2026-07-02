package linked_Lists;

public class Remove_Duplicates_in_Sorted_DLL {
    public static void main(String[] args) {
        DLLNode head = DLLNode.createList(new int[]{1, 1, 4, 5, 5, 8, 8});
        head = removeDuplicates(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static DLLNode removeDuplicates(DLLNode headRef) {
        DLLNode temp = headRef;
        DLLNode last = new DLLNode(0);
        while (temp != null) {
            if (temp.data == last.data) {
                if (temp.next != null) {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                temp = temp.next;
            } else {
                last = temp;
                temp = temp.next;
            }
        }
        last.next = null;
        return headRef;
    }
}