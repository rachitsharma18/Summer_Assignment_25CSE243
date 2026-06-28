import java.util.Scanner;
import java.util.Arrays;

public class Program100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}