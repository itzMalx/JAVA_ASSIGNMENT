package Assignment;
import java.util.Scanner;
public class SeriesSum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of i:");
        int i = sc.nextInt();
        int num = 1;
        int sum = 0;
        do
        {
            sum = sum + num;
            num++;
        }
        while(num <= i);
        System.out.println("Sum of the series is: " + sum);
        sc.close();
    }
}
