package Patterns;

public class TwoSideTriangles {
    static void main(String[] args) {
        int n = 6;
        print(n);
    }

    private static void print(int n) {
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <2*n-2*i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i<=n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i ; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
