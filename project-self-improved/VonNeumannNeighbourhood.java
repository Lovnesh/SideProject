import java.util.ArrayList;
/**
 * Write a description of class VonNeumannNeighbourhood here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VonNeumannNeighbourhood extends Neighbourhood
{
    public VonNeumannNeighbourhood(){
        super();
    }
    
    @Override
    public ArrayList<Boolean> generateNeighbourhood(final Grid grid, final int row, final int column){
        ArrayList<Boolean> neighbours = new ArrayList<>();
        int a = row - 1;
        for (int i = 0; i < 3; i++){
            int b = column - 1;
            for(int j = 0; j < 3; j++){
                b = PeriodicBorder.vertFix(grid,b);
                a = PeriodicBorder.horFix(grid,a);
                if (a == row && b == column){
                    b++;
                } else{
                    boolean c = grid.cellGetState(a,b);
                    neighbours.add(c);
                    b++;
                }
            }
            a++;
        }
        return neighbours;
    }
}
