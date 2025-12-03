package Arrays;

public class KokoEatingBananas {

	public static void main(String[] args) {
		int[] piles = {82,37};
		int h = 6;
		System.out.println(minEatingSpeed(piles, h));
	}
		
	public static int minEatingSpeed(int[] piles, int h) {
		int low = 1;
		int high = 0;
		for(int p : piles) {
			high = Math.max(high, p);
		}
		int ans = Integer.MAX_VALUE;
		while (low<=high) {
			int mid = low+(high-low)/2;
			int speed = calculateHours(piles, mid);
			if (speed<=h) {
				ans = mid;
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return ans;
	}
	
	/*
	public static int minEatingSpeed(int[] piles, int h) {
		int high = 0;
		for (int i : piles) {
			high = Math.max(i, high);
		}
		for (int i = 1; i<=high; i++) {
			int speed = calculateHours(piles,i);
			if (speed<=h) return i;
		}
		return -1;
	}
	*/
	public static int calculateHours(int[] piles, int i) {
		int hour = 0;
		for (int p : piles) {
		//	hour += (int) Math.ceil((double)p/i);
		//	or
			hour += (p+i-1)/i;
		}
		return hour;
	}
}
