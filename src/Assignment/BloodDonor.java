package Assignment;
import java.util.Scanner;
public class BloodDonor
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age;
        float weight;
        System.out.println("Enter age:");
        age = sc.nextInt();
        System.out.println("Enter weight:");
        weight = sc.nextFloat();
        if(age > 18 && age < 55 && weight > 45)
        {
            System.out.println("Eligible for blood donation");
        }
        else
        {
            System.out.println("Not eligible for blood donation");
            sc.close();
        }
    }
}
