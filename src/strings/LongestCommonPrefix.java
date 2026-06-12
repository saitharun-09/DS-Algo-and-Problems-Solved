package strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
	// Brute Force with O(n^2) T.C - Vertical Scaling is best one 
	public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) return "";
        int len = Integer.MAX_VALUE;
        for (String s : strs) {
            len = Math.min(s.length(), len);
        }
        String s ="";
        for (int i = 0; i<len; i++) {
            char c = strs[0].charAt(i);
            for(int k = 1; k<strs.length; k++) {
                if (strs[k].charAt(i)!=c) return s;
            }
            s+=c;
        }
        return s;
    }
}
