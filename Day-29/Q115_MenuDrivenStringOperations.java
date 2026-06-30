import java.util.Scanner;

class Q115_MenuDrivenStringOperations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do
        {
            System.out.println("\n----- Menu Driven String Operations -----");
            System.out.println("1. Find Length");
            System.out.println("2. Reverse String");
            System.out.println("3. Check Palindrome");
            System.out.println("4. Count Vowels and Consonants");
            System.out.println("5. Convert to Uppercase");
            System.out.println("6. Convert to Lowercase");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 6)
            {
                System.out.println("Enter a string: ");
                String str = sc.next();

                if (choice == 1)
                {
                    System.out.println("Length = " + str.length());
                }
                else if (choice == 2)
                {
                    String reversed = "";
                    for (int i = str.length() - 1; i >= 0; i--)
                    {
                        reversed = reversed + str.charAt(i);
                    }
                    System.out.println("Reversed string = " + reversed);
                }
                else if (choice == 3)
                {
                    String reversed = "";
                    for (int i = str.length() - 1; i >= 0; i--)
                    {
                        reversed = reversed + str.charAt(i);
                    }

                    if (str.equalsIgnoreCase(reversed))
                    {
                        System.out.println(str + " is a Palindrome");
                    }
                    else
                    {
                        System.out.println(str + " is not a Palindrome");
                    }
                }
                else if (choice == 4)
                {
                    int vowels = 0;
                    int consonants = 0;

                    for (int i = 0; i < str.length(); i++)
                    {
                        char ch = Character.toLowerCase(str.charAt(i));

                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                        {
                            vowels++;
                        }
                        else if (ch >= 'a' && ch <= 'z')
                        {
                            consonants++;
                        }
                    }

                    System.out.println("Vowels = " + vowels);
                    System.out.println("Consonants = " + consonants);
                }
                else if (choice == 5)
                {
                    System.out.println("Uppercase = " + str.toUpperCase());
                }
                else if (choice == 6)
                {
                    System.out.println("Lowercase = " + str.toLowerCase());
                }
            }
            else if (choice == 7)
            {
                System.out.println("Exiting. Bye!");
            }
            else
            {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}