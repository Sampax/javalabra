package gameLogic;

/**
 *
 * @author SampaX
 */
import java.util.Timer;
import java.util.TimerTask;

public class Tetris {

    /**
     * @param args the command line arguments
     */
    public static Board board;
    public static Tetromino piece;
    public static IO.Input input;
    public static Timer timer;
    
    public static void main(String[] args) {
        initialize();
        
    }
    
    public static void initialize() {
        board= new Board();
        piece = new Tetromino();
        input = new IO.Input();
        timer = new Timer();
        timer.schedule(new TimerTick(), 1);
    }
    
    public static void gameLoop() {
            piece=board.moveDown(piece);
            System.out.println(board.printBoard());          
    }
    

}

//Will definitely be changed, quick workaround under time constraints

class TimerTick extends TimerTask {

        @Override
        public void run() {
            Tetris.gameLoop();
        }
}