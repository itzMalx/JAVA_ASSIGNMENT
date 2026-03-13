package Assignment;
import java.util.Scanner;
public class CountCharacters
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        int letters = 0, digits = 0, others = 0;
        System.out.println("Enter String:");
        str = sc.nextLine();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            {
                letters++;
            }
            else if(ch >= '0' && ch <= '9')
            {
                digits++;
            }
            else
            {
                others++;
            }
        }
        System.out.println("Letters: " + letters + ", Digits: " + digits + ", Other Symbols: " + others);
        sc.close();
    }
}
