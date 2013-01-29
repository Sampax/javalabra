
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
public class BoardTest {
    

            
    public BoardTest() {
        
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
     * Test of getBoard method
     */
    @Test
    public void testGetBoard() {
        Board instance = new Board();
        int [][] expResult =
            {{9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,9,9,9,9,9,9,9,9,9,9,9}};
        int[][] result = instance.getBoard();
        assertArrayEquals(expResult, result);
    }


    /**
     * Test of drawTetromino method
     */
    @Test
    public void testDrawTetromino() {
        Tetromino piece = new Tetromino(0);
        int pointerX = 5;
        int pointerY = 1;
        Board instance = new Board();
        instance.drawTetromino(piece);
        int[][] expResult = {
            {9,0,0,0,0,1,0,0,0,0,0,9},
            {9,0,0,0,0,1,0,0,0,0,0,9},
            {9,0,0,0,0,1,0,0,0,0,0,9},
            {9,0,0,0,0,1,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,9,9,9,9,9,9,9,9,9,9,9}
        };
        assertArrayEquals(expResult, instance.getBoard());
    }

    /**
     * Test of printBoard method
     */
    @Test
    public void testPrintBoard() {

        Board instance = new Board();
        String result=instance.printBoard();
        String expResult =
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n"+
                "0000000000\n";
                
        assertEquals(expResult, result);
    }
}
