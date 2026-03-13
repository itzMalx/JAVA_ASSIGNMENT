package Assignment;
import java.util.Scanner;
public class CharacterType
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character:");
        ch = sc.next().charAt(0);
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            System.out.println("It is an Alphabet");
        }
        else if(ch >= '0' && ch <= '9')
        {
            System.out.println("It is a Digit");
        }
        else
        {
            System.out.println("It is a Special Symbol");
            sc.close();
        }
    }
}
