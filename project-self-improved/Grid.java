
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
        grid = new Cell[50][50];
        initialiseGrid();
    }
    
    /**
     * Makes a grid with the given row and column
     * @param row the row length of the grid
     * @param column the column length of the grid
     */
    public Grid(final int row, final int column){
        grid = new Cell[row][column];
        initialiseGrid();
    }
    
    /**
     * Fills up the grid column by column.
     */
    private void initialiseGrid(){
        int rowLength = grid.length;
        int columnLength = grid[0].length;
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                grid[i][j] = new Cell();
            }
        }
    }
    
    /**
     * Horizontal Length of the grid.
     * @return the horizontal length of the grid
     */
    public int getRowLength(){
        return grid.length;
    }
    
    /**
     * Vertical Length
     * @return the horizontal length of the grid
     */
    public int getColumnLength(){
        return grid[0].length;
    }
    
    /**
     * Fetches a cell from the given row and column
     *   R R
     * C 0 1
     * C 1 1
     * @param row the row in the grid
     * @param column the column in the grid
     * @return Cell in the given row and column
     */
    public Cell cellStateInGrid(final int row, final int column){
        return grid[row][column];
    }
    
    /**
     * Gets the state of the cell in the grid with arbitrary row and column
     * @param row the row in which the cell exists
     * @param column the column in which the cell exists
     * @return boolean the state of the cell
     */
    public boolean cellGetState(final int row, final int column) {
        return grid[row][column].getState();
    }
    
    /**
     * Changes the state of the cell at a given location in the grid.
     * @param row the row in which the cell exists
     * @param column the column in which the cell exists
     * @param state the state of the cell
     */
    public void changeGridState(final int row, final int column, final boolean state) {
        grid[row][column].setState(state);
    }
    
    /**
     * Reverses the state of the cell at a given location in the grid.
     * @param row the row in which the cell exists
     * @param the column in which the cell exists
     */
    public void reverseState(final int row, final int column) {
        grid[row][column].setState(!grid[row][column].getState());
    }
       
}
