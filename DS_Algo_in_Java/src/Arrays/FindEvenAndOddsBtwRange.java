package Arrays;

public class FindEvenAndOddsBtwRange {

	public static void main(String[] args) {
		int high = 7;
		int low = 3;
		System.out.println(countEvenOdds(high,low));
	}

	// For Evens -> if high-low+1 is even then evens will be half of high-low+1
	// For Odds -> formula = (high+1)/2 - low/2
	
	public static int countEvenOdds(int low, int high) {
	    if ((high-low+1)%2==0) return (high-low+1)/2;
	    else return (high+1)/2-(low/2);
	}
}
