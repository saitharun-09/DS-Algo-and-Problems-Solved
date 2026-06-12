package Arrays;

public class MinDaysToMakeMBouqets {

	public static void main(String[] args) {
		int[] bloomDay = {7,7,7,7,12,7,7};
		int m = 2;
		int k = 3;
		System.out.println(minDays(bloomDay, m, k));
	}
	
	public static int minDays(int[] bloomDay, int m, int k) {
        if ((long) bloomDay.length < (long) m * k) return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : bloomDay){
            min = Math.min(i,min);
            max = Math.max(i,max);
        }
        while(min<=max){
            int mid = min+(max-min)/2;
            if (noOfBouquets(bloomDay, k, mid, m)){
                max = mid-1;
            }else {
                min = mid+1;
            }
        }
        return min;
    }
    public static boolean noOfBouquets(int[] bloomDay, int k, int day, int m){
        long bouq = 0;
        long count = 0;
        for (int i = 0; i<bloomDay.length; i++){
            if (bloomDay[i]<=day){
                count++;
            }else {
                bouq += count/k;
                count = 0;
            }
        }
        bouq += count/k;
        return bouq>=m;
    }
}
