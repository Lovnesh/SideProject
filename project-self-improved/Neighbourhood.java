import java.util.ArrayList;

public abstract class Neighbourhood{
    
    public Neighbourhood() {
    }
    
    /**
     * Adds the neighbours of the cell in a given position to an ArrayList
     * Returns them in an ArrayList.
     * @param Grid the grid where the cell exists
     * @param row the row where the cell is located
     * @param column the column where the cell is located
     * @return ArrayList<Boolean> the states of the neighbouring cells expect itself
     */
    public abstract ArrayList<Boolean> generateNeighbourhood(final Grid grid, final int row, final int column);
}