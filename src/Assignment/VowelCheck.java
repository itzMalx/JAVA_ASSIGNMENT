package Assignment;
import java.util.Scanner;
public class VowelCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Entered character is a Vowel");
                break;
            default:
                if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
                {
                    System.out.println("Entered character is a Consonant");
                }
                else
                {
                    System.out.println("Entered character is a Symbol");
                    sc.close();
                }
        }
    }
}
