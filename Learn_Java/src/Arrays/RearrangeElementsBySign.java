package Arrays;

import java.util.ArrayList;

public class RearrangeElementsBySign {

	public static void main(String[] args) {
		int[] nums = {1,2,-4,-5,3,6};
		reArrangeElementsBySign(nums);
		for (int num : nums) {
			System.out.print(num+" ,");
		}
	}
	
	public static void reArrangeElementsBySign(int[] nums) {
		ArrayList<Integer> positive = new ArrayList<>();
		ArrayList<Integer> negitive = new ArrayList<>();
		int i = 0;
		while (i<nums.length) {
			if (nums[i]<0) {
				negitive.add(nums[i]);
			}else if (nums[i]>0) {
				positive.add(nums[i]);
			}
			i++;
		}
		if (positive.size()>negitive.size()) {
			for (i = 0; i<negitive.size(); i++) {
				nums[i*2] = positive.get(i);
				nums[i*2+1] = negitive.get(i);
			}
			int index = negitive.size()*2;
			for (i = negitive.size(); i<positive.size(); i++) {
				nums[index] = positive.get(i);
				index++;
			}
		}else {
			for (i = 0; i<positive.size(); i++) {
				nums[i*2] = positive.get(i);
				nums[i*2+1] = negitive.get(i);
			}
			int index = positive.size()*2;
			for (i = positive.size(); i<negitive.size(); i++) {
				nums[index] = negitive.get(i);
				index++;
			}
		}
	}
}