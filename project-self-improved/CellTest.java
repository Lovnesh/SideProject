import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CellTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CellTest {
   Cell cell = new Cell();
   
   @Test
   public void testGetState() {
       assertFalse(cell.getState());
   }
    
   @Test
   public void testSetState() {
       cell.setState(true);
       assertTrue(cell.getState());
    }
    
}
