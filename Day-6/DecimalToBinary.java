import java.util.Scanner;

public class DecimalToBinary 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();
        String binary = "";
        
        int temp = n;
        while (temp > 0) 
        {
            binary = (temp % 2)+binary;
            temp = temp/2;
        }
        
        System.out.println(n + " in Binary is: " + binary);
        sc.close();
    }
}