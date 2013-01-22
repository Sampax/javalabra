
package gameLogic;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 *
 * @author SampaX
 */
public class BoardTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            
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
        System.setOut(new PrintStream(outContent));
    }
    
    @After
    public void tearDown() {
        System.setOut(null);
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
        instance.drawTetromino(piece, pointerX, pointerY);
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
        outContent.reset();
        Board instance = new Board();
        instance.printBoard();
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
                
        assertEquals(expResult, outContent.toString());
    }
}
