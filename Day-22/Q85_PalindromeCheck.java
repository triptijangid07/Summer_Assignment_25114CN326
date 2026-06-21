import java.util.*;

public class Q85_PalindromeCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String ori = str;
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        if (ori.equals(rev))
        {
            System.out.println("The string is a palindrome.");
        }
        else
        {
            System.out.println("The string is NOT a palindrome.");
        }
    }
}