package linked_Lists;

public class Find_Intersection_of_YLL {
    static void main(String[] args) {
        Node head = Node.createList(new int[]{1, 0, 0, 1, 2, 1, 2, 1});
        System.out.println(getIntersectionNode( head, head));
    }
    public static Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB== null) return null;
        Node a = headA;
        Node b = headB;
        while(a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        if (a == b) return a;
        return null;
    }
}
