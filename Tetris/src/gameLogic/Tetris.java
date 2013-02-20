package gameLogic;

/**
 *
 * @author SampaX
 */

public class Tetris extends GameLoop {

    /**
     * @param args the command line arguments
     */
    public static Board board;
    public static Tetromino piece;
    public static IO.Input input;

    public static void stepDown() {
        piece=board.moveDown(piece);
    }

    
    @Override
    public void startup() {
        board= new Board();
        piece = new Tetromino();
        input = new IO.Input();
    }
    
    @Override
    public void shutdown() {
        return;
    }
    
    @Override
    public void update() {
        piece=board.moveDown(piece);
    }
    
    @Override
    public void draw() {
        System.out.println(board.printBoard()); 
    }
        
    public static void main(String[] args) {
        Tetris tetris = new Tetris();
        tetris.run(1.5);
    }
}
