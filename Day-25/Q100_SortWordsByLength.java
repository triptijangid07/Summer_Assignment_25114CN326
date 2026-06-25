import java.util.Scanner;

public class Q100_SortWordsByLength
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of words: ");
        int n = sc.nextInt();
        String[] words = new String[n];

        System.out.println("Enter words: ");
        for (int i = 0; i < n; i++)
        {
            words[i] = sc.next();
        }

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (words[j].length() > words[j + 1].length())
                {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("Words sorted by length: ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(words[i]);
        }

        sc.close();
    }
}