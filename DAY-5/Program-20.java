import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // Largest Prime Factor
        int largestPrimeFactor = 1;

        for (int i = 2; i <= n; i++) {

            if (n % i == 0) {

                boolean prime = true;

                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime) {
                    largestPrimeFactor = i;
                }
            }
        }

        // Output
        System.out.println("Largest Prime Factor = " + largestPrimeFactor);

        sc.close();
    }
}