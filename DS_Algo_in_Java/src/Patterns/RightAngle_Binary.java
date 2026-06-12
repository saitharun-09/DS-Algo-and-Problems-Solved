package Patterns;

public class RightAngle_Binary {
    static void main(String[] args) {
        int n = 5;
        print(n);
    }

    private static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                if ((i+j)%2==0) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }
    }
}

