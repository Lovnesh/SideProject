import java.util.Scanner;

/**
 * Write a description of class GameOfLife here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameOfLife
{
    // instance variables - replace the example below with your own
    private Grid grid;

    /**
     * Constructor for objects of class GameOfLife
     */
    public GameOfLife()
    {
        grid = new Grid();
    }

    public GameOfLife(int rows, int columns) {
        grid = new Grid(rows, columns);
    }
    
    public Grid getGrid(){
        return grid;
    }
    
    /*
    public void step() {
        int rowCount = grid.getRowLength();
        int columnCount = grid.getColumnLength();
        Grid substitute = new Grid(rowCount, columnCount);
        for(int i = 0; i < rowCount; i++) {
            for(int j = 0; j < columnCount; j++) {
                int neighbours = Computation.getNeighbourCount(grid, i, j);
                if (neighbours == 3) {
                    substitute.changeGridState(i,j,true);
                } else if (neighbours < 2 || neighbours > 3) {
                    substitute.changeGridState(i,j,true);
                }
            }
        }
        grid = substitute;
    }
    
    public static void gameOfLife() {
        final GameOfLife game = StandardInput.makeBoard();
        StandardInput.makeAlive(game);
        while (true) {           
            TUI.draw(game.grid);
            game.step();          
            final Scanner s = new Scanner(System.in);
            final int b = s.nextInt();
            if (b == 0) {
                break;
            }
        }
        
    /**
     * 
     */
    
    public boolean nextCellState(int row, int column) {
        int neighbours = Computation.getNeighbourCount(grid, row, column);
        boolean toReturn;
        if (neighbours == 3) {
            toReturn = true;
        } else {
            toReturn = false;
        }
        return toReturn;
    }
    
    public void nextGridState() {
        int rowLength = grid.getRowLength();
        int columnLength = grid.getColumnLength();
        Grid nextState = new Grid(rowLength, columnLength);
        for(int row = 0; row < rowLength; row++) {
            for(int col = 0; col < columnLength; col++) {
                 boolean cellState = nextCellState(row,col);
                 nextState.changeGridState(row,col,cellState);
            }
        }
        grid = nextState;
    }
    
    public void drawGridIteratively(int steps){
        for(int i = 0; i < steps; i++){
            nextGridState();
            TUI.draw(grid);
            System.out.println("<><><><><><><><><><><><><><><><><>");
        }
    }
    
    public void makeCellAlive(int row, int col) {
        grid.changeGridState(row, col, true);
    }
    
    public void printGrid(){
        TUI.draw(grid);
    }
}
