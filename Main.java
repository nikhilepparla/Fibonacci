import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n1 = 0, n2 = 1, n3 = 0;
        for (int i = 0; i < number; i++) {
            n3 = n1 + n2;
            System.out.println("Value is " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}