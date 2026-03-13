package Assignment_3;
import java.util.Scanner;
public class OddEvenSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper = sc.nextInt();
        int sumOdd = sumOfOdd(lower, upper);
        int sumEven = sumOfEven(lower, upper);
        System.out.println("The sum of odd numbers from " + lower + " to " + upper + " is: " + sumOdd);
        System.out.println("The sum of even numbers from " + lower + " to " + upper + " is: " + sumEven);
        int difference = Math.abs(sumOdd - sumEven);
        System.out.println("The absolute difference between the two sums is: " + difference);
    }
    public static int sumOfOdd(int low, int high) {
        int sum = 0;
        for(int i = low; i <= high; i++) {
            if(i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static int sumOfEven(int low, int high) {
        int sum = 0;
        for(int i = low; i <= high; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}