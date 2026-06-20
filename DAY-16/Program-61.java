import java.util.Scanner;

public class Program61 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements (1 to n+1 with one missing):");

        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int total = (n + 1) * (n + 2) / 2;

        System.out.println("Missing Number = " + (total - sum));

        sc.close();
    }
}