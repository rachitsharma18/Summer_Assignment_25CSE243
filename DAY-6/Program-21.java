import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int n = sc.nextInt();

        // Binary
        String binary = "";

        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }

        // Output
        System.out.println("Binary = " + binary);

        sc.close();
    }
}