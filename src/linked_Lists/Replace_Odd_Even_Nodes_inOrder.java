package linked_Lists;

public class Replace_Odd_Even_Nodes_inOrder {
    static void main(String[] args) {
        Node head = Node.createList(new int[]{1, 2, 3, 4, 4, 3, 2, 1});
        Node temp = oddEvenList(head);
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    public static Node oddEvenList(Node head) {
        if (head == null || head.next == null) return head;
        Node temp = head;
        Node odd = head;
        Node even = head.next;
        Node eHead = head.next;
        while (odd.next != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = eHead;
        return head;
    }

    // Space Complexity of O(N) with extra Array
    /*
    public Node oddEvenList(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        int i = 0;
        int j = 1;
        while(i<list.size()) {
            temp.val = list.get(i);
            temp = temp.next;
            i+=2;
        }
        while(j<list.size()-1) {
            temp.val = list.get(j);
            temp = temp.next;
            j+=2;
        }
        return head;
    }
    */
}
