import java.util.Scanner;

public class Q64_RemoveDuplicates 
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

        int[] res = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) 
        {
            boolean isDupli = false;
            for (int j = 0; j < size; j++) 
            {
                if (arr[i] == res[j]) 
                {
                    isDupli = true;
                    break;
                }
            }
            if (!isDupli) 
            {
                res[size] = arr[i];
                size++;
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(res[i] + " ");
        }

        sc.close();
    }
}