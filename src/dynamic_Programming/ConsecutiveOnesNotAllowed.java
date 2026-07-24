package dynamic_Programming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConsecutiveOnesNotAllowed {
    static void main(String[] args) {
        int n = 5;
        int[][] dp = new int[n+1][2];
        for (int[] row : dp) Arrays.fill(row, -1);
        System.out.println(generateBinaryString(n,1, 0, dp));
    }


    public static int generateBinaryString(int n, int i, int prev, int[][] dp) {
        if (i>n) return 1;
        if (dp[i][prev] != -1) return dp[i][prev];
        int ans = generateBinaryString(n,i+1, 0 ,dp);
        if (prev == 0) ans+= generateBinaryString(n,i+1, 1, dp);
        return dp[i][prev] = ans;
    }
}
