import java.util.Scanner;

public class Program71 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Sorted Elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Element to Search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element Found at Index " + mid);
                found = true;
                break;
            }

            if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}