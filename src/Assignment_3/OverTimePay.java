package Assignment_3;
import java.util.Scanner;
public class OverTimePay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours;
        double overtimePay;
        for(int i = 1; i <= 5; i++) {
            System.out.print("Enter working hours of employee " + i + ": ");
            hours = sc.nextInt();
            if(hours > 40) {
                overtimePay = (hours - 40) * 15;
            } else {
                overtimePay = 0;
            }
            System.out.println("Overtime pay for employee " + i + " = Rs. " + overtimePay);
        }
    }
}
