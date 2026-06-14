import java.util.Scanner;

public class Program45 {

    // Function
    static boolean isPalindrome(int n) {

        int original = n;
        int reverse = 0;

        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

        sc.close();
    }
}