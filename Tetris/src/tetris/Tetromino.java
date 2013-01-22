package tetris;

/**
 *
 * @author SampaX
 */
import java.util.Random;

public class Tetromino {
    
    private int[][] tetromino;
    private int direction;
    private int style;
    private Random styleRandomizer=new Random(System.currentTimeMillis());
    private int[][][] tetrominoArrays =
        // line (0)
        {{{0, 0}, {0, 1}, {0, 2}, {0, -1}},
        // square (1)
        {{0, 0}, {0, 1}, {1, 0}, {1, 1}},
        //S (2)
        {{0, 0}, {1, 0}, {1, 1}, {0, -1}},
        //Z (3)
        {{0, 0}, {-1, 0}, {-1, -1}, {0, 1}},
        //T (4)
        {{0, 0}, {1, 0}, {0, 1}, {-1, 0}},
        //L (5)
        {{0, 0}, {0, -1}, {0, 1}, {1, -1}},
        //J (6)
        {{0, 0}, {0, -1}, {0, 1}, {-1, -1}},
        //empty piece (7)
        null};
            
    public Tetromino() {
        tetromino=new int[4][2];
        direction=0;
        style=randomStyle();
        tetromino=tetrominoArrays[style];
    }
    
    public int[][] getTetromino() {
        return tetromino;
    }

    public int getStyle() {
        return style;
    }

    private int randomStyle() {
        return styleRandomizer.nextInt(7);
    }
}
