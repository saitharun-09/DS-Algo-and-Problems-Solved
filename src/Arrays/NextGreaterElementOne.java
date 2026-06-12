package Arrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;

public class NextGreaterElementOne {

	public static void main(String[] args) {
		int[] nums1 = {2,4};
		int[] nums2 = {1,2,3,4};
		System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
	}
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length]; 
        Arrays.fill(ans, -1);
        HashMap<Integer,Integer> map = new HashMap<>();        
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = nums2.length-1; i>=0; i--) {
            while (!stack.isEmpty() && nums2[i]>stack.peek()) stack.pop();
            if (!stack.isEmpty()) map.put(nums2[i],stack.peek());
            stack.push(nums2[i]);
        }
        for (int i = 0; i<nums1.length; i++) {
            if (map.containsKey(nums1[i])) ans[i] = map.get(nums1[i]);
        }
        return ans;
    }	
	/*
	// brute force by checking array 2 and break if found
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length]; 
        Arrays.fill(ans, -1);
        for (int i = 0; i<nums1.length; i++) {
            for (int j = 0; j<nums2.length; j++) {
                if (nums1[i]==nums2[j]) {
                    for (int k = j+1; k<nums2.length; k++) {
                        if (nums2[k]>nums2[j]) {
                            ans[i] = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return ans;
    }
    */
}
