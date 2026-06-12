import java.util.Scanner;

public class Q45_Palindrome 
{
    static boolean isPalindrome(int n) 
    {
        int original = n, rev = 0;
        while (n > 0)
       {
            rev = rev * 10 + n % 10;
            n = n/10;
        }
        return original == rev;
    }

    public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isPalindrome(n))
            System.out.println(n + " is a Palindrome.");
        else
            System.out.println(n + " is NOT a Palindrome.");
        sc.close();
    }
}