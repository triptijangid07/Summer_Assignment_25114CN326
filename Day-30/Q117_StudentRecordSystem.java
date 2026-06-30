import java.util.Scanner;

public class Q117_StudentRecordSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] rollNumbers = new int[n];
        double[] marks = new double[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter roll number of student " + (i + 1) + ": ");
            rollNumbers[i] = sc.nextInt();

            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
            sc.nextLine();
        }

        int choice;

        do
        {
            System.out.println("\n--- Student Record System ---");
            System.out.println("1. Display all records");
            System.out.println("2. Search student by roll number");
            System.out.println("3. Display topper");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1)
            {
                for (int i = 0; i < n; i++)
                {
                    System.out.println("Name: " + names[i] + ", Roll No: " + rollNumbers[i] + ", Marks: " + marks[i]);
                }
            }
            else if (choice == 2)
            {
                System.out.print("Enter roll number to search: ");
                int searchRoll = sc.nextInt();
                boolean found = false;

                for (int i = 0; i < n; i++)
                {
                    if (rollNumbers[i] == searchRoll)
                    {
                        System.out.println("Name: " + names[i] + ", Roll No: " + rollNumbers[i] + ", Marks: " + marks[i]);
                        found = true;
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("Student not found.");
                }
            }
            else if (choice == 3)
            {
                int topperIndex = 0;

                for (int i = 1; i < n; i++)
                {
                    if (marks[i] > marks[topperIndex])
                    {
                        topperIndex = i;
                    }
                }

                System.out.println("Topper: " + names[topperIndex] + " with marks " + marks[topperIndex]);
            }
            else if (choice == 4)
            {
                System.out.println("Exiting program.");
            }
            else
            {
                System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}