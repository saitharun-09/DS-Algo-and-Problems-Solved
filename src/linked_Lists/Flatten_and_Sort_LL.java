package linked_Lists;

import java.util.ArrayList;
import java.util.Collections;

public class Flatten_and_Sort_LL {
    static void main(String[] args) {
        Node head = Node.createList(new int[]{1, 2, 3, 4, 5});
  //      Node temp = flatten(head);
    }
/*
    public static Node flatten(Node root) {
        if (root == null || root.next == null) return root;
        Node head = flatten(root.next);
        Node newHead = mergeLL(root, head);
        return newHead;
    }

    public static Node mergeLL(Node root, Node head) {
        Node dummy = new Node(-1);
        Node newhead = dummy;
        root.next = null;
        while (root != null && head != null) {
            if (root.data <= head.data) {
                dummy.bottom = root;
                root = root.bottom;
            }else {
                dummy.bottom = head;
                head = head.bottom;
            }
            dummy = dummy.bottom;
            dummy.next = null;
        }
        if (head != null) dummy.bottom = head;
        if (root != null) dummy.bottom = root;
        return newhead.bottom;
    }
}

    /*
    public static Node flatten(Node root) {
        if (root == null || root.next == null) return root;
        Node head = root;
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.data);
            Node low = head;
            while (low.bottom != null && low != null) {
                low = low.bottom;
                list.add(low.data);
            }
            head = head.next;
        }
        Collections.sort(list);
        Node dummy = new Node(0);
        head = dummy;
        for (int num : list) {
            Node temp = new Node(num);
            head.bottom = temp;
            head = head.bottom;
        }
        return dummy.bottom;
    }
    */
}
