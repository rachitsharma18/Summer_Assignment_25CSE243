import java.util.Scanner;

public class Program115 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "";
        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println("     STRING OPERATIONS SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Enter String");
            System.out.println("2. Display String");
            System.out.println("3. Convert to Upper Case");
            System.out.println("4. Convert to Lower Case");
            System.out.println("5. Find Length");
            System.out.println("6. Reverse String");
            System.out.println("7. Compare String");
            System.out.println("8. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    System.out.print("Enter String : ");
                    str = sc.nextLine();
                    System.out.println("String Saved Successfully.");
                    break;

                case 2:
                    System.out.println("String = " + str);
                    break;

                case 3:
                    System.out.println("Upper Case = " + str.toUpperCase());
                    break;

                case 4:
                    System.out.println("Lower Case = " + str.toLowerCase());
                    break;

                case 5:
                    System.out.println("Length = " + str.length());
                    break;

                case 6:
                    String rev = "";
                    for(int i = str.length()-1; i>=0; i--){
                        rev = rev + str.charAt(i);
                    }
                    System.out.println("Reverse = " + rev);
                    break;

                case 7:
                    System.out.print("Enter Another String : ");
                    String s2 = sc.nextLine();

                    if(str.equals(s2))
                        System.out.println("Both Strings are Equal.");
                    else
                        System.out.println("Strings are Different.");

                    break;

                case 8:
                    System.out.println("Thank You.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while(choice!=8);

        sc.close();
    }
}