import java.util.Scanner;
public class Q54_Frequency 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++)
            { 
                arr[i] = sc.nextInt();
            }
        System.out.print("Enter element to find frequency: ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == x)
                 count++;
        }
        System.out.println("Frequency of " + x + " is: " + count);
        sc.close();
    }
}