package Assignment_2;
import java.util.*;
public class GreatestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int greatest = A[0];
        for(int i = 1; i < n; i++) {
            if(A[i] > greatest) {
                greatest = A[i];
            }
        }
        System.out.println("The greatest element in the array is: " + greatest);
        sc.close();
    }
}
