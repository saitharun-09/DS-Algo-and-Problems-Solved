package recursion_Backtracking;

import java.util.Stack;

public class Sort_Stack {
    static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        sortStack(numbers);
    }

    // Using Helper Function
    public static void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int temp = st.pop();
        sortStack(st);
        pushSortedNumbers(st, temp);
    }
    public static void pushSortedNumbers(Stack<Integer> st, int temp) {
        while (st.isEmpty() || temp > st.peek()) {
            st.push(temp);
            return;
        }
        int num = st.pop();
        pushSortedNumbers(st,  temp);
        st.push(num);
    }
}
