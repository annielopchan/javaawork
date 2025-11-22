
/**
 * Write a description of class DefaultValue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValue
{
    byte myByte;
    short myShort;
    int myInt;
    long myLong;
    float myFloat;
    double myDouble;
    char myChar;
    boolean myBoolean;
    
     public static void main(String[] args) {
     // Creatie an instance of the class
        DefaultValue obj = new DefaultValue();
        System.out.println("Byte: " + obj.myByte);
        System.out.println("Short: " + obj.myShort);
        System.out.println("Int: " + obj.myInt);
        System.out.println("Long: " + obj.myLong);
        System.out.println("Float: " + obj.myFloat);
        System.out.println("Double: " + obj.myDouble);
        System.out.println("Char: '" + obj.myChar + "'");
        System.out.println("Boolean: " + obj.myBoolean);
        
        /*
         * Fields in a class get default values automatically.
         * However, local variables inside a method do not get default value.
         * If you create a local variable in main and don't initialize it, the program won't compile because Java needs local variables to have a valur before use.
         */
    }
}