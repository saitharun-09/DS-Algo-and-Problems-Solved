package linked_Lists;

public class Detect_Loop_In_LL {
    public static void main(String[] args) {
        Node head = Node.createList(new int[]{1, 2, 3, 4, 5});
        System.out.println(hasCycle(head));

    }

    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
