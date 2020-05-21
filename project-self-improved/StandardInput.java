import java.util.Scanner;
/**
 * Write a description of class StandardInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StandardInput
{
    public StandardInput() {
    }
    
    public static GameOfLife makeBoard() {
        final Scanner set = new Scanner(System.in);
        System.out.println("Enter how many rows you want in the gird ->");
        final int rows = set.nextInt();
        System.out.println("Enter how many columns you want in the gird ->");
        final int columns = set.nextInt();
        final GameOfLife grid = new GameOfLife(rows,columns);
        return grid;
    }
    
   
    public static void makeAlive(GameOfLife game) {
        System.out.println("Enter how many numbers of cells do you want to be alive ->");
        final Scanner num = new Scanner(System.in);
        final int c = num.nextInt();
        TUI.draw(game.getGrid());
        int i = 0;
        while (i < c) {
            final Scanner cord = new Scanner(System.in);
            System.out.println("Enter the row of the new alive cell");
            final int x = cord.nextInt();
            System.out.println("Enter the column of the new alive cell");
            final int y = cord.nextInt();
            game.getGrid().reverseState(x,y);
            i++;
        }
    }
}
