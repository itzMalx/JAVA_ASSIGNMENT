package Assignment;
import java.util.Scanner;
 class LuckyCarNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num, temp, digit, sum = 0;
        System.out.println("Enter the car no:");
        num = sc.nextInt();
        if(num < 1000 || num > 9999)
        {
            System.out.println(num + " is not a valid car number");
        }
        else
        {
            temp = num;
            while(temp > 0)
            {
                digit = temp % 10;
                sum = sum + digit;
                temp = temp / 10;
            }
            if(sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0)
            {
                System.out.println("Lucky Number");
            }
            else
            {
                System.out.println("Sorry it's not my lucky number");
                sc.close();
            }
        }
    }
}
