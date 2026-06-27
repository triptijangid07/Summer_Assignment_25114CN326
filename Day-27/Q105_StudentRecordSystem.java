import java.util.Scanner;

class Q105_StudentRecordSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] rollNo = new int[n];
        double[] marks = new double[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter details for student " + (i + 1));

            System.out.println("Roll No: ");
            rollNo[i] = sc.nextInt();

            System.out.println("Name: ");
            names[i] = sc.next();

            System.out.println("Marks: ");
            marks[i] = sc.nextDouble();
        }

        System.out.println("\n--- Student Records ---");

        for (int i = 0; i < n; i++)
        {
            System.out.println("Roll No: " + rollNo[i] + " Name: " + names[i] + " Marks: " + marks[i]);
        }

        sc.close();
    }
}