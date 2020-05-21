import java.util.ArrayList;
/**
 * Write a description of class Computation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Computation
{
    
    public Computation(){
    }
    
    public static int getNeighbourCount(Grid grid, int row, int column){
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
