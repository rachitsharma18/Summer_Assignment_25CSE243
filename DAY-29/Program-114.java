import java.util.Scanner;

public class Program114 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[20];
        int n = 0;
        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println("      ARRAY OPERATIONS SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Enter Array");
            System.out.println("2. Display Array");
            System.out.println("3. Search Element");
            System.out.println("4. Find Maximum");
            System.out.println("5. Find Minimum");
            System.out.println("6. Calculate Sum");
            System.out.println("7. Calculate Average");
            System.out.println("8. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Number of Elements : ");
                    n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter Element " + (i + 1) + " : ");
                        arr[i] = sc.nextInt();
                    }

                    System.out.println("Array Stored Successfully.");
                    break;

                case 2:

                    System.out.println("Array Elements are : ");

                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }

                    System.out.println();
                    break;

                case 3:

                    System.out.print("Enter Element to Search : ");
                    int key = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            found = true;
                            break;
                        }
                    }

                    if (found)
                        System.out.println("Element Found.");
                    else
                        System.out.println("Element Not Found.");

                    break;

                case 4:

                    int max = arr[0];

                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max)
                            max = arr[i];
                    }

                    System.out.println("Maximum Element = " + max);
                    break;

                case 5:

                    int min = arr[0];

                    for (int i = 1; i < n; i++) {
                        if (arr[i] < min)
                            min = arr[i];
                    }

                    System.out.println("Minimum Element = " + min);
                    break;

                case 6:

                    int sum = 0;

                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }

                    System.out.println("Sum = " + sum);
                    break;

                case 7:

                    sum = 0;

                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }

                    double avg = (double) sum / n;

                    System.out.println("Average = " + avg);
                    break;

                case 8:

                    System.out.println("Thank You.");
                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 8);

        sc.close();
    }
}