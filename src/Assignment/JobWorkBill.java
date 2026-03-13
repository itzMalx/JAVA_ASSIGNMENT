package Assignment;
import java.util.Scanner;
public class JobWorkBill
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int pages, copies;
        int typingCost, printingCost, total;
        System.out.println("Enter number of pages:");
        pages = sc.nextInt();
        System.out.println("Enter number of copies:");
        copies = sc.nextInt();
        typingCost = pages * 3;
        if(copies == 1)
        {
            printingCost = pages * 1;
        }
        else
        {
            printingCost = (pages * 1) + ((copies - 1) * pages * 3);
        }
        total = typingCost + printingCost;
        System.out.println("Total bill: " + total);
        sc.close();
    }
}
