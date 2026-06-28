package linked_Lists;

public class Add_2_to_LL {
    static void main(String[] args) {
        Node head = Node.createList(new int[]{9, 9, 9, 9, 9, 9, 9});
        Node head2 = Node.createList(new int[]{9, 9, 9, 9});
        Node temp = addTwoNumbers(head, head2);
        while(temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    

    public static Node addTwoNumbers(Node l1, Node l2) {
        Node h1 = l1;
        Node h2 = l2;
        Node dummy = new Node(0);
        Node head = dummy;
        int carry = 0;
        while(h1 != null && h2 != null) {
            int i = h1.data + h2.data + carry;
            carry = 0;
            if (i>9) {
                carry = 1;
                i = i-10;
            }
            Node temp = new Node(i);
            head.next = temp;
            head = head.next;
            h1 = h1.next;
            h2 = h2.next;
        }
        while (h1 != null) {
            int i = h1.data+carry;
            carry = 0;
            if (i>9) {
                carry = 1;
                i = i-10;
            }else {
                carry = 0;
            }
            Node temp = new Node(i);
            head.next = temp;
            head = head.next;
            h1 = h1.next;
        }
        while (h2 != null) {
            int i = h2.data+carry;
            carry = 0;
            if (i>9) {
                carry = 1;
                i = i-10;
            }else {
                carry = 0;
            }
            Node temp = new Node(i);
            head.next = temp;
            head = head.next;
            h2 = h2.next;
        }
        if (carry == 1) head.next = new Node(carry);
        return dummy.next;
    }
}
