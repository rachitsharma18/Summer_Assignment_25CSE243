import java.util.Scanner;

public class Program112 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";
        String phone = "";
        String email = "";

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println("     CONTACT MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Phone Number : ");
                    phone = sc.nextLine();

                    System.out.print("Enter Email : ");
                    email = sc.nextLine();

                    System.out.println("Contact Added Successfully.");
                    break;

                case 2:

                    if (name.equals("")) {
                        System.out.println("No Contact Available.");
                    } else {
                        System.out.println("\n------ Contact Details ------");
                        System.out.println("Name  : " + name);
                        System.out.println("Phone : " + phone);
                        System.out.println("Email : " + email);
                    }
                    break;

                case 3:

                    System.out.print("Enter Name to Search : ");
                    String search = sc.nextLine();

                    if (search.equalsIgnoreCase(name)) {
                        System.out.println("Contact Found");
                        System.out.println("Phone : " + phone);
                        System.out.println("Email : " + email);
                    } else {
                        System.out.println("Contact Not Found.");
                    }
                    break;

                case 4:

                    if (name.equals("")) {
                        System.out.println("No Contact Found.");
                    } else {

                        System.out.print("Enter New Phone Number : ");
                        phone = sc.nextLine();

                        System.out.print("Enter New Email : ");
                        email = sc.nextLine();

                        System.out.println("Contact Updated Successfully.");
                    }
                    break;

                case 5:

                    name = "";
                    phone = "";
                    email = "";

                    System.out.println("Contact Deleted Successfully.");
                    break;

                case 6:

                    System.out.println("Thank You.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}