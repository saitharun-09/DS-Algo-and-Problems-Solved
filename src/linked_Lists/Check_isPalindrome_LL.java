package linked_Lists;

public class Check_isPalindrome_LL {
    public static void main(String[] args) {
        Node head = Node.createList(new int[]{1, 2, 3, 4, 4, 3, 2, 1});
        Node temp = head;
        System.out.println(isPalindrome(temp));
    }


    public static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = reverseLL(slow);
        fast = head;
        Node tempHead = newHead;
        while (tempHead != null) {
            if (tempHead.data != fast.data) {
                reverseLL(newHead);
                return false;
            }
            tempHead = tempHead.next;
            fast = fast.next;
        }
        reverseLL(newHead);
        return true;
    }

    public static Node reverseLL(Node slow) {
        Node prev = null;
        while (slow != null) {
            Node temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        return prev;
    }
}