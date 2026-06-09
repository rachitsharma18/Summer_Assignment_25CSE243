import java.util.Scanner;

public class Program25 {

    // Factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // Output
        System.out.println("Factorial = " + factorial(n));

        sc.close();
    }
}