import java.util.Scanner;

public class Program104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;
        int ans;

        System.out.println("===== Java Quiz =====");

        System.out.println("\nQ1. Java is?");
        System.out.println("1. Programming Language");
        System.out.println("2. Operating System");
        System.out.println("3. Browser");
        System.out.print("Answer: ");
        ans = sc.nextInt();
        if (ans == 1)
            score++;

        System.out.println("\nQ2. Which keyword is used to create an object?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. static");
        System.out.print("Answer: ");
        ans = sc.nextInt();
        if (ans == 2)
            score++;

        System.out.println("\nQ3. Size of int in Java?");
        System.out.println("1. 2 bytes");
        System.out.println("2. 4 bytes");
        System.out.println("3. 8 bytes");
        System.out.print("Answer: ");
        ans = sc.nextInt();
        if (ans == 2)
            score++;

        System.out.println("\nYour Score = " + score + "/3");

        sc.close();
    }
}