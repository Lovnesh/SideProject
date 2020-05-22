
/**
 * Write a description of class GenerateGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GenerateGame
{
    // instance variables - replace the example below with your own
    private StandardInput reader;
    private GameOfLife game;
    /**
     * Constructor for objects of class GenerateGame
     */
    public GenerateGame()
    {
        // initialise instance variables
        reader = new StandardInput();
        printWelcome();
        GameOfLife g = gameOfLifeInitialiser();
        game = g;
        start();
    }

    public void start() {
        boolean finished = false;
        
        while(!finished) {
            System.out.print("What do you want to do with your grid now?");
            String input = getMethodInput();
            if(input.contains("bye")) {
                finished = true;
            } else if(input.contains("step")){
                step(game);
            } else if(input.contains("makeAlive")){
                System.out.println("How many cells would you like to make alive?");
                int h = reader.getNumberInput();
                game = makeAlive(game, h);
            }
        }
    }
    
    private void printWelcome(){
        System.out.println("Welcome to the Game of Life");
        System.out.println("This is a model game implementation of the Conways Game of Life");
        System.out.println("You will soon be asked to create your desired grid.");
        System.out.println("You will be able to make cells alive interactively, and call methods on them");
        System.out.println("Type 'Help' when you're stuck");
        System.out.println("We will assist you with any problem you might have");
        System.out.println("Your available commands are:");
        printAvailableCommands();
    }
    
    private void printAvailableCommands(){
        System.out.println("Step -> The object is then transformed to its next state");
        System.out.println("makeAlive -> Makes the Cell at a given point alive");
        System.out.println("Bye -> To exit the game, type 'Bye'.");
        System.out.println();
    }
    
    private GameOfLife gameOfLifeInitialiser(){
        System.out.println("Enter the number of rows you want for the Grid");
        int row = reader.getNumberInput();
        System.out.println("Enter the number of columns you want for the Grid");
        int column = reader.getNumberInput();
        GameOfLife game = new GameOfLife(row, column);
        return game;
    }
    
    private String getMethodInput(){
        String input = reader.getStringInput();
        return input;
    }
    
    private void step(GameOfLife grid){
        Grid g = grid.nextGridState();
        TUI.draw(g);
    }
    
    private GameOfLife makeAlive(GameOfLife game, int howMany) {
        for (int i = 0; i < howMany; i++) {
            System.out.println("Enter the row coordinate for the Cell");
            int r = reader.getNumberInput();
            System.out.println("Enter the column coordinate for the Cell");
            int c = reader.getNumberInput();
            game.makeAlive(r,c);
        }
        return game;
    }
}
