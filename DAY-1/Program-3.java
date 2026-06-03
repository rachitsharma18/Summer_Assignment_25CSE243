import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // Factorial
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        // Output
        System.out.println("Factorial of a given number is = " + fact);

        sc.close();
    }
}