import java.util.Scanner;

public class Program42 {

    // Function
    static int maximum(int a, int b) {

        if (a > b) {
            return a;
        }

        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Maximum = " + maximum(num1, num2));

        sc.close();
    }
}