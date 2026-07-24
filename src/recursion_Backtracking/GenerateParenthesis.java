package recursion_Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesis {
    static void main(String[] args) {
        int n = 4;
        List<String> list = new ArrayList<>();
    //        generate(list,n,"");
        generate(list,n,0,0,"");
        System.out.println(list);
    }

    public static void generate(List<String> list,int n,int start,int end,String str){
        if (str.length() == 2*n) {
            list.add(str);
            return;
        }
        if (start < n) generate(list,n,start+1,end,str+"(");
        if (end < start) generate(list,n,start,end+1,str+")");
        return;
    }

    /*
    // T.C - O(2^2N*N) Not Optimal at all   , S.C - O(N)
    public static void generate(List<String> list, int n, String s) {
        if (s.length()==n*2) {
            if (validParathesis(s)) list.add(s);
            return;
        }
        generate(list,n,s+"(");
        generate(list,n,s+")");
        return;
    }
    public static boolean validParathesis(String s) {
        if (s.length()%2==1) return false;
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch == '(') stack.push(ch);
            else {
                if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
                else return false;
            }

        }
        return stack.isEmpty();
    }
    */
}
