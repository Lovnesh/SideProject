import java.util.ArrayList;

public class Neighbourhood{
   
    public Neighbourhood(){
    }
    
    /**
     * Adds the neighbours of the cell in a given position to an ArrayList
     * Returns them in an ArrayList.
     * @param Grid the grid where the cell exists
     * @param row the row where the cell is located
     * @param column the column where the cell is located
     * @return ArrayList<Boolean> the states of the neighbouring cells expect itself
     */
    public static ArrayList<Boolean> generateNeighbourhood(final Grid grid, final int row, final int column){
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
                    Cell c = grid.cellStateInGrid(a,b);
                    neighbours.add(c.getState());
                    b++;
                }
            }
            a++;
        }
        return neighbours;
    }
}