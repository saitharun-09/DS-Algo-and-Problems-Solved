package Arrays;

public class JosephusProblem {

	public static void main(String[] args) {
		int n = 5;
		int k = 2;
		System.out.println(findTheWinner(n, k));
	}

	public static int findTheWinner(int n, int k) {
        int result = 0;
        for ( int i = 1; i<=n; i++){
            result = (result+k)%i;
        }
        return result+1;
    }
}
