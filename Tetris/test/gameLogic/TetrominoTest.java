/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameLogic;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SampaX
 */
public class TetrominoTest {
    
    public TetrominoTest() {
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Tests for Tetromino initializer
     */
    
    @Test
    public void testTetrominoLine() {
        Tetromino instance = new Tetromino(0);
        int[][] expResult = {{0, 0}, {0, 1}, {0, 2}, {0, -1}};
        int[][] result = instance.getTetromino();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testTetrominoSquare() {
        Tetromino instance = new Tetromino(1);
        int[][] expResult = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};
        int[][] result = instance.getTetromino();
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testTetrominoS() {
        Tetromino instance = new Tetromino(2);
        int[][] expResult = {{0, 0}, {1, 0}, {1, 1}, {0, -1}};
        int[][] result = instance.getTetromino();
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testTetrominoZ() {
        Tetromino instance = new Tetromino(3);
        int[][] expResult = {{0, 0}, {-1, 0}, {-1, -1}, {0, 1}};
        int[][] result = instance.getTetromino();
        assertArrayEquals(expResult, result);
    }
     
    @Test
    public void testTetrominoT() {
        Tetromino instance = new Tetromino(4);
        int[][] expResult = {{0, 0}, {1, 0}, {0, 1}, {-1, 0}};
        int[][] result = instance.getTetromino();
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testTetrominoL() {
        Tetromino instance = new Tetromino(5);
        int[][] expResult = {{0, 0}, {0, -1}, {0, 1}, {1, -1}};
        int[][] result = instance.getTetromino();
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testTetrominoJ() {
        Tetromino instance = new Tetromino(6);
        int[][] expResult = {{0, 0}, {0, -1}, {0, 1}, {-1, -1}};
        int[][] result = instance.getTetromino();
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testTetrominoNull() {
        Tetromino instance = new Tetromino(7);
        int[][] expResult = null;
        int[][] result = instance.getTetromino();
        assertArrayEquals(expResult, result);
    }

}
