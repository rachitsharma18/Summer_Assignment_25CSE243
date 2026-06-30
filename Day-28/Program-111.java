import java.util.Scanner;

public class Program111 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ticketNo = 0;
        String name = "";
        String source = "";
        String destination = "";
        int seats = 0;
        double fare = 0;

        int choice;

        do {

            System.out.println("\n========================================");
            System.out.println("        TICKET BOOKING SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Search Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Ticket Number : ");
                    ticketNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Passenger Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Source : ");
                    source = sc.nextLine();

                    System.out.print("Enter Destination : ");
                    destination = sc.nextLine();

                    System.out.print("Enter Number of Seats : ");
                    seats = sc.nextInt();

                    fare = seats * 500;

                    System.out.println("\nTicket Booked Successfully.");
                    System.out.println("Total Fare : " + fare);
                    break;

                case 2:

                    if (ticketNo == 0) {

                        System.out.println("No Ticket Booked.");

                    } else {

                        System.out.println("\n========== TICKET DETAILS ==========");
                        System.out.println("Ticket Number   : " + ticketNo);
                        System.out.println("Passenger Name  : " + name);
                        System.out.println("Source          : " + source);
                        System.out.println("Destination     : " + destination);
                        System.out.println("Seats           : " + seats);
                        System.out.println("Total Fare      : " + fare);
                    }

                    break;

                case 3:

                    if (ticketNo == 0) {

                        System.out.println("No Ticket Found.");

                    } else {

                        ticketNo = 0;
                        name = "";
                        source = "";
                        destination = "";
                        seats = 0;
                        fare = 0;

                        System.out.println("Ticket Cancelled Successfully.");
                    }

                    break;

                case 4:

                    if (ticketNo == 0) {

                        System.out.println("No Ticket Available.");

                    } else {

                        System.out.print("Enter Ticket Number to Search : ");
                        int search = sc.nextInt();

                        if (search == ticketNo) {

                            System.out.println("\nTicket Found");
                            System.out.println("Passenger Name : " + name);
                            System.out.println("Source         : " + source);
                            System.out.println("Destination    : " + destination);
                            System.out.println("Seats          : " + seats);
                            System.out.println("Fare           : " + fare);

                        } else {

                            System.out.println("Ticket Not Found.");
                        }
                    }

                    break;

                case 5:

                    System.out.println("Thank You For Using Ticket Booking System.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}