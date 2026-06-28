package linked_Lists;

public class Del_Nth_Node_From_Tail_LL {
    static void main(String[] args) {
        Node head = Node.createList(new int[]{1, 2, 3, 4, 4, 3, 2, 1});
        int n = 3;
        Node temp = removeNthFromEnd(head, n);
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
    public static Node removeNthFromEnd(Node head, int n) {
        Node fast = head;
        Node slow = head;
        while (n>0) {
            fast = fast.next;
            n--;
        }
        if (fast == null) return head.next;
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
