import java.util.Scanner;

public class Q39_NumberPyramid {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) 
            {
            for (int j = i; j < n; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }
            for (int k = i - 1; k >= 1; k--) 
            {
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
}