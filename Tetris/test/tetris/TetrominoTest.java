/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

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
     * Test of getTetromino method, of class Tetromino.
     */
    @Test
    public void testGetTetromino() {
        System.out.println("getTetromino");
        Tetromino instance = new Tetromino(0);
        int[][] expResult = {{0, 0}, {0, 1}, {0, 2}, {0, -1}};
        int[][] result = instance.getTetromino();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getStyle method, of class Tetromino.
     */
    @Test
    public void testGetStyle() {
        System.out.println("getStyle");
        Tetromino instance = new Tetromino(0);
        int expResult = 0;
        int result = instance.getStyle();
        assertEquals(expResult, result);
    }
}
