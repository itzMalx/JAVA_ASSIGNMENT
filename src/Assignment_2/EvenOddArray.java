package Assignment_2;
import java.util.*;
public class EvenOddArray {
    public static void main(String[] args) {
        int even[] = new int[5];   
        int odd[] = new int[5];    
        int eIndex = 0;
        int oIndex = 0;
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 1; i <= 10; i++) {

            if(i % 2 == 0) {         
                even[eIndex] = i;
                evenSum = evenSum + i;
                eIndex++;
            }
            else {                    
                odd[oIndex] = i;
                oddSum = oddSum + i;
                oIndex++;
            }
        }
        System.out.println("Even numbers are:");
        for(int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println("\nSum of even numbers: " + evenSum);
        System.out.println("\nOdd numbers are:");
        for(int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println("\nSum of odd numbers: " + oddSum);
    }
}
