import java.util.Scanner;

public class Program105 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rollNo = 0;
        String name = "";
        String course = "";
        double marks = 0;

        int choice;

        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Update Marks");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll Number: ");
                    rollNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks = sc.nextDouble();

                    System.out.println("Student Record Saved Successfully.");
                    break;

                case 2:
                    System.out.println("\n----- Student Details -----");
                    System.out.println("Roll Number : " + rollNo);
                    System.out.println("Name        : " + name);
                    System.out.println("Course      : " + course);
                    System.out.println("Marks       : " + marks);
                    break;

                case 3:
                    System.out.print("Enter New Marks: ");
                    marks = sc.nextDouble();
                    System.out.println("Marks Updated Successfully.");
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}