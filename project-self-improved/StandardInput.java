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
    private Scanner reader;

    /**
     * Constructor for objects of class StandardInput
     */
    public StandardInput()
    {
        // initialise instance variables
        reader = new Scanner(System.in);
    }

    /**
     * Read a number from the Text Terminal (the Standard Input)
     * @return    the number inserted in the text terminal
     */
    public int getNumberInput()
    {
        int inputNumber = reader.nextInt();
        return inputNumber;
    }
    
    /**
     * Read a String from the Text Terminal (the Standard Input)
     * @return    the String inserted in the text terminal
     */
    public String getStringInput()
    {             
        String inputString = reader.nextLine();
        return inputString;
    }
}
