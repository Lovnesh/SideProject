import java.util.ArrayList;
/**
 * Write a description of class GenerateGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GenerateGame
{
    // instance variables - replace the example below with your own
    private GameOfLife game;
    /**
     * Constructor for objects of class GenerateGame
     */
    public GenerateGame() {
        // initialise instance variables
        TUI.printWelcome();
        GameOfLife g = gameOfLifeInitialiser();
        game = g;
        start();
    }
    
    /**
     * Start method to start playing the game.
     */
    public void start() {
        boolean finished = false;
        
        while(!finished) {
            TUI.whatToDoNextPrompt();
            String input = TUI.commandInput();
            if(input.contains("bye")) {
                finished = true;
            } else if(input.contains("step")){
                step(game);
            } else if(input.contains("makealive")){
                TUI.makeAlivePrompt();
                int h = TUI.numberInput();
                game = makeAlive(game, h);
            } else if(input.contains("help")) {
                TUI.printAvailableCommands();
            }
        }
    }
    
    /**
     * Intialises the GameOfLife grid.
     */
    private GameOfLife gameOfLifeInitialiser() {
        ArrayList<Integer> cellsRowAndColumnInput = new ArrayList<>();
        cellsRowAndColumnInput = TUI.rowAndColumnInput(1);
        int row = cellsRowAndColumnInput.get(0);
        int column = cellsRowAndColumnInput.get(1);
        boolean neighbourhood = TUI.neighbourhoodChoice();
        GameOfLife game = new GameOfLife(row, column, neighbourhood);
        return game;
    }
    
    /**
     * Calls the nextGridState method of the game of life.
     * @param GameOfLife the grid to be operated on
     */
    private void step(GameOfLife grid) {
        Grid g = grid.nextGridState();
        TUI.draw(g);
    }
    
    /**
     * Makes the cell alive at a given point.
     * @param game the Game of life 
     * @param howMany the number of cells to be made alive
     */
    private GameOfLife makeAlive(GameOfLife game, int howMany) {
        ArrayList<Integer> rowAndColumnInput = new ArrayList<>();
        rowAndColumnInput = TUI.rowAndColumnInput(howMany);
        int length = rowAndColumnInput.size();
        for (int i = 0 ; i < length; i = i + 2){
            int row = rowAndColumnInput.get(i);
            int column = rowAndColumnInput.get(i + 1);
            game.makeAlive(row, column);
        }
        return game;
    }
}
