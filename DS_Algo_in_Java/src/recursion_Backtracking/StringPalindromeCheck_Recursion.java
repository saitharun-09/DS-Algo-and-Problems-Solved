package recursion_Backtracking;

public class StringPalindromeCheck_Recursion {

	public static void main(String[] args) {
		String s = "Xerrex";
		System.out.println(palindromeCheck(s,0));
	}
// T.C -> O(n/2) 
	private static boolean palindromeCheck(String s, int i) {
		if (i>s.length()/2) return true;
		if (s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
		return palindromeCheck(s, i+1);
	}

}
