package linked_Lists;

import java.util.HashMap;

public class Deep_Copy_LL {
    static void main(String[] args) {
        Node head = Node.createList(new int[]{1, 2, 3, 4, 5});
        //copyRandomList(head);
    }
/*
    public static Node copyRandomList(Node head) {
        if (head == null) return head;
        Node temp = head;
        while (temp != null){
            Node n = new Node(temp.data);
            Node next = temp.next;
            temp.next = n;
            n.next = next;
            temp = next;
        }
        temp = head;
        while (temp != null) {
            if (temp.random != null) temp.next.random = temp.random.next;
            else temp.next.random = null;
            temp = temp.next.next;
        }
        Node dummy = new Node(-1);
        Node res = dummy;
        temp = head;
        while (temp != null) {
            res.next = temp.next;
            temp.next = temp.next.next;
            res = res.next;
            temp = temp.next;
        }
        return dummy.next;
    }
/*
    // T.C -> O(N) S.C -> O(N)
    public static Node copyRandomList(Node head) {
        if (head == null) return head;
        HashMap<Node,Node> map = new HashMap<>();
        Node temp = head;
        Node node = new Node(-1);
        while(temp != null) {
            Node n = new Node(temp.data);
            map.put(temp,n);
            temp = temp.next;
        }
        temp = head;
        while(temp != null) {
            Node copy = map.get(temp);
            copy.next = map.get(temp.next);
            Node random = temp.random;
            copy.random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }
    */
}
