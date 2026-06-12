package Patterns;

public class ReverseRightAngleASCII {
    static void main(String[] args) {
        int n = 5;
        print(n);
    }

    private static void print(int n) {
        for (int i = n; i>0; i--) {
            for (char ch = 'A'; ch<'A'+i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
