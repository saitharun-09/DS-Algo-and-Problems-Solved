package linked_Lists;

public class Len_Of_LoopedLL {
    static void main(String[] args) {
        Node head = Node.createList(new int[]{1, 2, 3, 4, 5});
        findLengthOfLoop(head);
    }

    public static int findLengthOfLoop(Node head) {
        if (head == null || head.next == null) return 0;
        Node slow = head;
        Node fast = head;
        int count = 1;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = fast.next;
                while(slow != fast) {
                    fast = fast.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }
}
