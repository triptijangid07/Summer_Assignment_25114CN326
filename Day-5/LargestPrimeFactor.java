import java.util.Scanner;

public class LargestPrimeFactor 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int fact=0;
        
        for (int i=2; i<=n; i++) {
            while (n % i == 0) 
            {
                fact = i;
                n = n/i;
            }
        }
        
        System.out.println("Largest Prime Factor = " + fact);
    
    }
}