import java.util.ArrayList;
/**
 * Write a description of class Computation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Computation
{
    
    public Computation() {
    }
    
    /**
     * Counts the alive cells from the neighbourhood of the cell at a given location.
     * @param Grid where the cell exists
     * @param row where the cell is located
     * @param column where the cell is located
     * @return int the total number of alive cells in the neighbourhood.
     */
    public static int getNeighbourCount(final Grid grid, final int row, final int column) {
        ArrayList<Boolean> neighbourState = new ArrayList<>();
        neighbourState = Neighbourhood.generateNeighbourhood(grid, row, column);
        int neighbourCount = 0;
        for(Boolean state : neighbourState){
            if(state){
                neighbourCount += 1;
            }
        }
        return neighbourCount;
    }
}
