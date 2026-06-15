import java.util.Scanner;

class Q69_BubbleSort 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
                {
                if (array[j] > array[j + 1]) 
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("The array after sorting is:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(array[i] + " ");
        }
    }
}