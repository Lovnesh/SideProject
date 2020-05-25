import java.util.Scanner;
/**
 * Write a description of class StandardInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StandardInput
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class StandardInput
     */
    public StandardInput()
    {
        // initialise instance variables
    }

    /**
     * Read a number from the Text Terminal (the Standard Input)
     * @return    the number inserted in the text terminal
     */
    public static int getNumberInput()
    {
        Scanner reader = new Scanner(System.in);
        int inputNumber = reader.nextInt();
        return inputNumber;
    }
    
    /**
     * Read a String from the Text Terminal (the Standard Input)
     * @return    the String inserted in the text terminal
     */
    public static String getStringInput()
    {             
        Scanner reader = new Scanner(System.in);
        String inputString = reader.nextLine();
        return inputString;
    }
}
