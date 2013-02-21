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
    public static IO.Input input;
    public static JFrame window;
    public static JPanel grid;
    public static Container content;

    public static void main(String[] args) {
        Tetris tetris = new Tetris();
        tetris.run(0.3);
    }
    
    public static void stepDown() {
        board.moveDown();
    }


    
    @Override
    public void startup() {
        board= new Board();
        board.setBackground(Color.white);
        board.markTetromino();
        input = new IO.Input();
        window = new JFrame ("Tetris");
        window.setSize(200, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        board.moveDown();
    }
    
    @Override
    public void draw() {

//        System.out.println(board.printBoard()); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        draw();
    }

}
