import java.util.Scanner;

public class Q94_StringCompression
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String com = "";
        int count = 1;

        for (int i = 0; i < str.length(); i++)
        {
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1))
            {
                count++;
                i++;
            }

            com = com + str.charAt(i) + "" + count;
            count = 1;
        }

        System.out.println("Compressed String: " + com);

        sc.close();
    }
}