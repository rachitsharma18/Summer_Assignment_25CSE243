import java.util.Scanner;

public class Program101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess;

        System.out.println("===== Number Guessing Game =====");
        System.out.println("Guess a number between 1 and 100");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too High! Try Again.");
            } 
            else if (guess < randomNumber) {
                System.out.println("Too Low! Try Again.");
            } 
            else {
                System.out.println(" Congratulations! You guessed the correct number.");
                break;
            }
        }

        sc.close();
    }
}