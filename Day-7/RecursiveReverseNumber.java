import java.util.Scanner;

public class RecursiveReverseNumber 
{

    static int reverse(int n, int rev) 
{
        if (n==0)                                    
            return rev;
        return reverse(n/10, rev*10 + n%10);   
    }

    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Reversed number = " + reverse(num, 0));
    }
}