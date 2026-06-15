import java.util.Scanner;

public class Q75_TransposeMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] transpose = new int[c][r];

        System.out.println("Enter the elements of Matrix:");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                transpose[j][i] = a[i][j];
            }
        }

        System.out.println("Transpose of Matrix:");
        for (int i = 0; i < c; i++)
        {
            for (int j = 0; j < r; j++)
            {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}