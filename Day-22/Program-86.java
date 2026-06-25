import java.util.Scanner;

public class Program86 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sentence: ");
        String str = sc.nextLine();

        String words[] = str.trim().split("\\s+");

        System.out.println("Words = " + words.length);

        sc.close();
    }
}