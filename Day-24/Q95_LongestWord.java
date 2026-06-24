import java.util.Scanner;

public class Q95_LongestWord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String longest = "";

        for (int i = 0; i < words.length; i++)
        {
            if (words[i].length() > longest.length())
            {
                longest = words[i];
            }
        }

        System.out.println("Longest Word is " + longest);

        sc.close();
    }
}