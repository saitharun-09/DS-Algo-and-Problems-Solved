package linked_Lists;

public class Rotate_LL_K_places {
    static void main(String[] args) {
        Node head = Node.createList(new int[]{1, 2, 3, 4, 5});
        int k = 2;
        head = rotateRight(head, k);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k <= 0) return head;
        Node temp = head;
        int len = 1;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }
        if (k>=len) k = k%len;
        if (k == 0) return head;
        temp.next = head;
        len = len-k;
        while (len>0) {
            temp = temp.next;
            len--;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }

    /*
    // Time Complexity - O(3N) for reversing 3 times
    public static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        Node temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (k>= len) k = k%len;
        if (k == 0) return head;
        temp = head;
        Node fullReverseHead = reverse(temp);
        head = fullReverseHead;
        len = 1;
        while(len < k) {
            fullReverseHead = fullReverseHead.next;
            len++;
        }
        Node nextNode = fullReverseHead.next;
        fullReverseHead.next = null;
        Node newHead = reverse(head);
        Node secondHead = reverse(nextNode);
        head.next = secondHead;
        return newHead;
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

     */
}
