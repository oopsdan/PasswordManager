package oopsdan;

import java.util.HashMap;
import java.util.Scanner;

public class PasswordManager {
    private static HashMap<String, String> passwordMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:\n1. Store password\n2. Retrieve password\n3. Exit");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    storePassword(input);
                    break;
                case 2:
                    retrievePassword(input);
                    break;
                case 3:
                    System.out.println("Exiting password manager...");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private static void storePassword(Scanner input) {
        System.out.print("Enter account name: ");
        String accountName = input.next();

        System.out.print("Enter password: ");
        String password = input.next();

        passwordMap.put(accountName, password);

        System.out.println("Password stored successfully!");
    }

    private static void retrievePassword(Scanner input) {
        System.out.print("Enter account name: ");
        String accountName = input.next();

        if (passwordMap.containsKey(accountName)) {
            String password = passwordMap.get(accountName);
            System.out.println("Password for " + accountName + " is " + password);
        } else {
            System.out.println("No password found for " + accountName);
        }
    }
}
