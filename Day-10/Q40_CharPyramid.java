import java.util.Scanner;

public class Q40_CharPyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) 
            {
            for (int j = i; j < n; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) 
            {
                System.out.print((char) ('A' + k - 1));
            }
            for (int k = i - 1; k >= 1; k--) 
            {
                System.out.print((char) ('A' + k - 1));
            }
            System.out.println();
        }
        sc.close();
    }
}