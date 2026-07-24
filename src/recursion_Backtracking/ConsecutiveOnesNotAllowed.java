package recursion_Backtracking;

public class ConsecutiveOnesNotAllowed {
    static void main(String[] args) {
        int n = 4;
        //System.out.println(generateBinaryString(n, ""));
        System.out.println(generateBinaryString(n, "", 0));
    }


    // Recursion

    public static int generateBinaryString(int n, String currString, int prev){
        if (currString.length() ==n) return 1;
        int count0 = generateBinaryString(n,currString+"0", 0 );
        int count1 = 0;
        if (prev == 0) count1 = generateBinaryString(n,currString+"1", 1);
        return count0+count1;
    }


    // Time Complexity of O(2^n) with checking fucntion
    /*
    public static int generateBinaryString(int n, String currString){
        if (currString.length() ==n) return checkConsecutiveOnes(currString);
        int count0 = generateBinaryString(n,currString+"0");
        int count1 = generateBinaryString(n,currString+"1");
        return count0+count1;
    }

    public static int checkConsecutiveOnes(String currString){
        for (int i = 1; i<currString.length(); i++) {
            if (currString.charAt(i) ==  '1' && currString.charAt(i-1) == '1') return 0;
        }
        return 1;
    }
     */
}