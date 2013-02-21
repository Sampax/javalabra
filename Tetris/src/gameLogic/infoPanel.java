/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameLogic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author SampaX
 */
public class infoPanel extends JPanel {
    private static int lines;
    private static Tetromino nextPiece;
    
    public infoPanel() {
        this.setPreferredSize(new Dimension(100,400));
        lines=0;
        nextPiece=new Tetromino();
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawString("Lines", 25, 200);
        g.drawString(Integer.toString(lines), 30, 250);
    }
    
    public static void incrementLines(int increment) {
        lines+=increment;
    }
    
}
