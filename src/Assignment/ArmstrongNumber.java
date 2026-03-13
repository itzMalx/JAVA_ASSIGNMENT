package Assignment;
import java.util.Scanner;
public class ArmstrongNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num, temp, rem, sum = 0;
        System.out.println("Enter a number:");
        num = sc.nextInt();
        temp = num;
        while(num > 0)
        {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if(sum == temp)
        {
            System.out.println("It is an Armstrong number");
        }
        else
        {
            System.out.println("It is not an Armstrong number");
            sc.close();
        }
    }
}
