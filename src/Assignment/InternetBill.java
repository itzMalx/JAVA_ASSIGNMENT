package Assignment;
import java.util.Scanner;
public class InternetBill
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int hours, minutes;
        int total;
        System.out.println("Enter browsing hours:");
        hours = sc.nextInt();
        System.out.println("Enter browsing minutes:");
        minutes = sc.nextInt();
        if(hours > 7)
        {
            System.out.println("Browsing limit exceeded");
        }
        else
        {
            if(hours == 5)
            {
                total = 200 + minutes;
            }
            else
            {
                total = (hours * 50) + minutes;
            }
            System.out.println("Total bill: " + total);
            sc.close();
        }
    }
}
