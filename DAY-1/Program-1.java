import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        // Sum
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Output
        System.out.println("Sum = " + sum);

        sc.close();
    }
}