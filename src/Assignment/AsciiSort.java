package Assignment;
public class AsciiSort
{
    public static void main(String args[])
    {
        int i;
        System.out.println("Numbers (0-9):");
        for(i = 48; i <= 57; i++)
        {
            System.out.print((char)i + " ");
        }
        System.out.println("\nUppercase Alphabets (A-Z):");
        for(i = 65; i <= 90; i++)
        {
            System.out.print((char)i + " ");
        }
        System.out.println("\nLowercase Alphabets (a-z):");
        for(i = 97; i <= 122; i++)
        {
            System.out.print((char)i + " ");
        }
    }
}