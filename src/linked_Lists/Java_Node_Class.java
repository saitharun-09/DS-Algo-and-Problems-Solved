package linked_Lists;

class Node {
    int data;
    Node next;

    Node(int value, Node next){
        this.data = value;
        this.next = next;
    }

    Node(int value){
        this.data = value;
        this.next = null;
    }

    public static Node createList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        return head;
    }
}