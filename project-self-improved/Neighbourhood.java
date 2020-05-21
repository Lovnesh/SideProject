import java.util.ArrayList;

public class Neighbourhood{
   
    public Neighbourhood(){
    }
    
    public static ArrayList<Boolean> generateNeighbourhood(Grid grid, int row, int column){
        ArrayList<Boolean> neighbours = new ArrayList<>();
        int a = row - 1;
        for (int i = 0; i < 3; i++){
            int b = column - 1;
            for(int j = 0; j < 3; j++){
                b = periodicBorder.horFix(grid,b);
                a = periodicBorder.vertFix(grid,a);
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