import java.util.Scanner;
import java.util.Arrays;

public class Q91_CheckAnagram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        boolean isAnagram = true;

        if (str1.length() != str2.length())
        {
            isAnagram = false;
        }
        else
        {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for (int i = 0; i < arr1.length; i++)
            {
                if (arr1[i] != arr2[i])
                {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram)
        {
            System.out.println("The strings are anagrams");
        }
        else
        {
            System.out.println("NOT an anagram");
        }
    }
}