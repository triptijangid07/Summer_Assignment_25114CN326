import java.util.Scanner;

public class Q90_FirstRepeating
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < str.length(); i++)
        {
            int count = 0;

            for (int j = 0; j < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    count++;
                }
            }

            if (count > 1)
            {
                System.out.println("First repeating character: " + str.charAt(i));
                found = true;
                break;
            }
        }

        if (!found)
        {
            System.out.println("No repeating character found");
        }
    }
}