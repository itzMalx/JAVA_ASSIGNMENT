package Assignment;
import java.util.Scanner;
public class StudentGrade
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double exercise, exam, finalGrade;
        double sum = 0;
        int count = 0;
        while(true)
        {
            System.out.println("Enter exercise grade:");
            exercise = sc.nextDouble();
            System.out.println("Enter exam grade:");
            exam = sc.nextDouble();
            if(exercise == -1 || exam == -1)
            {
                break;
            }
            if(exercise < 0 || exercise > 10 || exam < 0 || exam > 10)
            {
                System.out.println("Invalid grade. Enter value between 0 and 10");
            }
            else
            {
                if(exercise >= 5 && exam >= 5)
                {
                    finalGrade = (exercise * 0.30) + (exam * 0.70);
                }
                else
                {
                    if(exercise < exam)
                        finalGrade = exercise;
                    else
                        finalGrade = exam;
                }
                System.out.println("Final Grade: " + finalGrade);
                sum = sum + finalGrade;
                count++;
            }
        }

        if(count > 0)
        {
            System.out.println("Average Grade: " + (sum / count));
            sc.close();
        }
    }
}
