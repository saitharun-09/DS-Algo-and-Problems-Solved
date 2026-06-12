package Arrays;

public class KthMissingPositiveNum {

	public static void main(String[] args) {
		int[] arr = {2,3,4,7,11};
		int k = 6;
		System.out.println(findKthPositive(arr, k));
	}

	public static int findKthPositive(int[] arr, int k) {
        if (k < arr[0]) return k;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int miss = arr[mid]-(mid+1);
            if (miss<k){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return high+1+k;
    }
	/*
	public int findKthPositive(int[] arr, int k) {
        if (k < arr[0]) return k;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>k) return k;
            else {
                k++;
            }
        }
        return k;
    }
	/*
	public static int findKthPositive(int[] arr, int k) {
        int missingCount = 0;
        int i = 0;
        int j = 1;
        while(i<arr.length){
            if (arr[i]==j){
                i++;
            }else {
                missingCount++;
            }
            if (missingCount==k) return j;
            j++;
        }
        if (missingCount<k){
             return arr[arr.length-1]+(k-missingCount);
        }
        return 0;
    } */
}