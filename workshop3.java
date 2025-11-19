
/**
 * Write a description of class workshop3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop3
{
    int age; //instance variable
    static int qty; //static variable
    
    public static void main(String[] args)
    {
        // <className> <variable>= new <className>();
        int age = 19; //local variable
        
        workshop3 v1= new workshop3(); //calling instance variable in static method
        System.out.println(v1.age);
        
        System.out.println(age);
        System.out.println(workshop3.qty);
        
        System.out.println("Thisisthirdweekofprogramming");
    }

}
    