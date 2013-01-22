package gameLogic;

/**
 *
 * @author SampaX
 */
public class Tetris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board board= new Board();
        Tetromino piece = new Tetromino();
        board.drawTetromino(piece, 5, 1);
        board.printBoard();
    }
}
