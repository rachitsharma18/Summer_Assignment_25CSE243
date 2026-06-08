import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter Power (n): ");
        int n = sc.nextInt();

        // Power
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        // Output
        System.out.println("Result = " + result);

        sc.close();
    }
}