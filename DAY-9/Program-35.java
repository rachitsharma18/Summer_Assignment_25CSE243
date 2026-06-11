import java.util.Scanner;

public class Program35 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();

        // Pattern
        for (int i = 1; i <= rows; i++) {

            char ch = (char) ('A' + i - 1);

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }

            System.out.println();
        }

        sc.close();
    }
}
