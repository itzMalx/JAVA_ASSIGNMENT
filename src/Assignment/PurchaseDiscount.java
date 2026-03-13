package Assignment;
import java.util.Scanner;
public class PurchaseDiscount
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int price, quantity;
        double purchaseAmount, discount, paidAmount;
        System.out.println("Enter price of item:");
        price = sc.nextInt();
        System.out.println("Enter quantity:");
        quantity = sc.nextInt();
        purchaseAmount = price * quantity;
        if(purchaseAmount > 1000)
        {
            discount = purchaseAmount * 0.10;
        }
        else
        {
            discount = purchaseAmount * 0.05;
        }
        paidAmount = purchaseAmount - discount;
        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount Amount: " + discount);
        System.out.println("Paid Amount: " + paidAmount);
        sc.close();
    }
}
