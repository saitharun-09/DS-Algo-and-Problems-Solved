package Arrays;

import java.util.HashSet;

public class LongestSequence {

	public static void main(String[] args) {
		int [] nums = {-3, 4, 5, 1, -30, -10};
		System.out.println(longestSeq(nums));
	}
	
    public static int longestSeq(int[] nums) {
    	if (nums.length==0) return 0;
    	int highest = 1;
    	HashSet<Integer> hashSet = new HashSet<>();
    	for (Integer integer : nums) {
			hashSet.add(integer);
		}
    	for (Integer integer : hashSet) {
			if (!hashSet.contains(integer-1)) {
				int count = 1;
				int num = integer;
				while(hashSet.contains(num+1)) {
					num+=1;
					count++;
				}
				highest = Math.max(highest, count);
			}
		}
    	return highest;
    }
}