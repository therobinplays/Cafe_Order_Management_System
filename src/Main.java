
import controller.OrdersController;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Welcome to Robin Dai ko Cafe !");

        System.out.print("Enter your phone number: ");
        String phone = scan.nextLine();

        if (users.containsKey(phone)) {
            System.out.println("Welcome back, " + users.get(phone) + " !");
        } else {
            System.out.print("Enter your name: ");
            String name = scan.nextLine();
            users.put(phone, name);
            System.out.println("Welcome, " + name + " !");
        }

        OrdersController.main(args);

        scan.close();
    }
}
