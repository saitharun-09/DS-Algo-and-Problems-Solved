package linked_Lists;

public class Reverse_LinkedList {

    public static void main(String[] args) {
        Node head = Node.createList(new int[] {1, 2, 3, 4, 5});
        Node temp = reverseList(head);
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node reverseList(Node head) {
        if (head == null) return null;
        if (head.next == null) return head;
        Node temp = head;
        Node prev = null;
        while(temp != null) {
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    /*
    // Recursive Approach
    public static Node reverseList(Node head) {
        if (head == null || head.next == null) return head;

        Node newHead = reverseList(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

     */
}
