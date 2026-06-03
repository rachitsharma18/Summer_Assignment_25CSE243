import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // Count
        int count = 0;

        if (n == 0) {
            count = 1;
        } else {
            while (n != 0) {
                n /= 10;
                count++;
            }
        }

        // Output
        System.out.println("Digits = " + count);

        sc.close();
    }
}