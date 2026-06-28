import java.util.Scanner;

class Q112_ContactManagementSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int maxContacts = 100;
        String[] contactNames = new String[maxContacts];
        String[] contactNumbers = new String[maxContacts];
        int contactCount = 0;

        int choice = -1;

        while (choice != 5)
        {
            System.out.println("\n----- CONTACT MANAGEMENT SYSTEM -----");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1)
            {
                System.out.println("Enter Contact Name: ");
                String name = sc.next();

                System.out.println("Enter Contact Number: ");
                String number = sc.next();

                contactNames[contactCount] = name;
                contactNumbers[contactCount] = number;
                contactCount++;

                System.out.println("Contact added successfully.");
            }
            else if (choice == 2)
            {
                System.out.println("Enter Contact Name to search: ");
                String name = sc.next();

                int foundIndex = -1;
                for (int i = 0; i < contactCount; i++)
                {
                    if (contactNames[i].equals(name))
                    {
                        foundIndex = i;
                    }
                }

                if (foundIndex == -1)
                {
                    System.out.println("Contact not found.");
                }
                else
                {
                    System.out.println("Name: " + contactNames[foundIndex] + " | Number: " + contactNumbers[foundIndex]);
                }
            }
            else if (choice == 3)
            {
                System.out.println("Enter Contact Name to delete: ");
                String name = sc.next();

                int foundIndex = -1;
                for (int i = 0; i < contactCount; i++)
                {
                    if (contactNames[i].equals(name))
                    {
                        foundIndex = i;
                    }
                }

                if (foundIndex == -1)
                {
                    System.out.println("Contact not found.");
                }
                else
                {
                    for (int i = foundIndex; i < contactCount - 1; i++)
                    {
                        contactNames[i] = contactNames[i + 1];
                        contactNumbers[i] = contactNumbers[i + 1];
                    }
                    contactCount--;
                    System.out.println("Contact deleted successfully.");
                }
            }
            else if (choice == 4)
            {
                System.out.println("\n--- Contact List ---");
                for (int i = 0; i < contactCount; i++)
                {
                    System.out.println("Name: " + contactNames[i] + " | Number: " + contactNumbers[i]);
                }
            }
            else if (choice == 5)
            {
                System.out.println("Exiting Contact Management System.");
            }
            else
            {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}