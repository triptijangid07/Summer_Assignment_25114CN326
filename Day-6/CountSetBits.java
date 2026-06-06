import java.util.Scanner;

public class CountSetBits 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int count = 0;
        int temp = n;
        
        while (temp > 0) 
        {
            if (temp % 2 == 1) {
                count++;
            }
            temp = temp/2;
        }
        
        System.out.println("Set bits in " + n + " are: " + count);
        sc.close();
    }
}