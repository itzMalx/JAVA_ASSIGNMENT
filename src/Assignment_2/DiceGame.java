package Assignment_2;
import java.util.*;
public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turns = 10;
        int arun[] = new int[turns];
        int naveen[] = new int[turns];
        System.out.println("Enter Arun's 10 dice values:");
        for(int i = 0; i < turns; i++) {
            arun[i] = sc.nextInt();
        }
        System.out.println("Enter Naveen's 10 dice values:");
        for(int i = 0; i < turns; i++) {
            naveen[i] = sc.nextInt();
        }
        int arunScore = 0;
        int naveenScore = 0;
        for(int i = 0; i < turns; i++) {
            if(arun[i] > naveen[i]) {
                arunScore++;
            } else if(naveen[i] > arun[i]) {
                naveenScore++;
            }
        }
        if(arunScore > naveenScore) {
            System.out.println("Arun Wins!!!");
        } else if(naveenScore > arunScore) {
            System.out.println("Naveen Wins!!!");
        } else {
            System.out.println("It's a Tie!!!");
            sc.close();
        }
    }
}
