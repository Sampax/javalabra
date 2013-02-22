package gameLogic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author SampaX
 */
public class Board extends JPanel{
    
    public static Tetromino piece;
    public static int nextPiece;
    private static int board[][];
    private static int py;
    private static int px;
    private static Random random = new Random();
    
    /**
     * Constructor for gameboard, sets up an array and initial pointer position.
     * Also sets up the first tetromino
     * 
     * @see gameLogic.Tetromino#Tetromino() 
     */
    public Board() {
        this.setPreferredSize(new Dimension(200,400));
        board = new int[21][12];
        for(int i=0;i<21;i++)      //game area 10x20, with a "border" of nines, liable to change
            board[i][11]=board[i][0]=9;
        for(int i=0;i<12;i++)
            board[20][i]=9;
        py=1;
        px=4;
        piece = new Tetromino();
        nextPiece = random.nextInt(7);
    }
    
    /**
     * paints the gameboard and its contents
     * 
     * @param g the graphics tool used
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int y=0; y<20; y++) {
            for (int x=1; x<11; x++) {
                if (board[y][x]!=0) {
                    g.setColor(Color.black);
                    g.fillRect((x-1)*20, y*20, 20, 20);
                    g.setColor(new Color((board[y][x])*500+1));
                    g.fillRect(20*(x-1)+1, 20*y+1, 18, 18);                     
                }
            }
        }
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

    public static int getNextStyle() {
        return nextPiece;
    }

    /**
     * Marks the active tetromino onto the gameboard.
     * The new position is not yet painted.
     */
    public void markTetromino() {
        int[][] temp=piece.getTetromino();
        int style = piece.getStyle();
        
        if(style == 7)
            return;
        for(int i=0; i<4;i++) {
            board[py+temp[i][1]][px+temp[i][0]]=style+1;
        }
    }
    
    /**
     * Erases the active tetromino from the gameboard
     */
    public void scrubTetromino() {
        int[][] temp=piece.getTetromino();
        for(int i=0; i<4;i++) 
            board[py+temp[i][1]][px+temp[i][0]]=0;        
    }

    /**
     * Checks if the gameboard has enough space for the current tetromino
     * 
     * @param newPoints coordinates for the tetromino to check against
     * @param pointerX  x-axis pointer for the space to check
     * @param pointerY  y-axis pointer for the space to check
     * @return boolean value indicating whether there is space or not
     */
    public boolean checkForSpace(int [][] newPoints, int pointerX, int pointerY) {
        boolean result=true;
        scrubTetromino();
        for(int i=0; i<4;i++) {
            if(board[pointerY+newPoints[i][1]][pointerX+newPoints[i][0]]!=0)
                result=false;
        }
        markTetromino();
        return result;
    }
    
    /**
     * moves the active tetromino down one space
     * @return the active tetromino or a new one through releaseTetromino, if the piece can no longer move
     * 
     * @see gameLogic.Board#releaseTetromino() 
     */
    public Tetromino moveDown() {
        if(piece==null)
            return piece;
        if(this.checkForSpace(piece.getTetromino(), px, py+1)) {
            scrubTetromino();
            py++;            
            markTetromino();
            repaint();
            return piece;
        }
        else {
            repaint();
            return releaseTetromino();
        }
    }

    /**
     * moves the active tetromino one space to the left
     * @return the active tetromino
     */
    public Tetromino moveLeft() {
        if(piece==null)
            return piece;
        if(this.checkForSpace(piece.getTetromino(), px-1, py)) {
            scrubTetromino();
            px--;            
            markTetromino();
            repaint();
            return piece;
        }
        else
            return piece;
    }    
    
    /**
     * moves the active tetromino one space to the right
     * @return the active tetromino
     */
    public Tetromino moveRight() {
        if(piece==null)
            return piece;
        if(this.checkForSpace(piece.getTetromino(), px+1, py)) {
            scrubTetromino();
            px++;            
            markTetromino();
            repaint();
            return piece;
        }
        else
            return piece;
    
    }
    
    /**
     * rotates the active tetromino if there is space
     * 
     * @see gameLogic.Tetromino#nextRotation() 
     * @see gameLogic.Tetromino#rotate() 
     */
    public void rotate() {
        if(this.checkForSpace(piece.nextRotation(), px, py)){
            scrubTetromino();
            piece.rotate();
            markTetromino();
            repaint();
        }
    }
    
    /**
     * returns the boardarray as a String, used for early visualization and testing
     * @return the contents of the gameboard as a String
     */
    public String printBoard(){
        String result="";
        for(int i=0;i<20;i++) {
            for(int j=1;j<11;j++)
                result+=board[i][j];
            result+="\n";
        }
        return result;
    }

    /**
     * releases the active tetromino and creates a new one
     * @return the new active tetromino
     * 
     * @see gameLogic.Tetromino#Tetromino(int) 
     * @see gameLogic.Board#checkLines() 
     */
    private Tetromino releaseTetromino() {
        checkLines();
        py=1;
        px=4;
        piece=new Tetromino(nextPiece);
        nextPiece=random.nextInt(7);
        checkGameOver();
        return piece;
    }

    /**
     * closes the game. Bad implementation, needs changing
     */
    private void gameOver() {
        System.exit(0);
    }

    /**
     * checks if newly generated tetromino can fit in its starting position.
     * Calls gameOver if tetromino does not fit
     * 
     * @see gameLogic.Board#gameOver() 
     */
    private void checkGameOver() {
        int[][] newPoints = piece.getTetromino();
        for(int i=0; i<4;i++) {
            if(board[py+newPoints[i][1]][px+newPoints[i][0]]!=0)
                gameOver();
        }        
    }

    /**
     * checks for completed lines, called after releasing a tetromino.
     * After completed lines are found, clearLines() is called
     * 
     * @see gameLogic.Board#clearLines(int[]) 
     */
    private void checkLines() {
        int[] cleared= new int [4];
        int index=0;
        for (int i=0; i<20; i++) {
            for (int j=1; j<11; j++) {
                if(board[i][j]==0)
                    break;
                if(j==10) {
                    cleared[index]=i;
                    index++;
                }
            }
        }
        clearLines(cleared);
    }

    /**
     * clears all completed lines from the gameboard
     * 
     * @param cleared an array containing the indices of cleared rows
     * 
     * @see gameLogic.Board#dropRows(int[]) 
     */
    private void clearLines(int[] cleared) {
        for(int i=0; i<4; i++) {
            if(cleared[i]!=0) {
                for(int j=1;j<11;j++) {
                    board[cleared[i]][j]=0;
                }
            }
        }
        repaint();
        dropRows(cleared);
    }

    /**
     * drops the block rows down to fill any empty rows left after clearing lines
     * 
     * @param cleared an array containing the indices of cleared rows
     * 
     * @see gameLogic.infoPanel#incrementLines(int) 
     */
    private void dropRows(int[] cleared) {
        int completedLines=0;
        for(int i=0;i<4;i++) {
            if(cleared[i]!=0) {
                completedLines++;
                for(int j=cleared[i]; j>0; j-- ) {
                    for(int k=1;k<11;k++) {
                        board[j][k]=board[j-1][k];
                    }
                }
            }
        }
        infoPanel.incrementLines(completedLines);
        repaint();
    }
    
}
