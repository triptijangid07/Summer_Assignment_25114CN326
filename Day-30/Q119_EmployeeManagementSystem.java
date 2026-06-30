import java.util.Scanner;

public class Q119_EmployeeManagementSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] empIds = new int[n];
        double[] salaries = new double[n];
        String[] departments = new String[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter employee ID: ");
            empIds[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter department: ");
            departments[i] = sc.nextLine();

            System.out.print("Enter salary: ");
            salaries[i] = sc.nextDouble();
            sc.nextLine();
        }

        int choice;

        do
        {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Display all employees");
            System.out.println("2. Search employee by ID");
            System.out.println("3. Update salary");
            System.out.println("4. Display highest paid employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1)
            {
                for (int i = 0; i < n; i++)
                {
                    System.out.println("ID: " + empIds[i] + ", Name: " + names[i] + ", Department: " + departments[i] + ", Salary: " + salaries[i]);
                }
            }
            else if (choice == 2)
            {
                System.out.print("Enter employee ID to search: ");
                int searchId = sc.nextInt();
                boolean found = false;

                for (int i = 0; i < n; i++)
                {
                    if (empIds[i] == searchId)
                    {
                        System.out.println("Name: " + names[i] + ", Department: " + departments[i] + ", Salary: " + salaries[i]);
                        found = true;
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("Employee not found.");
                }
            }
            else if (choice == 3)
            {
                System.out.print("Enter employee ID to update salary: ");
                int updateId = sc.nextInt();
                boolean found = false;

                for (int i = 0; i < n; i++)
                {
                    if (empIds[i] == updateId)
                    {
                        System.out.print("Enter new salary: ");
                        salaries[i] = sc.nextDouble();
                        System.out.println("Salary updated successfully.");
                        found = true;
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("Employee not found.");
                }
            }
            else if (choice == 4)
            {
                int highestIndex = 0;

                for (int i = 1; i < n; i++)
                {
                    if (salaries[i] > salaries[highestIndex])
                    {
                        highestIndex = i;
                    }
                }

                System.out.println("Highest paid employee: " + names[highestIndex] + " with salary " + salaries[highestIndex]);
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