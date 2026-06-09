import java.util.Scanner;

public class Program27 {

    // Sum of Digits
    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // Output
        System.out.println("Sum of Digits = " + sumDigits(n));

        sc.close();
    }
}