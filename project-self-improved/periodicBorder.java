/**
 * Write a description of class periodicBorder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PeriodicBorder
{

    /**
     * Constructor for objects of class periodicBorder
     */
    public PeriodicBorder()
    {
    }

    /**
     * Checks if neighbour of a cell is out of grid.
     * @param grid the board where the cell exists
     * @param x the horizontal position of the cell
     * @return the true if x is out of the horizintal length of grid
     */
    public static boolean afterHorizontalEdge(final Grid grid, final int x) {
        return x > grid.getRowLength() - 1;
    }
    
    /**
     * Checks if neighbour of a cell is out of grid.
     * @param grid the board where the cell exists
     * @param x the horizontal position of the cell
     * @return the true if x is out of the horizintal beggining of grid 
     */
    public static boolean beforeHorizontalBeginning(final Grid grid, final int x) {
        return x < 0;
    }
    
    /**
     * Checks if neighbour of a cell is out of grid.
     * @param grid the board where the cell exists
     * @param y the vertical position of the cell
     * @return the true if y is out of the vertical length of grid
     */
    public static boolean afterVerticalEdge(final Grid grid, final int x) {
        return x > grid.getColumnLength() - 1;
    }
    
    /**
     * Checks if neighbour of a cell is out of grid.
     * @param grid the board where the cell exists
     * @param y the vertical position of the cell
     * @return the true if y is out of the vertical beggining of grid 
     */
    public static boolean beforeVerticalBeginning(final Grid grid, final int x) {
        return x < 0;
    }
    
    /**
     * Sets x on other side of grid if it is out of bounds.
     * @param grid the board where the cell exists
     * @param x the horizontal position of the cell
     * @return int value where x should be
     */
    public static int horFix(final Grid grid,final int x) {
        if (afterHorizontalEdge(grid,x)) {
            return 0;
        } else if (beforeHorizontalBeginning(grid,x)) {
            return grid.getRowLength() - 1;
        } else {
            return x;
        }
    }
    
    /**
     * Sets y on other side of grid if it is out of bounds.
     * @param grid the board where the cell exists
     * @param y the vertical position of the cell
     * @return int value where y should be
     */
    public static int vertFix(final Grid grid,final int y) {
        if (afterVerticalEdge(grid,y)) {
            return 0;
        } else if (beforeVerticalBeginning(grid,y)) {
            return grid.getColumnLength() - 1;
        } else {
            return y;
        }
    } 
}
