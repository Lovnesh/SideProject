
/**
 * Write a description of class Grid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grid
{
    // instance variables - replace the example below with your own
    private Cell[][] grid;

    /**
     * Constructor for objects of class Grid
     */
    public Grid()
    {
        // initialise instance variables
        grid = new Cell[8][8];
        initialiseGrid();
    }
    
    public Grid(int row, int column){
        grid = new Cell[row][column];
        initialiseGrid();
    }
    
    private void initialiseGrid(){
        int rowLength = grid.length;
        int columnLength = grid[0].length;
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                grid[i][j] = new Cell();
            }
        }
    }
    
    public int getRowLength(){
        return grid.length;
    }
    
    public int getColumnLength(){
        return grid[0].length;
    }
    
    public Cell cellStateInGrid(int row, int column){
        return grid[row][column];
    }
    
    public boolean cellGetState(int row, int column) {
        return grid[row][column].getState();
    }
    
    public void changeGridState(int row, int column, boolean state) {
        grid[row][column].setState(state);
    }
    
    public void reverseState(int row, int column) {
        grid[row][column].setState(!grid[row][column].getState());
    }
       
}
