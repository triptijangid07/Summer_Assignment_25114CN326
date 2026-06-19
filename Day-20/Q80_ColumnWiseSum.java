import java.util.Scanner;

public class Q80_ColumnWiseSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns of matrix: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter elements of matrix: ");

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Column-wise sum is ");

        for (int j = 0; j < cols; j++)
        {
            int sum = 0;

            for (int i = 0; i < rows; i++)
            {
                sum = sum + arr[i][j];
            }

            System.out.println("Sum of column " + (j + 1) + " = " + sum);
        }
    }
}