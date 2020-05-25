import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
/**
 * The test class NeighboursTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NeighboursTest
{
    private Grid grid;
    /**
     * Default constructor for test class NeighboursTest
     */
    public NeighboursTest()
    {
        grid = new Grid(4,4);
    }

    @Test
    public void testGetAllNeighbours() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map = Neighbours.getAllNeighbours(grid, true);
        int count = map.get(0);
        assertEquals(0,count);
    }
}
