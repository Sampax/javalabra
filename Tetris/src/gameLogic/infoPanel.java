/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameLogic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author SampaX
 */
public class infoPanel extends JPanel {
    private static int lines;
    private static int[][] nextPiece;
    
    public infoPanel() {
        this.setPreferredSize(new Dimension(100,400));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        lines=0;
        nextPiece=Tetromino.getTetromino(Board.getNextStyle());
        JLabel next = new JLabel("Next");
        JLabel linetext = new JLabel("Lines");
        add(next);
        add(Box.createRigidArea(new Dimension(30,200)));
        add(linetext);
        
    }
    
    public void getNextStyle() {
        nextPiece=Tetromino.getTetromino(Board.getNextStyle());
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        for(int i=0;i<4;i++) {
            g.fillRect(30+20*nextPiece[i][0], 50+20*nextPiece[i][1], 20, 20);
        }
        g.drawString(Integer.toString(lines), 30, 250);
    }
    
 
    public static void incrementLines(int increment) {
        lines+=increment;
    }
    
}
