import java.util.Scanner;

public class Q98_CommonCharacters
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.println("Common characters: ");

        for (int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);
            boolean foundInSecond = false;

            for (int j = 0; j < s2.length(); j++)
            {
                if (ch == s2.charAt(j))
                {
                    foundInSecond = true;
                    break;
                }
            }

            if (foundInSecond)
            {
                boolean printed = false;

                for (int k = 0; k < i; k++)
                {
                    if (s1.charAt(k) == ch)
                    {
                        printed = true;
                        break;
                    }
                }

                if (!printed)
                {
                    System.out.print(ch + " ");
                }
            }
        }

        sc.close();
    }
}