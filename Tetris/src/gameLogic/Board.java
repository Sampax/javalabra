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
    
    public static Tetromino piece;    
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
        px=4;
        piece = new Tetromino();
    }
    
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
    
    
    public void eraseSquare(Graphics g, int px,int py) {
        board[px][py] = 0;
        g.setColor(java.awt.Color.white);
        g.fillRect(px*20,py*20,20,20);
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

    public void markTetromino() {
        int[][] temp=piece.getTetromino();
        int style = piece.getStyle();
        
        if(style == 7)
            return;
        for(int i=0; i<4;i++) {
            board[py+temp[i][1]][px+temp[i][0]]=style;
        }
    }
    
    public void scrubTetromino() {
        int[][] temp=piece.getTetromino();
        for(int i=0; i<4;i++) 
            board[py+temp[i][1]][px+temp[i][0]]=0;        
    }

    public boolean checkForSpace(int [][] newPoints, int pointerX, int pointerY) {
        boolean result=true;
        scrubTetromino();
        for(int i=0; i<4;i++) {
            if(board[pointerY+newPoints[i][1]][pointerX+newPoints[i][0]]!=0)
                   /* || pointerY+newPoints[i][1] < 0
                    || pointerY+newPoints[i][1] > 19
                    || pointerX+newPoints[i][0] < 0
                    || pointerY+newPoints[i][0] > 9)*/
                result=false;
        }
        markTetromino();
        return result;
    }
    
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
    public void rotate() {
        if(this.checkForSpace(piece.nextRotation(), px, py)){
            scrubTetromino();
            piece.rotate();
            markTetromino();
            repaint();
        }
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
        checkLines();
        py=1;
        px=4;
        piece=new Tetromino();
        checkGameOver();
        return piece;
    }

    private void gameOver() {
        System.exit(0);
    }

    private void checkGameOver() {
        int[][] newPoints = piece.getTetromino();
        for(int i=0; i<4;i++) {
            if(board[py+newPoints[i][1]][px+newPoints[i][0]]!=0)
                gameOver();
        }        
    }

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

    private void dropRows(int[] cleared) {
        for(int i=0;i<4;i++) {
            if(cleared[i]!=0) {
                for(int j=cleared[i]; j>0; j-- ) {
                    for(int k=1;k<11;k++) {
                        board[j][k]=board[j-1][k];
                    }
                }
            }
        }
        repaint();
    }
    
}
