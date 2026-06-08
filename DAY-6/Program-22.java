import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary Number: ");
        int binary = sc.nextInt();

        // Variables
        int decimal = 0;
        int power = 0;

        // Conversion
        while (binary != 0) {

            int digit = binary % 10;

            decimal += digit * (int)Math.pow(2, power);

            power++;
            binary /= 10;
        }

        // Output
        System.out.println("Decimal = " + decimal);

        sc.close();
    }
}