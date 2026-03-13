package Assignment_2;
import java.util.*;
public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean visited[] = new boolean[n];
        System.out.println("Duplicate numbers in the array are:");
        boolean hasDuplicate = false;
        for(int i = 0; i < n; i++) {
            if(visited[i] == true) {
                continue; 
            }
            int count = 1;
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; 
                }
            }
            if(count > 1) {
                System.out.println(arr[i]);
                hasDuplicate = true;
            }
        }
        if(!hasDuplicate) {
            System.out.println("No duplicates found");
            sc.close();
        }
    }
}