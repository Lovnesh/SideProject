import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GridTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GridTest {
    private Grid grid;
    /**
     * Default constructor for test class GridTest
     */
    public GridTest() {
        grid = new Grid();
    }
    
    @Test
    public void testRowLength() {
        assertEquals(8, grid.getRowLength());
        Grid grid2 = new Grid(2, 12);
        assertEquals(2, grid2.getRowLength());
    }
    
    @Test
    public void testColumnLength() {
        assertEquals(8, grid.getColumnLength());
        Grid grid2 = new Grid(2, 12);
        assertEquals(12, grid2.getColumnLength());
    }
    
    @Test
    public void testCellStateInGrid() {
        assertFalse(grid.cellStateInGrid(1,1).getState());
    }
    
    @Test
    public void testCellGetState() {
        assertFalse(grid.cellGetState(1,2));
    }
    
    @Test
    public void testChangeGridState() {
        grid.changeGridState(1,2,true);
        assertTrue(grid.cellGetState(1,2));
    }
}