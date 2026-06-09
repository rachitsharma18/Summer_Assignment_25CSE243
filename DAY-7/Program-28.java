import java.util.Scanner;

public class Program28 {

    // Reverse
    static int reverse = 0;

    static int reverseNumber(int n) {
        if (n == 0) {
            return reverse;
        }

        reverse = reverse * 10 + (n % 10);

        return reverseNumber(n / 10);
    }

    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // Output
        System.out.println("Reversed Number = " + reverseNumber(n));

        sc.close();
    }
}