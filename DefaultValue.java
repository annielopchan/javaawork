
/**
 * Write a description of class DefaultValue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValue
{   
    // Declare member variables (fields) for all 8 primitive types without initializing them.
    byte myByte;
    short myShort;
    int myInt;
    long myLong;
    float myFloat;
    double myDouble;
    char myChar;
    boolean myBoolean;
    
     public static void main(String[] args) {
     // Create an instance of the class
        DefaultValue obj = new DefaultValue();
        
     // Printing the value
        System.out.println("Byte: " + obj.myByte);
        System.out.println("Short: " + obj.myShort);
        System.out.println("Int: " + obj.myInt);
        System.out.println("Long: " + obj.myLong);
        System.out.println("Float: " + obj.myFloat);
        System.out.println("Double: " + obj.myDouble);
        System.out.println("Char: '" + obj.myChar + "'");
        System.out.println("Boolean: " + obj.myBoolean);
        
     /*These default values apply only to class fields.
     * Local variables inside methods do not receive any default value.
     * If you create a local variable but don’t assign something to it,
     * Java will show a compile-time error because it must be initialized before it can be used.
     */
    }
}