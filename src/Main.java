import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
        System.out.println("17. -----> Exit <-----");
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

                switch (order) {
                    case 1: System.out.println("You ordered: Milk Coffee."); break;
                    case 2: System.out.println("You ordered: Milk Tea."); break;
                    case 3: System.out.println("You ordered: Milk Shake."); break;
                    case 4: System.out.println("You ordered: Cup Cake."); break;
                    case 5: System.out.println("You ordered: Chocolate Cake."); break;
                    case 6: System.out.println("You ordered: Strawberry Cake."); break;
                    case 7: System.out.println("You ordered: Vanilla Cake."); break;
                    case 8: System.out.println("You ordered: Biscuit."); break;
                    case 9: System.out.println("You ordered: Cookies."); break;
                    case 10: System.out.println("You ordered: Hot Chocolate."); break;
                    case 11: System.out.println("You ordered: Bread Sandwich."); break;
                    case 12: System.out.println("You ordered: Chocolate Ice Cream."); break;
                    case 13: System.out.println("You ordered: Strawberry Ice Cream."); break;
                    case 14: System.out.println("You ordered: Vanilla Ice Cream."); break;
                    case 15: System.out.println("You ordered: Hot Water."); break;
                    case 16: System.out.println("You ordered: Cold Water."); break;

                    case 17:
                        System.out.println(" -------------------------- ");
                        System.out.println("You have successfully exited the system.");
                        System.out.println("----------> Visit us again <----------");
                        return;

                    default:
                        System.out.println("The item number does not exist. Please try again.");
                        break;
                }

            } while (true);

        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
