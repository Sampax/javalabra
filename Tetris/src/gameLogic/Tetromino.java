package gameLogic;

/**
 *
 * @author SampaX
 */
import java.util.Random;

public class Tetromino {
    
    private int[][] tetromino;
    private int style;
    private Random styleRandomizer=new Random();
    private static int[][][] tetrominoArrays =
        //an array contains the coordinates of the four tetromino segments in relation to a pointer square 
        // line (0)
        {{{0, 0}, {0, 1}, {0, 2}, {0, -1}},
        // square (1)
        {{0, 0}, {0, 1}, {1, 0}, {1, 1}},
        //S (2)
        {{0, 0}, {1, 0}, {1, 1}, {0, -1}},
        //Z (3)
        {{0, 0}, {1, 0}, {0, 1}, {1, -1}},
        //T (4)
        {{0, 0}, {1, 0}, {0, 1}, {-1, 0}},
        //L (5)
        {{0, 0}, {0, -1}, {0, 1}, {1, -1}},
        //J (6)
        {{0, 0}, {0, -1}, {0, 1}, {-1, -1}},
        //empty piece (7)
        null};
  
    /**
     * constructor for creating a new random tetromino
     */
    public Tetromino() {
        tetromino=new int[4][2];
        style=randomStyle();
        tetromino=tetrominoArrays[style];
    }

    /**
     * constructor for creating a new tetromino with predefined style
     * @param style the desired style as an int
     */
    public Tetromino(int style) {
        tetromino=new int[4][2];
        this.style=style;
        tetromino=tetrominoArrays[this.style];
    }
    
    /**
     * updates the active tetrominoarray to reflect its state after a single rotation
     * 
     * @see gameLogic.Tetromino#nextRotation() 
     */
    public void rotate() {
        this.tetromino=this.nextRotation();
    }
    
    /**
     * method for getting the array corresponding to the next rotation of the active tetromino
     * @return an array with the new coordinates for the rotated tetromino
     */
    public int[][] nextRotation() {
        if (this.style==1)
            return this.tetromino;
        int [][] result = new int[4][2];
        for(int i=0;i<4;i++) {
            result[i][0]=this.tetromino[i][1];
            result[i][1]=-this.tetromino[i][0];
        }
        return result;
    }
    
    public int[][] getTetromino() {
        return tetromino;
    }
    
    public static int[][] getTetromino(int style) {
        return tetrominoArrays[style];
    }

    public int getStyle() {
        return style;
    }

    private int randomStyle() {
        return styleRandomizer.nextInt(7);
    }
}
