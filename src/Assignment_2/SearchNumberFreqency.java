package Assignment_2;
import java.util.*;
public class SearchNumberFreqency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 25;
        int arr[] = new int[n];
        System.out.println("Enter 25 numbers:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                count++;
            }
        }
        if(count > 0) {
            System.out.println(key + " appears " + count + " times in the array.");
        } else {
            System.out.println(key + " is not present in the array.");
            sc.close();
        }
    }
}