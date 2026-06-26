import java.util.Scanner;

public class Q102_VotingEligibility
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Do you have a valid Voter ID? (yes/no): ");
        String voterId = sc.next();

        if (age >= 18 && voterId.equalsIgnoreCase("yes"))
        {
            System.out.println(name + ", you are eligible to vote.");
        }
        else if (age < 18)
        {
            int yearsLeft = 18 - age;
            System.out.println(name + ", you are not eligible. Wait " + yearsLeft + " more year(s).");
        }
        else
        {
            System.out.println(name + ", you are age eligible but need a valid Voter ID.");
        }

        sc.close();
    }
}