import java.util.HashMap;
/**
 * Gives the total neighbours of each cell in a grid.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Neighbours
{
    public Neighbours(){
    }
    
    /**
     * Fills the neighbours column by column.
     * |1 5 9  
     * |2 6 10   
     * |3 7 11
     * |4 8 12
     * V.
     * Fills like that.
     * Fills it in a HashMap.
     * @param the grid where the cells exist
     * @return HashMap the neighbourCount of every cell mapped to it
     */
    public static HashMap<Integer, Integer> getAllNeighbours(final Grid grid, boolean neighbourhoodType){
        HashMap<Integer, Integer> cellNeighbours = new HashMap<>();
        int rowLength = grid.getRowLength();
        int columnLength = grid.getColumnLength();
        int i = 0;
        for(int row = 0; row < rowLength ; row++) {
            for(int column = 0; column < columnLength ; column++) {
               int neighbours = Computation.getNeighbourCount(grid, row, column, neighbourhoodType);
               cellNeighbours.put(i, neighbours); 
               i++;
            }
        }
        return cellNeighbours;
    }
}
