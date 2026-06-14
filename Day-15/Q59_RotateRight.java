import java.util.Scanner;

public class Q59_RotateRight 
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

        System.out.print("Enter number of positions to rotate right: ");
        int k = sc.nextInt();
        k = k % n; 

        int[] temp = new int[k];
        for (int i = 0; i < k; i++) 
         {
            temp[i] = arr[n - k + i];
         }
        
        for (int i = n - 1; i >= k; i--) 
        {
            arr[i] = arr[i - k];
        }

        for (int i = 0; i < k; i++) 
        {
            arr[i] = temp[i];
        }

        System.out.print("Right Rotated Array: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}