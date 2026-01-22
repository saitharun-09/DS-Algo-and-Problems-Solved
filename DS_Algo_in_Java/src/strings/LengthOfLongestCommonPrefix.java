package strings;

import java.util.HashSet;

public class LengthOfLongestCommonPrefix {

	public static void main(String[] args) {
		int[] arr1 = {1,10,100,100001}; 
		int[] arr2 = {1000,10000};
		System.out.println(longestCommonPrefix(arr1, arr2));
	}
	
	//HashSet approach of storing all prefix of arr1 elements and checking against arr2.
	public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) return 0;
        HashSet<String> hashset = new HashSet<>();
        int len = 0;
        for  (int i = 0; i<arr1.length; i++) {
            String s = String.valueOf(arr1[i]);
            int j = 1;
            while(j<=s.length()) {
                hashset.add(s.substring(0,j));
                j++;
            }
        }
        for (int i = 0; i<arr2.length; i++) {
            String s = String.valueOf(arr2[i]);
            int j = s.length();
            while(j>=0) {
                if (hashset.contains(s.substring(0,j))) {
                    len = Math.max(len,j);
                    break; // only breaks this loop, but we still check the other elements in arr2.
                }
                else j--;
            }
        }
        return len;
    }	
	/*
	// Brute force with 3 loops but gives TLE
	public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        if (arr1.length>arr2.length) return longestCommonPrefix(arr2, arr1);
        int len = 0;
        for(int i = 0; i<arr1.length; i++) {
            String s1 = String.valueOf(arr1[i]);
            for (int j = 0; j<arr2.length; j++) {
                String s2 = String.valueOf(arr2[j]);
                int min = Math.min(s1.length(),s2.length());
                int count = 0;
                for (int k = 0; k<min; k++) {
                    if (s1.charAt(k)==s2.charAt(k)) count++;
                    else break;
                }
                len = Math.max(count, len);
            }
        }
        return len;
    }
    */
}
