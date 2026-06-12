package strings;

public class SumOfBeautyOfAllSubstrings {

	public static void main(String[] args) {
		String s = "aabcbaa";
		System.out.println(beautySum(s));

	}
	
	// Optimal O(n^2) solution with all substrings
	public static int beautySum(String s) {
        int count = 0;
        for (int i = 0; i<s.length(); i++) {
            int[] arr = new int[26];
            for (int j = i; j<s.length(); j++) {
                arr[s.charAt(j)-'a']++;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int val : arr) {
                    if (val > 0) {
                        min = Math.min(min, val);
                        max = Math.max(max, val);
                    }
                }
                if (max-min>0) count+=max-min;
            }
           
        }
        return count;
    }
}
