import java.util.Scanner;

/**
 * Write a description of class Gradeevaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gradeevaluator
{ public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your grade");
        int grade = sc.nextInt();
        
        //ternary operator 
        String result = (grade >= 40) ? "Pass" : "Fail";
        System.out.println("Result=" + result);
         }
    
}