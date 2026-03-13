package Assignment_3;
import java.util.Scanner;
public class SalaryHike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current monthly salary: ");
        double oldSalary = sc.nextDouble();
        System.out.print("Enter hike percentage: ");
        double hike = sc.nextDouble();
        double newSalary = oldSalary + (oldSalary * hike / 100);
        System.out.println("New salary after hike: " + newSalary);
        sc.close();
    }
}
