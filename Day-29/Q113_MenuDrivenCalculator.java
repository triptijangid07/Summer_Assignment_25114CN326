import java.util.Scanner;

class Q113_MenuDrivenCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do
        {
            System.out.println("\n----- Menu Driven Calculator -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter first number: ");
                    double num1Add = sc.nextDouble();

                    System.out.println("Enter second number: ");
                    double num2Add = sc.nextDouble();

                    System.out.println("Sum = " + (num1Add + num2Add));
                    break;

                case 2:
                    System.out.println("Enter first number: ");
                    double num1Sub = sc.nextDouble();

                    System.out.println("Enter second number: ");
                    double num2Sub = sc.nextDouble();

                    System.out.println("Difference = " + (num1Sub - num2Sub));
                    break;

                case 3:
                    System.out.println("Enter first number: ");
                    double num1Mul = sc.nextDouble();

                    System.out.println("Enter second number: ");
                    double num2Mul = sc.nextDouble();

                    System.out.println("Product = " + (num1Mul * num2Mul));
                    break;

                case 4:
                    System.out.println("Enter first number: ");
                    double num1Div = sc.nextDouble();

                    System.out.println("Enter second number: ");
                    double num2Div = sc.nextDouble();

                    if (num2Div == 0)
                    {
                        System.out.println("Error: Division by zero not allowed");
                    }
                    else
                    {
                        System.out.println("Quotient = " + (num1Div / num2Div));
                    }
                    break;

                case 5:
                    System.out.println("Exiting Calculator. Bye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }

        } while (choice != 5);

        sc.close();
    }
}