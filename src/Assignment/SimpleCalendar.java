package Assignment;
import java.util.Scanner;
public class SimpleCalendar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int month, startDay, days = 0;
        System.out.println("Enter month number (1-12):");
        month = sc.nextInt();
        if(month < 1 || month > 12)
        {
            System.out.println("Invalid month. Program terminated.");
            return;
        }
        System.out.println("Enter starting day (1=Mon ... 7=Sun):");
        startDay = sc.nextInt();
        if(month == 1 || month == 3 || month == 5 || month == 7 || 
           month == 8 || month == 10 || month == 12)
        {
            days = 31;
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            days = 30;
        }
        else
        {
            System.out.println("Enter number of days in February (28 or 29):");
            days = sc.nextInt();
        }
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1; i < startDay; i++)
        {
            System.out.print("    ");
        }
        for(int d = 1; d <= days; d++)
        {
            System.out.printf("%3d ", d);
            if((d + startDay - 1) % 7 == 0)
            {
                System.out.println();
                sc.close();
            }
        }
    }
}