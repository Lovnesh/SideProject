import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
/**
 * The test class NeighbourhoodTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NeighbourhoodTest
{
    private Grid grid;
    private ArrayList<Boolean> neigh;
    /**
     * Default constructor for test class NeighbourhoodTest
     */
    public NeighbourhoodTest()
    {
        grid = new Grid(4,4);
        neigh = new ArrayList<>();
    }

    @Test
    public void testGenerateNeighbourhood() {
        neigh = Neighbourhood.generateNeighbourhood(grid, 0, 0);
        boolean s = neigh.get(0);
        assertFalse(s);
    }
}
