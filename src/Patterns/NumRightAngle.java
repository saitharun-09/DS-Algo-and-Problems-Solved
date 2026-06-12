package Patterns;

public class NumRightAngle {
    static void main(String[] args) {
        int n = 5;
        print(n);
    }

    private static void print(int n) {
        int num = 1;
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<=i; j++ ) {
                System.out.print(num+++" ");
            }
            System.out.println();
        }
    }
}
