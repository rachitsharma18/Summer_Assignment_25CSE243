import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start Number: ");
        int start = sc.nextInt();

        System.out.print("Enter End Number: ");
        int end = sc.nextInt();

        // Output
        System.out.println("Armstrong Numbers:");

        for (int num = start; num <= end; num++) {

            int temp = num;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}