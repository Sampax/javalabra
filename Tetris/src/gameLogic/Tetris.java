package gameLogic;

/**
 *
 * @author SampaX
 */

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tetris extends GameLoop implements ActionListener {

    public static Board board;
    public static Tetromino piece;
    public static IO.Input input;
    public static JFrame window;
    public static JPanel grid;
    public static Container content;

    public static void main(String[] args) {
        Tetris tetris = new Tetris();
        tetris.run(1.5);
    }
    
    public static void stepDown() {
        piece=board.moveDown(piece);
    }


    
    @Override
    public void startup() {
        board= new Board();
        piece = new Tetromino();
        board.markTetromino(piece);
        input = new IO.Input();
        window = new JFrame ("Tetris");
        window.setSize(200, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*content = window.getContentPane();
        content.setBackground(Color.white);
        content.setLayout(new BorderLayout());
        grid = new JPanel();
        grid.setLayout(new GridLayout(20,10));
        grid=setupGrid(grid, board); */
        window.add(board);
        window.pack();
        window.setVisible(true);

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
//        grid = drawGrid(grid, board);
//        System.out.println(board.printBoard()); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        draw();
    }
    private JPanel setupGrid(JPanel grid, Board board) {
        int [][] data = board.getBoard();
        for(int [] row : data ) {
            for ( int cell : row) {
                if (cell !=9) {
                    grid.add(new JLabel(""+cell));
                }
            }
        }
        return grid;
    }

 /*   
    private JPanel drawGrid(JPanel grid, Board board) {
        int [][] data = board.getBoard();
        for(int i=0; i<data.length;i++) {
            for ( int j=1; j<data[i].length;j++) {
                if (data[i][j]!=9)
                    gri
            }
        }
        return grid;
    }

*/
}
