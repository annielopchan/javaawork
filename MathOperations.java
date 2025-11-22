
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[] args)
    {
        int a = 9;
        int b = 5;
        int c = a + b;
        
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(c > a); //condition 1
        System.out.println(c > b); //condition 2
        String result = (a > 0) ? "Positive" : "Negative";
        System.out.println("The number is: " + result);
  }
}