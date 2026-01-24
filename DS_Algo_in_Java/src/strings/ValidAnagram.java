package strings;

import java.util.HashMap;

public class ValidAnagram {

	public static void main(String[] args) {
		String s = "aacc";
		String t = "ccac";
		System.out.println(isAnagram(s,t));
	}
	// Taking arrays size of 26 for letters and comparing with O(n) T.C
	/*
	public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i<s.length(); i++) {
            arr1[s.charAt(i)-'a']++;
        }
        for (int i = 0; i<t.length(); i++) {
            arr2[t.charAt(i)-'a']++;
        }
        for (int i = 0; i<26; i++) {
            if (arr1[i]!=arr2[i]) return false;
        }
        return true;
    }	
	*/
	// Using Hashmap with O(n) Time and Space Complexity
	public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i<s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i<t.length(); i++) {
            if (!map.containsKey(t.charAt(i))) return false;
            if (map.get(t.charAt(i))-1<0) return false;
            else map.put(t.charAt(i),map.get(t.charAt(i))-1);
        }
        return true;
    }
}
