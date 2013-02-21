package gameLogic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author SampaX
 */
public class Board extends JPanel{
    
    private static int board[][];
    private static int py;
    private static int px;
    
    public Board() {
        this.setPreferredSize(new Dimension(200,400));
        board = new int[21][12];
        for(int i=0;i<21;i++)      //game area 10x20, with a "border" of nines, liable to change
            board[i][11]=board[i][0]=9;
        for(int i=0;i<12;i++)
            board[20][i]=9;
        py=1;
        px=5;
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawTetromino(g,0,0);
        drawTetromino(g,2,0);        
    }
    
    public void drawSquare(Graphics g, int px, int py) {
        g.setColor(Color.red);
        g.fillRect(px*20, py*20, 20, 20);
        g.setColor(Color.black);
        g.fillRect(20*px+1, 20*py+1, 18, 18);        
    }
    
    public void drawTetromino(Graphics g, int px, int py) {
        drawSquare(g, px+0, py+0);
        drawSquare(g, px+0, py+1);
        drawSquare(g, px+1, py+0);
        drawSquare(g, px+2, py+0);         
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

    public void markTetromino(Tetromino piece) {
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

    public boolean checkForSpace(Tetromino piece, int [][] newPoints, int pointerX, int pointerY) {
        boolean result=true;
        scrubTetromino(piece);
        for(int i=0; i<4;i++) {
            if(board[pointerY+newPoints[i][1]][pointerX+newPoints[i][0]]!=0)
                result=false;
        }
        markTetromino(piece);
        return result;
    }
    
    public Tetromino moveDown(Tetromino piece) {
        if(piece==null)
            return piece;
        if(this.checkForSpace(piece, piece.getTetromino(), px, py+1)) {
            scrubTetromino(piece);
            py++;            
            markTetromino(piece);
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
