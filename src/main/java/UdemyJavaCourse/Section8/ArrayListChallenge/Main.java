package UdemyJavaCourse.Section8.ArrayListChallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static int choice;

    private static String newName;
    private static String newNumber;
    private static Contact newContact;

    private static String oldName;

    private static MobilePhone mobilePhone = new MobilePhone();

    private static void printMenu() {
        System.out.println("Select 1 to store a contact");
        System.out.println("Select 2 to modify a contact");
        System.out.println("Select 3 to remove a contact");
        System.out.println("Select 4 to query a contact");
        System.out.println("Select 5 to Quit");
        choice = scanner.nextInt();
        scanner.nextLine();
    }

    private static void store(){
        System.out.println("Enter the name you wish to add:");
        newName = scanner.nextLine();
        System.out.println("Enter the number you wish to add:");
        newNumber = scanner.nextLine();

        newContact = new Contact(newName,newNumber);
        mobilePhone.storeContact(newContact);
    }

    private static void modify() {
        System.out.println("Enter the contact name you wish to modify:");
        oldName = scanner.nextLine();
        mobilePhone.queryContact(oldName);

        System.out.println("Enter the new contact name you wish to add:");
        newName = scanner.nextLine();
        System.out.println("Enter the new contact number you wish to add:");
        newNumber = scanner.nextLine();
        newContact = new Contact(newName,newNumber);

        mobilePhone.updateContact(oldName, newContact);
    }

    private static void remove() {
        System.out.println("Enter the contact name you wish to remove:");
        newName = scanner.nextLine();

        mobilePhone.removeContact(newName);
    }

    private static void query() {
        System.out.println("Enter the name you wish to search for:");
        newName = scanner.nextLine();

        mobilePhone.queryContact(newName);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the contacts menu");

        boolean quit = false;

        while (!quit) {

            printMenu();

            switch (choice) {
                case 1:
                    store();
                    mobilePhone.printAllContacts();
                    break;
                case 2:
                    modify();
                    mobilePhone.printAllContacts();
                    break;
                case 3:
                    remove();
                    mobilePhone.printAllContacts();
                    break;
                case 4:
                    query();
                    mobilePhone.printAllContacts();
                    break;
                case 5:
                    quit = true;
                    System.out.println("Exiting program. Goodbye");
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
        scanner.close();

        System.out.println("Test comment");
    }

}
