import java.util.Scanner;

public class Q66_UnionArrays 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < n1; i++) 
        {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of second array:");
        for (int i = 0; i < n2; i++) 
        {
            arr2[i] = sc.nextInt();
        }

        int[] union = new int[n1 + n2];
        int size = 0;

        for (int i = 0; i < n1; i++) 
        {
            union[size] = arr1[i];
            size++;
        }

        for (int i = 0; i < n2; i++) 
        {
            boolean found = false;
            for (int j = 0; j < size; j++)
            {
                if (arr2[i] == union[j]) 
                {
                    found = true;
                    break;
                }
            }
            if (!found) 
            {
                union[size] = arr2[i];
                size++;
            }
        }

        System.out.print("Union: ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(union[i] + " ");
        }

        sc.close();
    }
}