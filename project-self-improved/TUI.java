import java.util.ArrayList;

/**
 * Initialises the text user interface for the game of life.
 */
public class TUI {
    
    
    public TUI() {
    } 

    /**
     * Draws the grid with the given state of the matrix.
     * @param grid the grid to be drawn
     */
    public static void draw(final Grid grid) {
        int rowLength = grid.getRowLength();
        int columnLength = grid.getColumnLength();
        for(int i = 0; i < columnLength; i++) {
            for(int j = 0; j < rowLength; j++) {
                boolean cellState = grid.cellStateInGrid(j,i).getState();
                if (cellState) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            
            System.out.println();
            
            for(int t = 0; t < (rowLength * 2); t++) {
                System.out.print("-");
            }
            int t = 0;
            System.out.println();
        }
    }
    
    /**
     * Prints the welcome statement.
     */
    public static void printWelcome() {
        System.out.println("Welcome to the Game of Life");
        System.out.println("This is a model game implementation of the Conways Game of Life");
        System.out.println("You will soon be asked to create your desired grid.");
        System.out.println("You will be able to make cells alive interactively, and call methods on them");
        System.out.println("Type 'Help' when you're stuck");
        System.out.println("We will assist you with any problem you might have");
        System.out.println("Your available commands are:");
        System.out.println();
        printAvailableCommands();
    }
    
    /**
     * Prints the commands.
     */
    public static void printAvailableCommands() {
        System.out.println("Step -> The object is then transformed to its next state");
        System.out.println("makeAlive -> Makes the Cell at a given point alive");
        System.out.println("Bye -> To exit the game, type 'Bye'.");
        System.out.println();
    }
    
    public static int makeAliveNumber() {
        System.out.println("How many cells would you like to make alive?");
        int numberOfCells = StandardInput.getNumberInput();
        return numberOfCells;
    }
    
    public static boolean neighbourhoodChoice() {
        System.out.println("What type of cell neighbourhood would you like?");
        System.out.println();
        System.out.println("You have to choose between Von Neumann neighbourhood or Moore Neighbourhood");
        String neighbourChoice = StandardInput.getStringInput().trim().toLowerCase();
        if(neighbourChoice.contains("moore")){
            return true;
        } else {
            return false;
        }
    }
    
    public static ArrayList<Integer> rowAndColumnInput(int times) {
        ArrayList<Integer> cellsRowAndColumnInput = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            System.out.println("Enter the row coordinate");
            int r = StandardInput.getNumberInput();
            cellsRowAndColumnInput.add(r);
            System.out.println("Enter the column coordinate");
            int c = StandardInput.getNumberInput();
            cellsRowAndColumnInput.add(c);
        }
        return cellsRowAndColumnInput;
    }
    
    public static String commandInput() {
        String input = StandardInput.getStringInput().trim().toLowerCase();
        return input;
    }
    
    public static int numberInput() {
        int input = StandardInput.getNumberInput();
        return input;
    }
    
    public static void makeAlivePrompt() {
        System.out.println("How many cells would you like to make alive");
    }
    
    public static void whatToDoNextPrompt() {
        System.out.print("What do you want to do with your grid now?");
    }
}