package linked_Lists;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_LinkedList {
    static void main(String[] args) {
        Node head = Node.createList(new int[]{5, 1, 2, 3, 4});
        Node temp = sortList(head);
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    public static Node sortList(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(list);
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.data = list.get(i++);
            temp = temp.next;
        }
        return head;
    }
}
