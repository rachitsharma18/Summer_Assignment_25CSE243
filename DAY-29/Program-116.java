import java.util.Scanner;

public class Program116 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int productId = 0;
        String productName = "";
        int quantity = 0;
        double price = 0;

        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println("    INVENTORY MANAGEMENT SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Add Product");
            System.out.println("2. Display Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. Update Price");
            System.out.println("5. Calculate Inventory Value");
            System.out.println("6. Delete Product");
            System.out.println("7. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:

                    System.out.print("Enter Product ID : ");
                    productId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name : ");
                    productName = sc.nextLine();

                    System.out.print("Enter Quantity : ");
                    quantity = sc.nextInt();

                    System.out.print("Enter Price : ");
                    price = sc.nextDouble();

                    System.out.println("Product Added Successfully.");
                    break;

                case 2:

                    if(productId==0){
                        System.out.println("No Product Available.");
                    }
                    else{
                        System.out.println("\n------ Product Details ------");
                        System.out.println("Product ID : " + productId);
                        System.out.println("Product Name : " + productName);
                        System.out.println("Quantity : " + quantity);
                        System.out.println("Price : " + price);
                    }

                    break;

                case 3:

                    if(productId==0){
                        System.out.println("No Product Found.");
                    }
                    else{
                        System.out.print("Enter New Quantity : ");
                        quantity = sc.nextInt();
                        System.out.println("Quantity Updated Successfully.");
                    }

                    break;

                case 4:

                    if(productId==0){
                        System.out.println("No Product Found.");
                    }
                    else{
                        System.out.print("Enter New Price : ");
                        price = sc.nextDouble();
                        System.out.println("Price Updated Successfully.");
                    }

                    break;

                case 5:

                    if(productId==0){
                        System.out.println("No Product Found.");
                    }
                    else{
                        double total = quantity * price;
                        System.out.println("Total Inventory Value = " + total);
                    }

                    break;

                case 6:

                    productId = 0;
                    productName = "";
                    quantity = 0;
                    price = 0;

                    System.out.println("Product Deleted Successfully.");
                    break;

                case 7:

                    System.out.println("Thank You For Using Inventory Management System.");
                    break;