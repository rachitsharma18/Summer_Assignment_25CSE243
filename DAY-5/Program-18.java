import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // Store
        int original = n;
        int sum = 0;

        // Strong
        while (n != 0) {

            int digit = n % 10;

            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            n /= 10;
        }

        // Check
        if (sum == original) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }

        sc.close();
    }
}