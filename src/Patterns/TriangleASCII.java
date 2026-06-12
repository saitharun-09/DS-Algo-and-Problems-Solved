package Patterns;

public class TriangleASCII {
    static void main(String[] args) {
        int n = 5;
        print(n);
    }

    private static void print(int n) {
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 0; j<2*i+1; j++) {
                System.out.print(ch);
                if (j>=(((2*i)+1)/2)) ch--;
                else ch++;
            }
            for (int j = 0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
