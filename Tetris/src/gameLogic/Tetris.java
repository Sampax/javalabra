package gameLogic;

/**
 *
 * @author SampaX
 */

public class Tetris {

    /**
     * @param args the command line arguments
     */
    public static Board board;
    public static Tetromino piece;
    public static IO.Input input;

    
    public static void main(String[] args) {
        initialize();
        //simulate gameLoop execution
        for(int i=0;i<45;i++)
            gameLoop();
    }
    
    public static void initialize() {
        board= new Board();
        piece = new Tetromino();
        input = new IO.Input();
    }
    
    public static void gameLoop() {
            piece=board.moveDown(piece);
            System.out.println(board.printBoard());          
    }
    

}
