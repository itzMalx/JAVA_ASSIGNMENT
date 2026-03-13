package Assignment;
import java.util.Scanner;
public class PerfectFactorial
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;
        int i = 1;
        System.out.println("Enter a number:");
        num = sc.nextInt();
        if(num <= 0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            while(fact < num)
            {
                i++;
                fact = fact * i;
            }
            if(fact == num)
            {
                System.out.println(i);
            }
            else
            {
                System.out.println("Sorry. The given number is not a perfect factorial");
                sc.close();
            }
        }
    }
}
