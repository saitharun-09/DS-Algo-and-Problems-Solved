package Arrays;

public class ReversePairs {

	public static void main(String[] args) {
		int[] nums = {2,4,3,5,1};
		System.out.println(divideAndConq(nums));
	}

    public static int divideAndConq(int[] nums){
        int count = 0;
        if (nums.length<=1) return count;
        int mid= nums.length/2;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[nums.length-mid];
        for (int i = 0; i<arr1.length; i++){
            arr1[i] = nums[i];
        }
        for (int i = 0; i<arr2.length; i++){
            arr2[i] = nums[mid+i];
        }
        count+=divideAndConq(arr1);
        count+=divideAndConq(arr2);
        count+=count(nums, arr1, arr2);
        return count;
    }
    public static int count(int[] nums, int[] arr1, int[] arr2){
        int count = 0;
        int j = 0;
        for(int i = 0; i<arr1.length; i++){
            while (j<arr2.length && (long)arr1[i]>(arr2[j]*2L)){
                j++;
            }
            count+=j;
        }
        //Basic merge Sort
        int i = 0;
        int l = 0;
        int r = 0;
        while(l<arr1.length && r<arr2.length){
            if (arr1[l]<=arr2[r]){
                nums[i++]=arr1[l++];
            }else {
                nums[i++]=arr2[r++];
            }
        }
        while(l<arr1.length){
            nums[i++]=arr1[l++];
        }
        while(r<arr2.length){
             nums[i++]=arr2[r++];
        }
        return count;
    }
}
