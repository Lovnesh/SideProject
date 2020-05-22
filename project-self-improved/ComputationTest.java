import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
/**
 * The test class ComputationTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ComputationTest
{
    public Grid grid;
    /**
     * Default constructor for test class ComputationTest
     */
    public ComputationTest()
    {
        grid = new Grid(4,4);
    }
    
    @Test
    public void TestNeighbourhoodCount() {
        int count = Computation.getNeighbourCount(grid, 0, 0);
        assertEquals(0, count);
    }
}
