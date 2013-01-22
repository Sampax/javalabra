package tetris;

/**
 *
 * @author SampaX
 */
public class Board {
    
    private static int board[][];
    
    public Board() {
        board = new int[21][12];
        for(int i=0;i<21;i++)      //game area 10x20, with a "border" of nines, liable to change
            board[i][11]=board[i][0]=9;
        for(int i=0;i<12;i++)
            board[20][i]=9;
    }
    
    public int[][] getBoard() {
        return board;
    }
    
    public void updateSquare(int value, int pointerX, int pointerY) {
        return;
    }
    
    public void drawTetromino(Tetromino piece, int pointerX, int pointerY) {
        int[][] temp=piece.getTetromino();
        int style = piece.getStyle();
        
        if(style == 7)
            return;
        for(int i=0; i<4;i++) {
            board[pointerY+temp[i][1]][pointerX+temp[i][0]]=1;
        }
    }
    
    public void printBoard(){ //prints the visible portion of the board
        for(int i=0;i<20;i++) {
            for(int j=1;j<11;j++)
                System.out.print(board[i][j]);
            System.out.print("\n");
        }
    }
    
}
