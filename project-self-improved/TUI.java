/**
 * Initialises the text user interface for the game of life.
 */
public class TUI {
    
    private TUI() {
    } 

    /**
     * Draws the grid with the given state of the matrix.
     * @param grid the grid to be drawn
     */
    public static void draw(final Grid grid) {
        int rowLength = grid.getRowLength();
        int columnLength = grid.getColumnLength();
        for(int i = 0; i < columnLength; i++) {
            for(int j = 0; j < rowLength; j++) {
                boolean cellState = grid.cellStateInGrid(j,i).getState();
                if (cellState) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            
            System.out.println();
            for(int t = 0; t < (rowLength * 2); t++) {
                System.out.print("-");
            }
            int t = 0;
            System.out.println();
        }
    }
}