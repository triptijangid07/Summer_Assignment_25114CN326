import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int pro = 1;
        int r;
        while (num != 0) {
            r = num%10;
            pro = pro*r;
            num = num/10;
        }

        System.out.println("Product of digits = " + pro);
    }
}