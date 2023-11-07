package facadePattern;
import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("== Welcome to the Simplified Hotel Management System App! ==");
        while (true) {
            System.out.println();
            System.out.println("List of Services Offered:");
            System.out.println("\t1. Valet Parking");
            System.out.println("\t2. Housekeeping");
            System.out.println("\t3. Request Luggage Cart");
            System.out.println("\t4. Exit");
            System.out.println();
            System.out.print("Please choose the service you wanted to use: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("");
                    System.out.print("Enter vehicle plate number: ");
                    String plateNumber = scanner.nextLine();
                    frontDesk.valetParking(plateNumber);
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine();
                    frontDesk.houseKeeping(roomNumber);
                    break;
                case 3:
                    System.out.println("");
                    System.out.print("Enter the number of luggage carts: ");
                    int numberOfCarts = scanner.nextInt();
                    scanner.nextLine();
                    frontDesk.requestCart(numberOfCarts);
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Exiting Simplified Hotel Management System App.");
                    System.out.println("Thank you for using the app and have a Nice day!");
                    System.exit(0);
                default:
                    System.out.println("");
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
