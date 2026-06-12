package Arrays;

public class checkIfArrayIsSortedRotated {

	public static void main(String[] args) {
		int[] nums = {2,1,3,4};
		System.out.println(check(nums));
	}
	
	public static boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i<nums.length; i++){
            int idx = (i+1)%nums.length;
            if (nums[i]>nums[idx]){
                count++;
            }
        }
        if (count==0 || count==1) return true;
        else return false;
    }
}
