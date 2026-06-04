import java.util.Scanner;

public class CheckArmstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to check: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int digits = 0;
        while(temp > 0) 
        {
          digits++;
          temp = temp/10;
        }
        int sum = 0;
        int t = num;

        while (t!= 0) {
            int digit = t % 10;        
            sum += Math.pow(digit, digits); 
            t = t/10;              
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number!");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
    }
}