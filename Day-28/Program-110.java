import java.util.Scanner;

public class Program110 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int accountNo = 0;
        String name = "";
        String accountType = "";
        double balance = 0;
        int choice;
        double amount;

        do {

            System.out.println("\n========================================");
            System.out.println("      BANK ACCOUNT MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Account Number : ");
                    accountNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Account Holder Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Account Type (Saving/Current) : ");
                    accountType = sc.nextLine();

                    System.out.print("Enter Initial Balance : ");
                    balance = sc.nextDouble();

                    System.out.println("\nAccount Created Successfully.");
                    break;

                case 2:

                    if (accountNo == 0) {
                        System.out.println("Please Create an Account First.");
                    } else {

                        System.out.print("Enter Deposit Amount : ");
                        amount = sc.nextDouble();

                        if (amount > 0) {
                            balance = balance + amount;
                            System.out.println("Amount Deposited Successfully.");
                            System.out.println("Updated Balance : " + balance);
                        } else {
                            System.out.println("Invalid Amount.");
                        }
                    }

                    break;

                case 3:

                    if (accountNo == 0) {
                        System.out.println("Please Create an Account First.");
                    } else {

                        System.out.print("Enter Withdrawal Amount : ");
                        amount = sc.nextDouble();

                        if (amount <= balance && amount > 0) {
                            balance = balance - amount;
                            System.out.println("Withdrawal Successful.");
                            System.out.println("Remaining Balance : " + balance);
                        } else {
                            System.out.println("Insufficient Balance or Invalid Amount.");
                        }
                    }

                    break;

                case 4:

                    if (accountNo == 0) {
                        System.out.println("No Account Found.");
                    } else {
                        System.out.println("Current Balance : " + balance);
                    }

                    break;

                case 5:

                    if (accountNo == 0) {
                        System.out.println("No Account Available.");
                    } else {

                        System.out.println("\n========== ACCOUNT DETAILS ==========");
                        System.out.println("Account Number : " + accountNo);
                        System.out.println("Account Holder : " + name);
                        System.out.println("Account Type   : " + accountType);
                        System.out.println("Balance        : " + balance);
                    }

                    break;

                case 6:

                    System.out.println("Thank You For Using Bank Management System.");
                    break;

                default:

                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 6);

        sc.close();
    }
}