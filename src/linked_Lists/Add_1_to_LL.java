package linked_Lists;

public class Add_1_to_LL {
    static void main(String[] args) {
        Node head = Node.createList(new int[]{1, 2, 1, 2, 1});
        Node temp = addOne(head);
        //Node temp = AddOneToLL(head);
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

        // Recursive (BackTracking)
    public static Node addOne(Node head) {
        Node temp = head;
        int carry = helper(temp);
        if (carry == 1) {
            Node node = new Node(carry);
            node.next = head;
            return node;
        }
        return head;
    }
    public static int helper(Node temp) {
        if (temp == null) return 1;
        int carry = helper(temp.next);
        if (temp.data+carry>=10) {
            temp.data = 0;
            return 1;
        }else {
            temp.data = temp.data+carry;
            return 0;
        }
    }


    /*
    //Reverse and Add 1 and reverse again
    public static Node AddOneToLL(Node head) {
        if (head == null) return null;
        Node revHead = reverse(head);
        Node temp = revHead;
        while (temp != null) {
            if (temp.data < 9) {
                temp.data += 1;
                break;
            } else {
                temp.data = 0;
                if (temp.next == null) {
                    temp.next = new Node(1);
                    break;
                }
            }
            temp = temp.next;
        }
        return reverse(revHead);
    }
    //Reverse Function
    public static Node reverse(Node temp) {
        if (temp == null || temp.next == null) return temp;
        Node prev = null;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
     */
}
