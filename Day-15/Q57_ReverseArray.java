import java.util.Scanner;

public class Q57_ReverseArray 
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

        
        int left = 0, right = n-1;
        while (left<right) 
            {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.print("Reversed Array: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}