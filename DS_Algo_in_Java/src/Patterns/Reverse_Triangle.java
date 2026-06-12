package Patterns;

public class Reverse_Triangle{
    static void main(String[] args) {
        int n = 4;
        print(n);
    }

    private static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <((2*n)+1)-(2*i)-2 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
