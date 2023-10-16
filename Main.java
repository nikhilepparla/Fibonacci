import java.util.Scanner;

public class Main {
    static int n1 = 0, n2 = 1, n3;

    public static void fibo(int number) {
        if (number > 0) {
            fibo(number - 1);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println("Fibonacci values are " + n3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibo(10);
    }
}