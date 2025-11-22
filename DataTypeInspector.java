
/**
 * Write a description of class DataTypeInspector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeInspector
{
    public static void main(String[] args) {

        // 1. byte (8-bit)
        byte bytevalue = 120;

        // 2. short (16-bit)
        short shortvalue = 18000;

        // 3. int (32-bit)
        int intvalue = 100000;

        // 4. long (64-bit)
        long longvalue = 150000L; 

        // 5. float (32-bit decimal)
        float floatvalue = 211.4f; 

        // 6. double (64-bit decimal)
        double doublevalue = 125.5;

        // 7. boolean (true/false)
        boolean booleanValue = true;

        // 8. char (Single 16-bit unicode character)
        char charvalue = 'A';

        System.out.println("Byte Value: " + bytevalue);
        System.out.println("Short Value: " + shortvalue);
        System.out.println("Int Value: " + intvalue);
        System.out.println("Long Value: " + longvalue);
        System.out.println("Float Value: " + floatvalue);
        System.out.println("Double Value: " + doublevalue);
        System.out.println("Boolean Value: " + booleanValue);
        System.out.println("Char Value: " + charvalue);
    }
}