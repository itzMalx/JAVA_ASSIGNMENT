package Assignment;
public class AlphabetSeries
{
    public static void main(String args[])
    {
        char a = 'a';
        char z = 'z';
        for(a = 'a', z = 'z'; a <= 'z' && z >= 'a'; a++, z--)
        {
            System.out.print(a);
            System.out.print(z);
            System.out.print(" ");
        }
    }
}
