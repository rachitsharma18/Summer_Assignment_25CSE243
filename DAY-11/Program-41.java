import java.util.Scanner;

public class Program41 {

    // Function
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Sum = " + sum(num1, num2));

        sc.close();
    }
}