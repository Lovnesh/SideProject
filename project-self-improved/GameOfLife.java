import java.util.HashMap;

public class GameOfLife{
    
    private Grid grid;
    private HashMap<Integer, Integer> cellNeighbours;
    
    /**
     * Constructor for the class GameOfLife.
     */
    public GameOfLife(){
        grid = new Grid();
        cellNeighbours = new HashMap<>();
    }
    
    /**
     * Constructor for the class GameOfLife.
     * @param row the row length of the grid
     * @param column the column length of the grid
     */
    public GameOfLife(int row, int column){
        grid = new Grid(row, column);
        cellNeighbours = new HashMap<>();
    }
    
    /**
     * Computes the next state of the cell object depending on its neighbours and previous state.
     * @param originalState of the cell
     * @param neighbours of the cell
     * @return boolean the next state of the cell
     */
    private boolean nextCellState(boolean originalState, int neighbours) {
        boolean state = originalState;
        if (neighbours == 3) {
            state = true;
        } else if (neighbours < 2 || neighbours >= 4) {
            state = false;
        }
        return state;
    }
    
    /**
     * Computes the next state of the grid.
     */
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
    
    /**
     * Makes the cell at a given position alive.
     */
    public void makeAlive(int row, int column) {
        grid.changeGridState(row, column, true);
    }
   
}