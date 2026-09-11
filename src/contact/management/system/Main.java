package contact.management.system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[100];
        String[] phoneNumbers = new String[100];
        int count = 0;
        System.out.println("Select a menu item\n"
                + "1. Add contact\n"
                + "2. View contacts\n"
                + "3. Find a contact\n"
                + "4. Delete contact\n"
                + "5. Exit");

        int choice = scanner.nextInt();
        scanner.nextLine();

        while (choice > 0 && choice != 5 && choice < 6) {

            switch (choice) {
                case 1:
                    if (count < names.length) {
                        System.out.println("Write your name");
                        String name = scanner.nextLine();

                        System.out.println("Write your phone number");
                        String number = scanner.nextLine();
                        names[count] = name;
                        phoneNumbers[count] = number;
                        count++;
                        System.out.println("Contact added!");
                    } else {
                        System.out.println("No free space left.");
                    }
                case 2:
                    if (count == 0) {
                        System.out.println("The contact list is empty.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + names[i] + phoneNumbers[i]);
                        }
                    }
                case 3:
                    System.out.println("Enter the contact name");
                    String name = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (name.equals(names[i])) {
                            System.out.println(phoneNumbers[i]);
                        }
                    }
                    if (!found) {
                        System.out.println("Contact with name " + name + " not found.");
                    }
                case 4:
                    System.out.println("You have selected the option to delete a contact. Enter the name of the contact to delete.");
                    String name1 = scanner.nextLine();
                    for (int i = 0; i < names.length; i++) {
                        if (name1.equals(names[i])) {

                        }
                    }
            }
        }
    }
}