import java.util.Scanner;

public class Program54 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Element: ");
        int key = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println("Frequency = " + count);

        sc.close();
    }
}