package Assignment_3;
import java.util.Scanner;
public class SalaryIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter the appraisal rating: ");
        double rating = sc.nextDouble();
        double result = calculateIncrement(salary, rating);
        if(result == -1) {
            System.out.println("Invalid Input");
        } else {
            System.out.println((int)result);
        }
    }
    public static double calculateIncrement(double salary, double rating) {
        if(salary <= 0 || rating < 1 || rating > 10) {
            return -1;
        }
        double increment = 0;
        if(rating >= 1 && rating <= 4) {
            increment = salary * 0.10;
        }
        else if(rating > 4 && rating <= 7) {
            increment = salary * 0.25;
        }
        else if(rating > 7 && rating <= 10) {
            increment = salary * 0.30;
        }
        return salary + increment;
    }
}