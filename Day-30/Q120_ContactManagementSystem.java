import java.util.Scanner;

public class Q120_ContactManagementSystem
{
    static String[] names = new String[100];
    static String[] phoneNumbers = new String[100];
    static int count = 0;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Search contact");
            System.out.println("4. Delete contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1)
            {
                addContact(sc);
            }
            else if (choice == 2)
            {
                displayContacts();
            }
            else if (choice == 3)
            {
                searchContact(sc);
            }
            else if (choice == 4)
            {
                deleteContact(sc);
            }
            else if (choice == 5)
            {
                System.out.println("Exiting program.");
            }
            else
            {
                System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }

    static void addContact(Scanner sc)
    {
        System.out.print("Enter contact name: ");
        String name = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        names[count] = name;
        phoneNumbers[count] = phone;
        count++;

        System.out.println("Contact added successfully.");
    }

    static void displayContacts()
    {
        if (count == 0)
        {
            System.out.println("No contacts found.");
        }
        else
        {
            for (int i = 0; i < count; i++)
            {
                System.out.println((i + 1) + ". " + names[i] + " - " + phoneNumbers[i]);
            }
        }
    }

    static void searchContact(Scanner sc)
    {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < count; i++)
        {
            if (names[i].equalsIgnoreCase(name))
            {
                System.out.println("Name: " + names[i] + ", Phone: " + phoneNumbers[i]);
                found = true;
                break;
            }
        }

        if (!found)
        {
            System.out.println("Contact not found.");
        }
    }

    static void deleteContact(Scanner sc)
    {
        System.out.print("Enter name to delete: ");
        String name = sc.nextLine();
        int index = -1;

        for (int i = 0; i < count; i++)
        {
            if (names[i].equalsIgnoreCase(name))
            {
                index = i;
                break;
            }
        }

        if (index == -1)
        {
            System.out.println("Contact not found.");
        }
        else
        {
            for (int i = index; i < count - 1; i++)
            {
                names[i] = names[i + 1];
                phoneNumbers[i] = phoneNumbers[i + 1];
            }

            count--;
            System.out.println("Contact deleted successfully.");
        }
    }
}