package Assignment_2;
import java.util.*;
public class MergeAndSortArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int X[] = new int[M];
        for(int i = 0; i < M; i++) {
            X[i] = sc.nextInt();
        }
        int N = sc.nextInt();
        int Y[] = new int[N];
        for(int i = 0; i < N; i++) {
            Y[i] = sc.nextInt();
        }
        int O = sc.nextInt();
        int Z[] = new int[O];
        for(int i = 0; i < O; i++) {
            Z[i] = sc.nextInt();
        }
        int totalSize = M + N + O;
        int merged[] = new int[totalSize];
        int index = 0;
        for(int i = 0; i < M; i++) {
            merged[index++] = X[i];
        }
        for(int i = 0; i < N; i++) {
            merged[index++] = Y[i];
        }
        for(int i = 0; i < O; i++) {
            merged[index++] = Z[i];
        }
        for(int i = 0; i < totalSize - 1; i++) {
            for(int j = i + 1; j < totalSize; j++) {
                if(merged[i] > merged[j]) {
                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }
        for(int i = 0; i < totalSize; i++) {
            System.out.print(merged[i] + " ");
            sc.close();
        }
    }
}
