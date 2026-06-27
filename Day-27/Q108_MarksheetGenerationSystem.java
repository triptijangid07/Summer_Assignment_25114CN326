import java.util.Scanner;

class Q108_MarksheetGenerationSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name = sc.nextLine();

        System.out.println("Enter number of subjects: ");
        int n = sc.nextInt();

        String[] subjects = new String[n];
        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter subject " + (i + 1) + " name: ");
            subjects[i] = sc.next();

            System.out.println("Enter marks: ");
            marks[i] = sc.nextInt();

            total += marks[i];
        }

        double percentage = (double) total / n;

        String grade;

        if (percentage >= 90)
        {
            grade = "A+";
        }
        else if (percentage >= 75)
        {
            grade = "A";
        }
        else if (percentage >= 60)
        {
            grade = "B";
        }
        else if (percentage >= 40)
        {
            grade = "C";
        }
        else
        {
            grade = "Fail";
        }

        System.out.println("\n--- Marksheet ---");
        System.out.println("Name: " + name);

        for (int i = 0; i < n; i++)
        {
            System.out.println(subjects[i] + ": " + marks[i]);
        }

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}