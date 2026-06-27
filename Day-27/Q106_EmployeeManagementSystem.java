import java.util.Scanner;

class Q106_EmployeeManagementSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();

        int[] empId = new int[n];
        String[] empName = new String[n];
        String[] department = new String[n];
        double[] salary = new double[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter details for employee " + (i + 1));

            System.out.println("Employee ID: ");
            empId[i] = sc.nextInt();

            System.out.println("Name: ");
            empName[i] = sc.next();

            System.out.println("Department: ");
            department[i] = sc.next();

            System.out.println("Salary: ");
            salary[i] = sc.nextDouble();
        }

        System.out.println("\n--- Employee Records ---");

        for (int i = 0; i < n; i++)
        {
            System.out.println("ID: " + empId[i] + " Name: " + empName[i] + " Department: " + department[i] + " Salary: " + salary[i]);
        }

        sc.close();
    }
}
