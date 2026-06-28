package linked_Lists;

public class Del_All_Occurance_of_num_DLL {
    public static void main(String[] args) {
        DLLNode head = DLLNode.createList(new int[]{2, 2, 2, 2, 2});
        int num = 2;
        DLLNode temp = deleteAllOccurOfX(head, num);
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static DLLNode deleteAllOccurOfX(DLLNode head, int x) {
        if (head == null) return head;
        if (head.next == null && head.data == x) return null;
        DLLNode temp = head;
        DLLNode last = null;
        DLLNode next = temp.next;
        while(temp.next != null) {
            if (temp.data == x && temp.prev == null) {
                head = temp.next;
                head.prev = null;
                temp = head;
                continue;
            }
            if (temp.data != x) {
                last = temp;
                temp = temp.next;
            }else {
                last.next = temp.next;
                temp.next.prev = last;
                temp = temp.next;
            }
        }
        if (temp.data == x) {
            if (last == null ) return null;
            last.next = null;
            temp.prev = null;
        }
        return head;
    }
}
