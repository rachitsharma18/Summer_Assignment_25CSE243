import java.util.Scanner;

public class Program118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {
                "Java",
                "Python",
                "C Programming",
                "Data Structures",
                "DBMS"
        };

        System.out.println("Library Books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }

        System.out.print("\nEnter book name to search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (String book : books) {
            if (book.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Book Available");
        else
            System.out.println("Book Not Available");

        sc.close();
    }
}