package Assignment_2;
import java.util.*;
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                found = true;
                break;
            }
        }
        System.out.println(found);
        sc.close();
    }
}
