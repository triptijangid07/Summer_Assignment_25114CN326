import java.util.Scanner;

class Q110_BankAccountSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int maxAccounts = 100;
        int[] accountNumbers = new int[maxAccounts];
        String[] accountHolders = new String[maxAccounts];
        double[] balances = new double[maxAccounts];
        int accountCount = 0;

        int choice = -1;

        while (choice != 5)
        {
            System.out.println("\n----- BANK ACCOUNT SYSTEM -----");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1)
            {
                System.out.println("Enter Account Number: ");
                int accNo = sc.nextInt();

                System.out.println("Enter Account Holder Name: ");
                String name = sc.next();

                System.out.println("Enter Initial Balance: ");
                double balance = sc.nextDouble();

                accountNumbers[accountCount] = accNo;
                accountHolders[accountCount] = name;
                balances[accountCount] = balance;
                accountCount++;

                System.out.println("Account created successfully.");
            }
            else if (choice == 2)
            {
                System.out.println("Enter Account Number: ");
                int accNo = sc.nextInt();

                int foundIndex = -1;
                for (int i = 0; i < accountCount; i++)
                {
                    if (accountNumbers[i] == accNo)
                    {
                        foundIndex = i;
                    }
                }

                if (foundIndex == -1)
                {
                    System.out.println("Account not found.");
                }
                else
                {
                    System.out.println("Enter amount to deposit: ");
                    double amount = sc.nextDouble();

                    balances[foundIndex] = balances[foundIndex] + amount;
                    System.out.println("Amount deposited successfully.");
                }
            }
            else if (choice == 3)
            {
                System.out.println("Enter Account Number: ");
                int accNo = sc.nextInt();

                int foundIndex = -1;
                for (int i = 0; i < accountCount; i++)
                {
                    if (accountNumbers[i] == accNo)
                    {
                        foundIndex = i;
                    }
                }

                if (foundIndex == -1)
                {
                    System.out.println("Account not found.");
                }
                else
                {
                    System.out.println("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();

                    if (amount > balances[foundIndex])
                    {
                        System.out.println("Insufficient balance.");
                    }
                    else
                    {
                        balances[foundIndex] = balances[foundIndex] - amount;
                        System.out.println("Amount withdrawn successfully.");
                    }
                }
            }
            else if (choice == 4)
            {
                System.out.println("\n--- Account List ---");
                for (int i = 0; i < accountCount; i++)
                {
                    System.out.println("Acc No: " + accountNumbers[i] + " | Name: " + accountHolders[i] + " | Balance: " + balances[i]);
                }
            }
            else if (choice == 5)
            {
                System.out.println("Exiting Bank System.");
            }
            else
            {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}