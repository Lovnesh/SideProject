import java.util.HashMap;

public class GameOfLife{
    
    private Grid grid;
    private HashMap<Integer, Integer> cellNeighbours;
    
    public GameOfLife(){
        grid = new Grid();
        cellNeighbours = new HashMap<>();
    }
    
    public GameOfLife(int row, int column){
        grid = new Grid(row, column);
        cellNeighbours = new HashMap<>();
    }
    
    private boolean nextCellState(boolean originalState, int neighbours) {
        boolean state = originalState;
        if (neighbours == 3) {
            state = true;
        } else if (neighbours < 2 || neighbours >= 4) {
            state = false;
        }
        return state;
    }
    
    public Grid nextGridState() {
        int rowLength = grid.getRowLength();
        int columnLength = grid.getColumnLength();
        HashMap<Integer, Integer> neighbours = Neighbours.getAllNeighbours(grid);
        int i = 0;
        for (int row = 0; row < rowLength ; row++) {
            for(int column = 0; column < columnLength; column++) {
                int neighbourCount = neighbours.get(i);
                boolean originalState = grid.cellGetState(row, column);
                boolean state = nextCellState(originalState,neighbourCount);
                grid.changeGridState(row, column, state);
                i++;
            }
        }
        return grid;
    }
    
    public void makeAlive(int row, int column) {
        grid.changeGridState(row, column, true);
    }
   
}