import java.util.Scanner;

public class Program31 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();

        // Pattern
        for (int i = 1; i <= rows; i++) {

            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }

        sc.close();
    }
}
