import java.util.Scanner;

public class Q72_DescendingSort 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
       {
            arr[i] = sc.nextInt();
        }

        // Using bubble sort technique
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++) 
           {
                if (arr[j] < arr[j + 1]) 
               { 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array after sorting in Descending Order:");
        for (int i = 0; i < n; i++) 
        {
           System.out.print(arr[i] + " ");
        }
          
    }
}