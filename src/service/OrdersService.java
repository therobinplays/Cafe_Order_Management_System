package service;

import controller.ItemsController;
import java.util.Scanner;

public class OrdersService {

    public void addOrder() {
        ItemsController menu = new ItemsController();
        menu.displayMenu();  // menu has no Exit option now

        Scanner scan = new Scanner(System.in);
        int order = 0;

        try {
            do {
                System.out.print("Enter the item Number from the Menu that you want (enter 0 to Exit): ");

                if (!scan.hasNextInt()) {
                    System.out.println("Please enter a valid number.");
                    scan.next();
                    continue;
                }

                order = scan.nextInt();

                if (order == 0) {
                    System.out.println(" -------------------------- ");
                    System.out.println("You have successfully exited the ordering system.");
                    System.out.println("----------> Visit us again <----------");
                    break;
                }

                System.out.print("Enter quantity: ");

                if (!scan.hasNextInt()) {
                    System.out.println("Please enter a valid quantity.");
                    scan.next();
                    continue;
                }

                int quantity = scan.nextInt();

                switch (order) {
                    case 1: System.out.println("You ordered: Milk Coffee x " + quantity); break;
                    case 2: System.out.println("You ordered: Milk Tea x " + quantity); break;
                    case 3: System.out.println("You ordered: Milk Shake x " + quantity); break;
                    case 4: System.out.println("You ordered: Cup Cake x " + quantity); break;
                    case 5: System.out.println("You ordered: Chocolate Cake x " + quantity); break;
                    case 6: System.out.println("You ordered: Strawberry Cake x " + quantity); break;
                    case 7: System.out.println("You ordered: Vanilla Cake x " + quantity); break;
                    case 8: System.out.println("You ordered: Biscuit x " + quantity); break;
                    case 9: System.out.println("You ordered: Cookies x " + quantity); break;
                    case 10: System.out.println("You ordered: Hot Chocolate x " + quantity); break;
                    case 11: System.out.println("You ordered: Bread Sandwich x " + quantity); break;
                    case 12: System.out.println("You ordered: Chocolate Ice Cream x " + quantity); break;
                    case 13: System.out.println("You ordered: Strawberry Ice Cream x " + quantity); break;
                    case 14: System.out.println("You ordered: Vanilla Ice Cream x " + quantity); break;
                    case 15: System.out.println("You ordered: Hot Water x " + quantity); break;
                    case 16: System.out.println("You ordered: Cold Water x " + quantity); break;
                    default:
                        System.out.println("The item number does not exist. Please try again.");
                        break;
                }

            } while (true);

        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }

        scan.close();
    }

    public static void main(String[] args) {
        OrdersService service = new OrdersService();
        service.addOrder();
    }
}