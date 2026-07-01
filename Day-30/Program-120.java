import java.util.Scanner;

public class Program120 {

    static void display(String[] names, int[] marks) {
        System.out.println("\nStudent List");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + marks[i]);
        }
    }

    static int highest(int[] marks) {
        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max)
                max = marks[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        display(names, marks);

        System.out.println("\nHighest Marks = " + highest(marks));

        sc.close();
    }
}