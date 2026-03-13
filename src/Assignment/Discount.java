package Assignment;
import java.util.Scanner;
public class Discount
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int quantity;
        float price, total, discount;
        System.out.println("Enter quantity:");
        quantity = sc.nextInt();
        System.out.println("Enter price per item:");
        price = sc.nextFloat();
        total = quantity * price;
        if(quantity > 500)
        {
            discount = total * 0.15f;
            total = total - discount;
        }
        System.out.println("Total expenses: " + total);
        sc.close();
    }
}