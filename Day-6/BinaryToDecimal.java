import java.util.Scanner;

public class BinaryToDecimal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int binary = sc.nextInt();
        
        int decimal = 0;
        int pow = 0;
        int temp = binary;
        
        while (temp > 0) 
        {
            int digit = temp % 10;
            decimal = decimal + digit * (int)Math.pow(2, pow);
            temp = temp / 10;
            pow++;
        }
        
        System.out.println(binary + " in Decimal is: " + decimal);
        sc.close();
    }
}