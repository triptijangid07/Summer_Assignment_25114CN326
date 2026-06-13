import java.util.Scanner;
public class Q56_FindDuplicates 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++)
            {
            arr[i] = sc.nextInt();
            }

        System.out.print("Duplicate element: ");
        boolean found = false;
        for (int i = 0; i < n; i++) 
            {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] == arr[j])
                  {
                     System.out.print(arr[i] + " "); 
                     found = true;
                     break; }
            }
        }
        if (!found) 
            System.out.println("No duplicates found");
        else 
            System.out.println();
        sc.close();
    }
}