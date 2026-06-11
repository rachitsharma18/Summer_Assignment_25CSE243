import java.util.Scanner;

public class Program33 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();

        // Pattern
        for (int i = rows; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
