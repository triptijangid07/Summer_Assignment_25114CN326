import java.util.Scanner;

public class Q84_LowerToUpper
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z')
            {
                char upperCh = (char) (ch - 32);
                result = result + upperCh;
            }
            else
            {
                result = result + ch;
            }
        }

        System.out.println("Uppercase string is " + result);
    }
}