package linked_Lists;

import java.util.ArrayList;
import java.util.List;

public class Find_Pair_Sum_in_Sorted_DLL {
    public static void main(String[] args) {
        DLLNode head = DLLNode.createList(new int[]{1, 2, 4, 5, 6, 8, 9});
        int target = 7;
        ArrayList<ArrayList<Integer>> list = findPairsWithGivenSum(head, target);
        System.out.println(list);

    }

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(DLLNode head, int target) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (head == null) return list;
        DLLNode slow = head;
        DLLNode fast = head.next;
        while (fast.next != null) {
            fast = fast.next;
        }
        while (slow != fast) {
            if (slow.data + fast.data == target) {
                ArrayList<Integer> array = new ArrayList<>(List.of(slow.data, fast.data));
                list.add(array);
                fast = fast.prev;
            } else if (slow.data + fast.data > target) {
                fast = fast.prev;
            } else {
                slow = slow.next;
            }
        }
        return list;
    }
}
