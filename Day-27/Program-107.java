import java.util.Scanner;

public class Program107 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        double basic, hra, da, ta, gross;
        int choice;

        do {
            System.out.println("\n===== Salary Management System =====");
            System.out.println("1. Generate Salary");
            System.out.println("2. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    basic = sc.nextDouble();

                    hra = basic * 0.20;
                    da = basic * 0.10;
                    ta = basic * 0.05;

                    gross = basic + hra + da + ta;

                    System.out.println("\n------ Salary Slip ------");
                    System.out.println("Employee Name : " + name);
                    System.out.println("Basic Salary  : " + basic);
                    System.out.println("HRA           : " + hra);
                    System.out.println("DA            : " + da);
                    System.out.println("TA            : " + ta);
                    System.out.println("Gross Salary  : " + gross);
                    break;

                case 2:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 2);

        sc.close();
    }
}