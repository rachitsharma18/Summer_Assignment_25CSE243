import java.util.Scanner;

public class Program36 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        // Pattern
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
