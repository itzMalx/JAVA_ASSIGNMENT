package Assignment_3;
import java.util.Scanner;
public class BloodDonor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter weight: ");
        int weight = sc.nextInt();
        if(checkEligibility(age, weight)) {
            System.out.println("Eligible for blood donation");
        } else {
            System.out.println("Not eligible for blood donation");
        }
    }
    public static boolean checkEligibility(int age, int weight) {
        if(age > 18 && age <= 55 && weight > 45) {
            return true;
        } else {
            return false;
        }
    }
}
