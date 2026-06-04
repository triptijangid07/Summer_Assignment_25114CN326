import java.util.Scanner;

public class ArmstrongRange 
{

    static boolean isArmstrong(int num) 
    {
        int temp = num;
        int sum = 0;
        int digits = 0;
        int ori = num;
        while(temp > 0) 
        {
           digits++;
           temp = temp / 10;
        }

        while (num > 0) {
            int digit = num % 10;
            sum = sum+ (int) Math.pow(digit, digits);
            num = num/10;
        }

        return sum == ori;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers are:");

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
