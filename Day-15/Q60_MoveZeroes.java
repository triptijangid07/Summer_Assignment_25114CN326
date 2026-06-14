import java.util.Scanner;

public class Q60_MoveZeroes 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int p = 0;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i]!= 0) 
            {
                arr[p] = arr[i];
                p++;
            }
        }

        while (p < n) 
        {
            arr[p] = 0;
            p++;
        }

        System.out.print("Array after moving zeroes: ");
        
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}