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
     * Test of getTetromino method
     */
    @Test
    public void testGetTetromino() {
        Tetromino instance = new Tetromino(0);
        int[][] expResult = {{0, 0}, {0, 1}, {0, 2}, {0, -1}};
        int[][] result = instance.getTetromino();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getStyle method
     */
    @Test
    public void testGetStyle() {
        Tetromino instance = new Tetromino(0);
        int expResult = 0;
        int result = instance.getStyle();
        assertEquals(expResult, result);
    }
}
