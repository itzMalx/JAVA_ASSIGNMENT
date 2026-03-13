package Assignment_2;
import java.util.*;
public class Dice {
    public static void main(String[] args) {
        int rolls = 100;
        int frequency[] = new int[6]; 
        Random rand = new Random();
        for(int i = 0; i < rolls; i++) {
            int dice = rand.nextInt(6) + 1; 
            frequency[dice - 1]++;          
        }
        System.out.println("Number\tFrequency");
        for(int i = 0; i < 6; i++) {
            System.out.println((i + 1) + "\t" + frequency[i]);
        }
    }
}