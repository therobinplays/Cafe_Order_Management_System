package controller;

import java.util.Scanner;

public class ItemsController {

    public void displayMenu() {

        System.out.println("\n  ----------> Robin Cafe <----------\n \n");
        System.out.println("This is the official Menu of Robin Cafe, Choose an item :\n");
        System.out.println("1.  Milk Coffee -------- Rs. 250");
        System.out.println("2.  Milk Tea ----------- Rs. 85");
        System.out.println("3.  Milk Shake --------- Rs. 500");
        System.out.println("4.  Cup Cake ----------- Rs. 150");
        System.out.println("5.  Chocolate Cake ----- Rs. 350");
        System.out.println("6.  Strawberry Cake ---- Rs. 350");
        System.out.println("7.  Vanilla Cake ------- Rs. 350");
        System.out.println("8.  Biscuit ------------ Rs. 250");
        System.out.println("9.  Cookies ------------ Rs. 280");
        System.out.println("10. Hot Chocolate ------ Rs. 150");
        System.out.println("11. Bread Sandwich ----- Rs. 230");
        System.out.println("12. Chocolate Ice Cream - Rs. 650");
        System.out.println("13. Strawberry Ice Cream - Rs. 650");
        System.out.println("14. Vanilla Ice Cream --- Rs. 650");
        System.out.println("15. Hot Water ---------- Rs. 75");
        System.out.println("16. Cold Water --------- Rs. 65");
        System.out.println("17. ----------> Exit <----------");
        System.out.println("\n \n");

        Scanner scan = new Scanner(System.in);
        int order = 0;

        try {
            do {
                System.out.print("Type the item number from the menu that you want: ");

                if (!scan.hasNextInt()) {
                    System.out.println("Please enter a valid number.");
                    scan.next();
                    continue;
                }

                order = scan.nextInt();

                if (order == 17) {
                    System.out.println(" -------------------------- ");
                    System.out.println("You have successfully exited the system.");
                    System.out.println("----------> Visit us again <----------");
                    return;
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
    }
}
