package Assignment;
import java.util.Scanner;
public class DivisorOf7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (7 % num == 0) {
            System.out.println(num + " is a divisor of 7");
        }
        if (7 % num != 0) {
            System.out.println(num + " is not a divisor of 7");
        }
        sc.close();
    }
}
