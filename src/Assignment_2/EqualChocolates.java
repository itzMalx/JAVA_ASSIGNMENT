package Assignment_2;
import java.util.*;
public class EqualChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int chocolates[] = new int[N];
        for(int i = 0; i < N; i++) {
            chocolates[i] = sc.nextInt();
        }
        int total = 0;
        for(int i = 0; i < N; i++) {
            total += chocolates[i];
        }
        if(total % N == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
            sc.close();
        }
    }
}
