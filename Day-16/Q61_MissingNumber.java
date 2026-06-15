import java.util.Scanner;

public class Q61_MissingNumber {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array (n-1 elements from 1 to n): ");
        int n = sc.nextInt();
        int[] arr = new int[n - 1];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n - 1; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int x = n * (n + 1)/2;
        int a = 0;
        for (int i = 0; i < n - 1; i++)
        {
            a += arr[i];
        }

        System.out.println("Missing Number: " + (x - a));

        sc.close();
    }
}