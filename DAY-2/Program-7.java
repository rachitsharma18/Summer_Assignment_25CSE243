import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // Product
        int product = 1;

        while (n != 0) {
            int digit = n % 10;
            product *= digit;
            n /= 10;
        }

        // Output
        System.out.println("Product of Digits = " + product);

        sc.close();
    }
}