import java.util.*;

public class Q88_RemoveSpaces
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) != ' ')
            {
                result = result + str.charAt(i);
            }
        }

        System.out.println("String after removing spaces: " + result);
    }
}