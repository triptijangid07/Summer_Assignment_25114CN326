import java.util.Scanner;

public class Q46_Armstrong {
    static boolean isArmstrong(int n) 
    {
        int original = n, sum = 0;
        int digits = String.valueOf(n).length();
        while (n > 0) {
            int d = n % 10;
            sum += (int) Math.pow(d, digits);
            n = n / 10;
        }
        return original == sum;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isArmstrong(n))
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is NOT an Armstrong number.");
        sc.close();
    }
}