package linked_Lists;

public class Find_Head_inLooped_LL {
    static void main(String[] args) {
        Node head = Node.createList(new int[]{1, 2, 3, 4, 5});
        detectCycle(head);
    }
    public static Node detectCycle(Node head) {
        if (head == null || head.next == null) return null;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if (slow != fast) return null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
