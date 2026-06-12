package strings;

public class NoofSubstringsContainingAll3Characters {

	public static void main(String[] args) {
		String s = "abcabc";
		System.out.println(numberOfSubstrings(s));
	}
	
	// Optimal Sliding window Solution T.C->O(n), S.C->O(1)
	public static int numberOfSubstrings(String s) {
        int[] abc = new int[3];
        int len = s.length();
        int i = 0;
        int count = 0; 
        for (int j = 0; j < len; j++) {
            abc[s.charAt(j)-'a']++; 
            while (abc[0]>0 && abc[1]>0 && abc[2]>0) {
                count += len-j;
                abc[s.charAt(i)-'a']--;
                i++;
            }
            j++;
        } 
    return count;
    }
	
	// O(n^2) with 2 Nested Loops
	/*
	public static int numberOfSubstrings(String s) {
		int[] abc = new int[3];
        int len = s.length();
        int i = 0;
        int j = 0;
        int count = 0; 
        while(i<len-2 && j<len) {
            abc[s.charAt(j)-'a']++;  {
                count += len-j;
                abc[s.charAt(i)-'a']--;
                i++;
                j--;
            }
            j++;
        } 
    return count;
    }
	*/
	
	// 2 Nested Loops with substring.contains(O(n))= O(n^3)
	/*
	public int numberOfSubstrings(String s) {
        int len = s.length();
        int i = 0;
        int j = 0;
        int count = 0; 
        while(i<len-2 && j<len) {
            if (s.substring(i,j+1).contains("a") &&
            s.substring(i,j+1).contains("b") && s.substring(i,j+1).contains("c")) {
                count++;
                count += len-j-1;
                i++;
                j--;
            }
            j++;
        } 
    return count;
    }
    */
}
