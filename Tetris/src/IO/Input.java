
package IO;

/**
 *
 * @author SampaX
 */

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class Input extends KeyAdapter{

    @Override
    public void keyPressed(KeyEvent e) {
        int keys = e.getKeyCode();
        if (keys == KeyEvent.VK_DOWN)
            gameLogic.Tetris.stepDown();
        else if (keys == KeyEvent.VK_LEFT)
            gameLogic.Tetris.stepLeft();
        else if (keys == KeyEvent.VK_RIGHT)
            gameLogic.Tetris.stepRight();
        else if (keys == KeyEvent.VK_UP)
            gameLogic.Tetris.rotate();
    }
    
}
