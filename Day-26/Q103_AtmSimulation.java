import java.util.Scanner;

public class Q103_AtmSimulation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double balance = 5000.0;
        int choice = -1;

        while (choice != 4)
        {
            System.out.println("----- ATM Menu -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1)
            {
                System.out.println("Your balance is: " + balance);
            }
            else if (choice == 2)
            {
                System.out.println("Enter amount to deposit: ");
                double depositAmount = sc.nextDouble();
                balance = balance + depositAmount;
                System.out.println("Deposit successful. New balance: " + balance);
            }
            else if (choice == 3)
            {
                System.out.println("Enter amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();

                if (withdrawAmount > balance)
                {
                    System.out.println("Insufficient balance.");
                }
                else
                {
                    balance = balance - withdrawAmount;
                    System.out.println("Withdrawal successful. New balance: " + balance);
                }
            }
            else if (choice == 4)
            {
                System.out.println("Thank you for using the ATM.");
            }
            else
            {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}