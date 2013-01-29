package gameLogic;

/**
 *
 * @author SampaX
 */
public class Board {
    
    private static int board[][];
    private static int py;
    private static int px;
    
    public Board() {
        board = new int[21][12];
        for(int i=0;i<21;i++)      //game area 10x20, with a "border" of nines, liable to change
            board[i][11]=board[i][0]=9;
        for(int i=0;i<12;i++)
            board[20][i]=9;
        py=1;
        px=5;
    }
    
    public int[][] getBoard() {
        return board;
    }
    
    public int getPy() {
        return py;
    }
    
    public int getPx() {
        return px;
    }
    public void setPy(int value) {
        py=value;
    }
    public void setPx(int value) {
        px=value;
    }

    public void drawTetromino(Tetromino piece) {
        int[][] temp=piece.getTetromino();
        int style = piece.getStyle();
        
        if(style == 7)
            return;
        for(int i=0; i<4;i++) {
            board[py+temp[i][1]][px+temp[i][0]]=1;
        }
    }
    
    public void scrubTetromino(Tetromino piece) {
        int[][] temp=piece.getTetromino();
        for(int i=0; i<4;i++) 
            board[py+temp[i][1]][px+temp[i][0]]=0;        
    }
    
/*    public boolean checkForSpace(Tetromino piece, int [][] newPoints) {
        boolean result=true;
        scrubTetromino(piece);
        for(int i=0; i<4;i++) {
            if(board[py+newPoints[i][1]][px+newPoints[i][0]]!=0)
                result=false;
        }
        drawTetromino(piece);
        return result;
    }
 */
    public boolean checkForSpace(Tetromino piece, int [][] newPoints, int pointerX, int pointerY) {
        boolean result=true;
        scrubTetromino(piece);
        for(int i=0; i<4;i++) {
            if(board[pointerY+newPoints[i][1]][pointerX+newPoints[i][0]]!=0)
                result=false;
        }
        drawTetromino(piece);
        return result;
    }
    
    public Tetromino moveDown(Tetromino piece) {
        if(piece==null)
            return piece;
        if(this.checkForSpace(piece, piece.getTetromino(), px, py+1)) {
            scrubTetromino(piece);
            py++;            
            drawTetromino(piece);
            return piece;
        }
        else
            return releaseTetromino();
    }
    
    public String printBoard(){ //returns the visible portion of the board as a String
        String result="";
        for(int i=0;i<20;i++) {
            for(int j=1;j<11;j++)
                result+=board[i][j];
            result+="\n";
        }
        return result;
    }

    private Tetromino releaseTetromino() {
        py=1;
        px=5;
        return new Tetromino();
    }
    
}
