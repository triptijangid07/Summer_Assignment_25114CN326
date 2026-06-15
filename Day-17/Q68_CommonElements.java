import java.util.Scanner;

public class Q68_CommonElements 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < n1; i++) 
        {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of second array:");
        for (int i = 0; i < n2; i++)
        {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Enter size of third array: ");
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        System.out.println("Enter elements of third array:");
        for (int i = 0; i < n3; i++) 
        {
            arr3[i] = sc.nextInt();
        }

        System.out.print("Common Elements in all the three arrays: ");
        boolean found = false;

        for (int i = 0; i < n1; i++) 
        {
            boolean Arr2 = false, Arr3 = false;

            for (int j = 0; j < n2; j++) 
            {
                if (arr1[i] == arr2[j])
                {
                    Arr2 = true;
                    break;
                }
            }

            for (int k = 0; k < n3; k++) 
            {
                if (arr1[i] == arr3[k])
                {
                    Arr3 = true;
                    break;
                }
            }

            if (Arr2 && Arr3) 
            {
                System.out.print(arr1[i] + " ");
                found = true;
            }
        }

        if (!found) 
        {
            System.out.println("No common elements found!");
        }

        sc.close();
    }
}