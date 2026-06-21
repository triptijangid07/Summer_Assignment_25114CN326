import java.util.*;

public class Q86_CountWords
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        sentence = sentence.trim();
        int count = 0;

        if (sentence.length() > 0)
        {
            count = 1;
        }

        for (int i = 0; i < sentence.length(); i++)
        {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) != ' ')
            {
                count++;
            }
        }

        System.out.println("Number of words: " + count);
    }
}