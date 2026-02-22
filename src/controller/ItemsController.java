package controller;

public class ItemsController {
    
    public void displayMenu() {

        System.out.println("\n  ----------> Robin Cafe <----------\n");
        
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
    }

    public static void main(String[] args) {
        ItemsController items = new ItemsController();
        items.displayMenu();
    }
}