package strings;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		String s = "cbbd";
		System.out.println(longestPalindrome(s));
		
	} 
	public static String longestPalindrome(String s) {
        if (s.length()==1) return s;
        int start = 0;
        int end = 0;
        for (int i = 0; i<s.length(); i++) {
            int j = i;
            int k = i;
            int odd = palindromeLen(s,j,k);
            int even = palindromeLen(s,j,k+1);
            int max = Math.max(odd,even);
            if (max>end-start) {
                start = i-(max-1)/2;
                end = i+max/2;
            }
        }
        return s.substring(start,end+1);
    }
    public static int palindromeLen(String s, int j, int k) {
        while (j>=0 && k<s.length()) {
            if (s.charAt(j)==s.charAt(k)) {
                j--;
                k++;
            }else return k-j-1;
        }
        return k-j-1;
    }
	/*
	// O(n^3) with 2 loops and substring and palindrome check
	public static String longestPalindrome(String s) {
        if (s.length()==1) return s;
        String longest = "";
        for (int i = 0; i<s.length(); i++) {
            int j = s.length()-1;
            while (i<=j) {
                if (j - i + 1 <= longest.length()) break; 
                if (palindromeCheck(s,i,j)) {
                    longest = s.substring(i,j+1);
                }else {
                    j--;
                }
            }
        }
        return longest;
    }
    public static boolean palindromeCheck(String s, int i, int j) {
        while(i<=j) {
            if (s.charAt(i)!=s.charAt(j)) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
    */
}
