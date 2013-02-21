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
import javax.swing.JPanel;

public class Tetris extends GameLoop implements ActionListener {

    public static Board board;
    public static infoPanel console;
    public static IO.Input input;
    public static JFrame window;
    public static JPanel grid;
    public static Container content;

    public static void main(String[] args) {
        Tetris tetris = new Tetris();
        tetris.run(1.3);
    }
    
    public static void stepDown() {
        board.moveDown();
    }

    public static void stepLeft() {
        board.moveLeft();
    }

    public static void stepRight() {
        board.moveRight();
    }

    public static void rotate() {
        board.rotate();
    }


    
    @Override
    public void startup() {
        board= new Board();
        console= new infoPanel();
        board.setBackground(Color.white);
        board.markTetromino();
        input = new IO.Input();
        window = new JFrame ("Tetris");
        window.setSize(300, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(board, BorderLayout.WEST);
        window.add(console, BorderLayout.EAST);
        window.addKeyListener(input);
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

        board.repaint();
        console.repaint();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        board.repaint();
        draw();
    }

}
