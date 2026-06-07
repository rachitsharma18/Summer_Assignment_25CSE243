import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        // Store
        int max = (num1 > num2) ? num1 : num2;

        // LCM
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                System.out.println("LCM = " + max);
                break;
            }
            max++;
        }

        sc.close();
    }
}