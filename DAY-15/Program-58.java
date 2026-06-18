import java.util.Scanner;

public class Program58 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = first;

        System.out.println("Array After Left Rotation:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}