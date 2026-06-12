package Patterns;

public class Side_Triangle {
    static void main(String[] args) {
        int n = 6;
        print(n);
    }

    private static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
