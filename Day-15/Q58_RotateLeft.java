import java.util.Scanner;

public class Q58_RotateLeft 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of positions to rotate left: ");
        int k = sc.nextInt();
        k = k % n; 
        
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) 
        {
            temp[i] = arr[i];
        }

        for (int i = k; i < n; i++) 
        {
            arr[i - k] = arr[i];
        }

        for (int i = 0; i < k; i++)
        {
            arr[n - k + i] = temp[i];
        }

        System.out.print("Left Rotated Array: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}