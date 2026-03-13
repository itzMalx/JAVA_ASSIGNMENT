package Assignment_2;
import java.util.*;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int uniqueArr[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int uniqueCount = 0;
        for(int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for(int j = 0; j < uniqueCount; j++) {
                if(arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                uniqueArr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        System.out.println("List with unique elements:");
        for(int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
    }
}