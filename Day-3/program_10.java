import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start Number: ");
        int start = sc.nextInt();

        System.out.print("Enter End Number: ");
        int end = sc.nextInt();

        // Output
        System.out.println("Prime Numbers:");

        for (int num = start; num <= end; num++) {

            boolean prime = true;

            if (num <= 1) {
                prime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}