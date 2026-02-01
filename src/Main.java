import controller.OrdersController;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class Main {

    static HashMap<String, String> users = new HashMap<>();
    static final String FILE_NAME = "user.txt";

    public static void main(String[] args) {
        loadUsers();

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Robin Dai ko Cafe!");

        System.out.print("Enter your phone number: ");
        String phone = scan.nextLine();

        if (users.containsKey(phone)) {
            System.out.println("Welcome back, " + users.get(phone) + "!");
        } else {
            System.out.print("Enter your name: ");
            String name = scan.nextLine();
            users.put(phone, name);
            saveUser(phone, name);
            System.out.println("Welcome, " + name + "!");
        }

        OrdersController.main(args);
        scan.close();
    }

    static void loadUsers() {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) return;

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    users.put(data[0], data[1]);
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error loading users.");
        }
    }

    static void saveUser(String phone, String name) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true));
            bw.write(phone + "," + name);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Error saving user.");
        }
    }
}
