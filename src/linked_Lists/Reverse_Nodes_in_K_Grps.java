package linked_Lists;

public class Reverse_Nodes_in_K_Grps {
    static void main(String[] args) {
        Node head = Node.createList(new int[]{1, 2, 3, 4, 5});
        int k = 3;
        head = reverseKGroup(head, k);
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static Node reverseKGroup(Node head, int k) {
        if (head.next == null || head == null || k <= 1) return head;
        Node temp = head;
        Node resHead = null;
        Node prevTail = null;
        while (temp != null && temp.next != null) {
            Node h1 = temp;
            int count = 1;
            while(count<k && h1.next != null) {
                count++;
                h1 = h1.next;
            }
            if (count<k) break;
            Node nextNode = h1.next;
            h1.next = null;
            Node newHead = reverse(temp);
            if (resHead == null) resHead = newHead;
            if (prevTail != null) prevTail.next = newHead;
            temp.next = nextNode;
            prevTail = temp;
            temp = nextNode;
        }
        return resHead;
    }
    public static Node reverse(Node head) {
        Node last = null;
        while (head != null) {
            Node next = head.next;
            head.next = last;
            last = head;
            head = next;
        }
        return last;
    }
}
