package strings;

import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String s = "paper";
		String t = "title";
		System.out.println(isIsomorphic(s, t));
	}
	
	// using arrays of length 256 which covers all letters and checking 
	public static boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()) return false;
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        for (int i = 0; i<s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if (arr1[schar] != arr2[tchar]) return false;
            arr1[schar] = i+1;
            arr2[tchar] = i+1;
        }
        return true;
    }	
	/*
	// hashMap Solution of checking both sides hash-map
	public static boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()) return false;
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for (int i = 0; i<s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if (map1.containsKey(schar) && map1.get(schar)!=tchar) return false;
            if (map2.containsKey(tchar) && map2.get(tchar)!=schar) return false;
            map1.put(s.charAt(i),t.charAt(i));
            map2.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
    */
}
