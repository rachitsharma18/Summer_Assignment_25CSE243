import java.util.Scanner;

public class Program109 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bookId = 0;
        String bookName = "";
        String author = "";
        boolean issued = false;

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("      LIBRARY MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Add Book");
            System.out.println("2. Display Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID : ");
                    bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name : ");
                    bookName = sc.nextLine();

                    System.out.print("Enter Author Name : ");
                    author = sc.nextLine();

                    issued = false;

                    System.out.println("\nBook Added Successfully.");
                    break;

                case 2:

                    System.out.println("\n--------- Book Details ---------");

                    if (bookId == 0) {
                        System.out.println("No Book Available.");
                    } else {

                        System.out.println("Book ID      : " + bookId);
                        System.out.println("Book Name    : " + bookName);
                        System.out.println("Author Name  : " + author);

                        if (issued)
                            System.out.println("Status       : Issued");
                        else
                            System.out.println("Status       : Available");
                    }

                    break;

                case 3:

                    if (bookId == 0) {

                        System.out.println("No Book Found.");

                    } else if (issued) {

                        System.out.println("Book Already Issued.");

                    } else {

                        issued = true;
                        System.out.println("Book Issued Successfully.");
                    }

                    break;

                case 4:

                    if (bookId == 0) {

                        System.out.println("No Book Found.");

                    } else if (!issued) {

                        System.out.println("Book is Already Available.");

                    } else {

                        issued = false;
                        System.out.println("Book Returned Successfully.");
                    }

                    break;

                case 5:

                    if (bookId == 0) {

                        System.out.println("Library is Empty.");

                    } else {

                        System.out.print("Enter Book ID to Search : ");
                        int searchId = sc.nextInt();

                        if (searchId == bookId) {

                            System.out.println("\nBook Found");
                            System.out.println("Book ID : " + bookId);
                            System.out.println("Book Name : " + bookName);
                            System.out.println("Author : " + author);

                            if (issued)
                                System.out.println("Status : Issued");
                            else
                                System.out.println("Status : Available");

                        } else {

                            System.out.println("Book Not Found.");

                        }

                    }

                    break;

                case 6:

                    System.out.println("\nThank You for Using Library Management System.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}