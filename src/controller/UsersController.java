package controller;

import controller.OrdersController;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class UsersController {

    static HashMap<String, String[]> users = new HashMap<>();
    static final String FILE_NAME = "util/users.txt";

    public static void start(String[] args) {
    main(args);
    }

    public static void main(String[] args) {

        loadUsers();

        Scanner scan = new Scanner(System.in);

        System.out.println("\n ---------- Welcome to Robin Dai ko Cafe ! --------- \n");

        System.out.println("Chose Your Option for");
        System.out.println("( Choose an option: If you already have an account, log in. Otherwise, register a new account first. )");
        System.out.println("1. Login");
        System.out.println("2. Register");

        System.out.print("\n Enter choice: ");
        int choice = scan.nextInt();
        scan.nextLine();

        if (choice == 1) {
            login(scan);
        } 
        else if (choice == 2) {
            register(scan);
        } 
        else {
            System.out.println("Invalid choice !");
            return;
        }

        System.out.println("\n Redirecting to Cafe System...\n");
        OrdersController.main(args);
    }

  
    static void login(Scanner scan) {

        String phone = getValidPhone(scan);

        if (!users.containsKey(phone)) {
            System.out.println("\n User not found, Please register first.");
            System.exit(0);
        }

        String[] userData = users.get(phone);
        String savedPassword = userData[1];

        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter password: ");
            String password = scan.nextLine();

            if (password.equals(savedPassword)) {
                System.out.println("\n Login Successful, Welcome back " + userData[0] + " to Robin Dai ko Cafe !");
                return;
            } else {
                attempts--;
                System.out.println("Wrong password, " + attempts + " attemopts left !");
            }
        }

        System.out.println("\n Too many wrong attempts, Access denied !");
        System.exit(0);
    }


    static void register(Scanner scan) {

        String phone = getValidPhone(scan);

        if (users.containsKey(phone)) {
            System.out.println("\n This phone number is already registered, Please login.");
            System.exit(0);
        }

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        String password = createPassword(scan);

        users.put(phone, new String[]{name, password});
        saveAllUsers();

        System.out.println("\n Registration Successful, Welcome, " + name + " to Robin Dai ko cafe !");
    }


    static String createPassword(Scanner scan) {

        String password;

        while (true) {
            System.out.print("Create password (min 4 characters): ");
            password = scan.nextLine();

            if (password.length() >= 4) {
                break;
            } else {
                System.out.println("Your Provided Password too short for the security !");
            }
        }

        return password;
    }


    static String getValidPhone(Scanner scan) {

        String phone;

        while (true) {

            System.out.print("Enter phone number (10 digits): ");
            phone = scan.nextLine().trim();

            if (phone.matches("\\d{10}")) {
                break;
            } else {
                System.out.println("Invalid phone number, Please enter exactly 10 digits number only ! \n");
            }
        }

        return phone;
    }


    static void loadUsers() {

        try {

            File file = new File(FILE_NAME);

            if (!file.exists()) {
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 3) {
                    String phone = data[0].trim();
                    String name = data[1].trim();
                    String password = data[2].trim();

                    users.put(phone, new String[]{name, password});
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error loading users !");
        }
    }


    static void saveAllUsers() {

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME));

            for (String phone : users.keySet()) {

                String name = users.get(phone)[0];
                String password = users.get(phone)[1];

                bw.write(phone + "," + name + "," + password);
                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {
            System.out.println("Error saving users !");
        }
    }
}