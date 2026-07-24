package recursion_Backtracking;

import java.util.Stack;

public class Reverse_Stack {
    static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        reverseStack(numbers);
        for (int num :  numbers) {
            System.out.println(num);
        }
    }

    public static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int temp = st.pop();
        reverseStack(st);
        insertReversed(st, temp);
    }
    public static void insertReversed(Stack<Integer> st, int temp) {
        if (st.isEmpty()) {
            st.push(temp);
            return;
        }
        int top = st.pop();
        insertReversed(st,temp);
        st.push(top);
    }
}
