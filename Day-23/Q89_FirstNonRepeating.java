import java.util.Scanner;

public class Q89_FirstNonRepeating
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

            if (count == 1)
            {
                System.out.println("First non-repeating character is " + str.charAt(i));
                found = true;
                break;
            }
        }

        if (!found)
        {
            System.out.println("No non-repeating character found");
        }
    }
}