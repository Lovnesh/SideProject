
/**
 * Write a description of class GameWithGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameWithGUI
{
    // instance variables - replace the example below with your own
    private GameOfLife game;
    private GUI graphics;

    /**
     * Constructor for objects of class GameWithGUI
     */
    public GameWithGUI()
    {
        game = new GameOfLife();
        graphics = new GUI(game, 50, 50);
        graphics.showCells();
    }

    
}
