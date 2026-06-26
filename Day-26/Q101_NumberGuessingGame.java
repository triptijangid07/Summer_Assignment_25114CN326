import java.util.Scanner;
import java.util.Random;

public class Q101_NumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess the number between 1 and 100");

        while (guess != target)
        {
            System.out.println("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > target)
            {
                System.out.println("Too high! Try again.");
            }
            else if (guess < target)
            {
                System.out.println("Too low! Try again.");
            }
        }

        System.out.println("Correct! The number was " + target);
        System.out.println("Total attempts: " + attempts);

        sc.close();
    }
}