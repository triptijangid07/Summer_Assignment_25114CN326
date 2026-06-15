import java.util.Scanner;

public class Q62_MaxFrequency 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int maxFreq = 0;
        int maxEle = arr[0];

        for (int i = 0; i < n; i++) 
            {
            int count = 0;
            for (int j = 0; j < n; j++) 
            {
                if (arr[j] == arr[i]) 
                {
                    count++;
                }
            }
            if (count > maxFreq) 
                {
                maxFreq = count;
                maxEle = arr[i];
            }
        }

        System.out.println("Maximum Frequency Element: " + maxEle);
        System.out.println("Frequency: " + maxFreq);

        sc.close();
    }
}