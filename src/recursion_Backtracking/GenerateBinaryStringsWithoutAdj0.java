package recursion_Backtracking;

import java.util.ArrayList;

public class GenerateBinaryStringsWithoutAdj0 {
    static void main(String[] args) {
        int n = 4;
        ArrayList<String> list = new ArrayList<>();
        generateBinaryStrings(n,list, "", 1);
        System.out.println(list);
    }

    public static void generateBinaryStrings(int n, ArrayList<String> list, String currString, int prev){
        if (currString.length()==n) {
            list.add(currString);
            return;
        }
        generateBinaryStrings(n,list,currString+"1", 1);
        if (prev == 1) generateBinaryStrings(n,list,currString+"0", 0);
        return;
    }
}
