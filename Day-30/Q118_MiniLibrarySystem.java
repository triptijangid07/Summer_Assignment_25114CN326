import java.util.Scanner;

public class Q118_MiniLibrarySystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bookNames = new String[n];
        String[] authorNames = new String[n];
        boolean[] isIssued = new boolean[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter name of book " + (i + 1) + ": ");
            bookNames[i] = sc.nextLine();

            System.out.print("Enter author of book " + (i + 1) + ": ");
            authorNames[i] = sc.nextLine();

            isIssued[i] = false;
        }

        int choice;

        do
        {
            System.out.println("\n--- Mini Library System ---");
            System.out.println("1. Display all books");
            System.out.println("2. Issue a book");
            System.out.println("3. Return a book");
            System.out.println("4. Search book by name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1)
            {
                for (int i = 0; i < n; i++)
                {
                    String status = isIssued[i] ? "Issued" : "Available";
                    System.out.println((i + 1) + ". " + bookNames[i] + " by " + authorNames[i] + " - " + status);
                }
            }
            else if (choice == 2)
            {
                System.out.print("Enter book name to issue: ");
                String name = sc.nextLine();
                boolean found = false;

                for (int i = 0; i < n; i++)
                {
                    if (bookNames[i].equalsIgnoreCase(name))
                    {
                        found = true;

                        if (isIssued[i])
                        {
                            System.out.println("Book is already issued.");
                        }
                        else
                        {
                            isIssued[i] = true;
                            System.out.println("Book issued successfully.");
                        }

                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("Book not found.");
                }
            }
            else if (choice == 3)
            {
                System.out.print("Enter book name to return: ");
                String name = sc.nextLine();
                boolean found = false;

                for (int i = 0; i < n; i++)
                {
                    if (bookNames[i].equalsIgnoreCase(name))
                    {
                        found = true;

                        if (!isIssued[i])
                        {
                            System.out.println("Book was not issued.");
                        }
                        else
                        {
                            isIssued[i] = false;
                            System.out.println("Book returned successfully.");
                        }

                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("Book not found.");
                }
            }
            else if (choice == 4)
            {
                System.out.print("Enter book name to search: ");
                String name = sc.nextLine();
                boolean found = false;

                for (int i = 0; i < n; i++)
                {
                    if (bookNames[i].equalsIgnoreCase(name))
                    {
                        String status = isIssued[i] ? "Issued" : "Available";
                        System.out.println(bookNames[i] + " by " + authorNames[i] + " - " + status);
                        found = true;
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("Book not found.");
                }
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
}