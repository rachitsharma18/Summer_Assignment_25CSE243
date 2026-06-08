import java.util.Scanner;

public class Program27 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // Count
        int count = 0;

        while (n > 0) {

            if (n % 2 == 1) {
                count++;
            }

            n = n / 2;
        }

        // Output
        System.out.println("Set Bits = " + count);

        sc.close();
    }
}