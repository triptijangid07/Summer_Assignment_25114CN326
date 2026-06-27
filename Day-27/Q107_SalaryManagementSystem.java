import java.util.Scanner;

class Q107_SalaryManagementSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();

        String[] empName = new String[n];
        double[] basicSalary = new double[n];
        double[] hra = new double[n];
        double[] da = new double[n];
        double[] netSalary = new double[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter details for employee " + (i + 1));

            System.out.println("Name: ");
            empName[i] = sc.next();

            System.out.println("Basic Salary: ");
            basicSalary[i] = sc.nextDouble();

            hra[i] = basicSalary[i] * 0.20;
            da[i] = basicSalary[i] * 0.10;
            netSalary[i] = basicSalary[i] + hra[i] + da[i];
        }

        System.out.println("\n--- Salary Slips ---");

        for (int i = 0; i < n; i++)
        {
            System.out.println("Name: " + empName[i]);
            System.out.println("Basic: " + basicSalary[i] + " HRA: " + hra[i] + " DA: " + da[i]);
            System.out.println("Net Salary: " + netSalary[i]);
            System.out.println("");
        }

        sc.close();
    }
}