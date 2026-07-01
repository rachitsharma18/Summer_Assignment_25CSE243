import java.util.Scanner;

public class Program119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] id = new int[n];
        String[] name = new String[n];
        double[] salary = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter ID: ");
            id[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\nEmployee Details");
        for (int i = 0; i < n; i++) {
            System.out.println("ID: " + id[i] +
                    " Name: " + name[i] +
                    " Salary: " + salary[i]);
        }

        sc.close();
    }
}