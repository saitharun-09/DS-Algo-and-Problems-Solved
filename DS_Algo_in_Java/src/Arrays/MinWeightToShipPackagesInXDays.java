package Arrays;

public class MinWeightToShipPackagesInXDays {

	public static void main(String[] args) {
		int[] weights = {};
		int days = 5;
		System.out.println( shipWithinDays(weights, days));

	}
	public static int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for (int i : weights){
            low = Math.max(low,i);
            high+=i;
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            boolean x = calculateDays(weights, mid, days);
            if (x) {
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }/*
	public boolean canShip(int[] weights, int capacity, int allowedDays) {
        int daysNeeded = 1;
        int currentLoad = 0;   
        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                daysNeeded++;
                currentLoad = weight;
            } else {
                currentLoad += weight;
            }
        }
        return daysNeeded <= allowedDays;
    }*/
    public static boolean calculateDays(int[] weights, int weight, int days){
        int count = 0;
        int sum = 0;
        for (int i=0; i<weights.length; i++){
            sum += weights[i];
            if (sum>weight){
                count++;
                sum=0;
                i--;
            }
        }
        if (sum<=weight) count++;
    return count<=days;
    }
}
