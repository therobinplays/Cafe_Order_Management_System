package controller;

import java.util.Scanner;

public class OrdersController {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n ---------- ROBIN CAFE Offers to You these Features ---------- \n");

            System.out.println("\n ------------------------------------------------------------ \n");
            System.out.println("1. Display Menu.");
            System.out.println("2. Take an Order (add items.)");
            System.out.println("3. Remove an Item from Order.");
            System.out.println("4. View Current Order.");
            System.out.println("5. Print Receipt.");
            System.out.println("6. Checkout.");
            System.out.println("7. Pay Pending Orders.");
            System.out.println("8. Exit");
            System.out.println("\n ------------------------------------------------------------ \n");

            System.out.print("Enter choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1 -> displayMenu();
                case 2 -> addOrder();
                case 3 -> removeOrder();
                case 4 -> viewOrder();
                case 5 -> printReceipt();
                case 6 -> checkOut();
                case 7 -> payPending();

                case 8 -> {
                    System.out.println(" \n ------------------------------------------------------------ ");
                    System.out.println("You have successfully exited the system.");
                    System.out.println("----------> Visit us again <---------- ");
                    System.out.println(" ------------------------------------------------------------ \n ");

                    scan.close();
                    return;
                }

                default -> System.out.println("The item number does not exist. Please try again.");
            }
        }
    }

    static void displayMenu() {
        ItemsController itemsController = new ItemsController();
        itemsController.displayMenu();
    }

    static void addOrder() {
        System.out.println("[ORDER ADDED]");
    }

    static void removeOrder() {
        System.out.println("[ORDER REMOVED]");
    }

    static void viewOrder() {
        System.out.println("[VIEWING ORDER]");
    }

    static void printReceipt() {
        System.out.println("[RECEIPT PRINTED]");
    }

    static void checkOut() {
        System.out.println("[CHECKOUT COMPLETE]");
    }

    static void payPending() {
        System.out.println("[PENDING PAYMENT CLEARED]");
    }

}
