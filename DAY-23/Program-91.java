import java.util.Arrays;
import java.util.Scanner;

public class Program91 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String s2 = sc.nextLine();

        char a[] = s1.toLowerCase().toCharArray();
        char b[] = s2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        sc.close();
    }
}