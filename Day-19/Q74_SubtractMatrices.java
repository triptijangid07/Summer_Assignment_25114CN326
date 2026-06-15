import java.util.Scanner;

public class Q74_SubtractMatrices
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] result = new int[r][c];

        System.out.println("Enter the elements of Matrix A:");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of Matrix B:");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                result[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Subtraction of the Matrices:");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}