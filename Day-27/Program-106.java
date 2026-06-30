import java.util.Scanner;

public class Program106 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int empId = 0, choice;
        String empName = "", department = "";
        double salary = 0;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Update Salary");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName = sc.nextLine();

                    System.out.print("Enter Department: ");
                    department = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary = sc.nextDouble();

                    System.out.println("Employee Added Successfully.");
                    break;

                case 2:
                    System.out.println("\n----- Employee Details -----");
                    System.out.println("Employee ID : " + empId);
                    System.out.println("Name        : " + empName);
                    System.out.println("Department  : " + department);
                    System.out.println("Salary      : " + salary);
                    break;

                case 3:
                    System.out.print("Enter New Salary: ");
                    salary = sc.nextDouble();
                    System.out.println("Salary Updated Successfully.");
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