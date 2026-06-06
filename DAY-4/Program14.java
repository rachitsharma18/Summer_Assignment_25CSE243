import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        // Variables
        int a = 0;
        int b = 1;
        int c = 0;

        // Term
        if (n == 1) {
            System.out.println("Nth Fibonacci Term = " + a);
        } else if (n == 2) {
            System.out.println("Nth Fibonacci Term = " + b);
        } else {

            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println("Nth Fibonacci Term = " + c);
        }

        sc.close();
    }
}