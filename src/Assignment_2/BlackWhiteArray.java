package Assignment_2;
import java.util.*;
public class BlackWhiteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100]; 
        int count = 0;
        while(true) {
            int num = sc.nextInt();
            if(num < 0) {
                break;
            }
            arr[count] = num;
            count++;
        }
        processArray(arr, count);
        for(int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void processArray(int arr[], int n) {
        for(int i = 0; i < n; i++) {
            boolean divisibleBy7 = (arr[i] % 7 == 0);
            boolean divisibleBy8 = (arr[i] % 8 == 0);
            if(divisibleBy7 && divisibleBy8) {
                arr[i] = -6; 
            } else if(divisibleBy7) {
                arr[i] = -2; 
            } else if(divisibleBy8) {
                arr[i] = -9; 
            }
        }
    }
}
