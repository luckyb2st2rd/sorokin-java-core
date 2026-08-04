package contact.management.system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[100];
        int[] phoneNumbers = new int[100];
        int count = 0;
        System.out.println("Select a menu item\n" +
                "1. Add contact\n" +
                "2. View contacts\n" +
                "3. Find a contact\n" +
                "4. Delete contact\n" +
                "5. Exit");
        int pick = scanner.nextInt();
        while (pick > 0 && pick != 5 && pick < 6) {
            if (pick == 1) {
                if (count < names.length) {
                    System.out.print("Write your name");
                    String name = scanner.nextLine();
                    System.out.print("Write your phone number");
                    int number = scanner.nextInt();
                    names[count] = name;
                    phoneNumbers[count] = number;
                    count++;
                    System.out.println("Contact added!");
                } else {
                    System.out.println("No free space left.");
                }
            }
        }
    }
}
