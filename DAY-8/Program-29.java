import java.util.Scanner;

public class Program29 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();

        // Pattern
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
