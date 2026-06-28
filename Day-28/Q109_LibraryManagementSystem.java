import java.util.Scanner;

class Q109_LibraryManagementSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int maxBooks = 100;
        String[] bookNames = new String[maxBooks];
        int[] bookIds = new int[maxBooks];
        boolean[] isIssued = new boolean[maxBooks];
        int bookCount = 0;

        int choice = -1;

        while (choice != 5)
        {
            System.out.println("\n----- LIBRARY MANAGEMENT SYSTEM -----");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1)
            {
                System.out.println("Enter Book ID: ");
                int id = sc.nextInt();

                System.out.println("Enter Book Name: ");
                String name = sc.next();

                bookIds[bookCount] = id;
                bookNames[bookCount] = name;
                isIssued[bookCount] = false;
                bookCount++;

                System.out.println("Book added successfully.");
            }
            else if (choice == 2)
            {
                System.out.println("Enter Book ID to issue: ");
                int id = sc.nextInt();

                int foundIndex = -1;
                for (int i = 0; i < bookCount; i++)
                {
                    if (bookIds[i] == id)
                    {
                        foundIndex = i;
                    }
                }

                if (foundIndex == -1)
                {
                    System.out.println("Book not found.");
                }
                else if (isIssued[foundIndex] == true)
                {
                    System.out.println("Book is already issued.");
                }
                else
                {
                    isIssued[foundIndex] = true;
                    System.out.println("Book issued successfully.");
                }
            }
            else if (choice == 3)
            {
                System.out.println("Enter Book ID to return: ");
                int id = sc.nextInt();

                int foundIndex = -1;
                for (int i = 0; i < bookCount; i++)
                {
                    if (bookIds[i] == id)
                    {
                        foundIndex = i;
                    }
                }

                if (foundIndex == -1)
                {
                    System.out.println("Book not found.");
                }
                else if (isIssued[foundIndex] == false)
                {
                    System.out.println ("Book was not issued.");
                }
                else
                {
                    isIssued[foundIndex] = false;
                    System.out.println("Book returned successfully.");
                }
            }
            else if (choice == 4)
            {
                System.out.println("\n--- Book List ---");
                for (int i = 0; i < bookCount; i++)
                {
                    System.out.println("ID: " + bookIds[i] + " | Name: " + bookNames[i] + " | Issued: " + isIssued[i]);
                }
            }
            else if (choice == 5)
            {
                System.out.println("Exiting Library System.");
            }
            else
            {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}