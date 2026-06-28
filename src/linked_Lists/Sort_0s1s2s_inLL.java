package linked_Lists;

public class Sort_0s1s2s_inLL {
    static void main(String[] args) {
        Node head = Node.createList(new int[]{1, 0, 0, 1, 2, 1, 2, 1});
        Node temp = segregate(head);
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    public static Node segregate(Node head) {
        if (head == null || head.next == null) return head;
        Node zeroNode = new Node(-1);
        Node oneNode = new Node(-1);
        Node twoNode = new Node(-1);
        Node zero = zeroNode;
        Node one = oneNode;
        Node two = twoNode;
        while (head != null) {
            if (head.data == 0) {
                zeroNode.next = head;
                zeroNode = zeroNode.next;
            }else if (head.data == 1) {
                oneNode.next = head;
                oneNode = oneNode.next;
            }else {
                twoNode.next = head;
                twoNode = twoNode.next;
            }
            head = head.next;
        }
        zeroNode.next = (one.next != null) ?one.next : two.next;
        oneNode.next = two.next;
        twoNode.next = null;
        return zero.next;
    }
}
