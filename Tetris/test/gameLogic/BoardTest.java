
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
     * Test of scrubTetromino method
     */
    @Test
    public void testScrubTetromino() {
        Tetromino piece = new Tetromino(0);
        Board instance = new Board();
        instance.drawTetromino(piece);
        instance.scrubTetromino(piece);
        int[][] expResult = {
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
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,9,9,9,9,9,9,9,9,9,9,9}
        };
        assertArrayEquals(expResult, instance.getBoard());
    }
    
    /**
     * Test of checkForSpace method when no space available
     */
    @Test
    public void testCheckForSpaceFalse1() {
       Tetromino piece= new Tetromino(1);
       Board instance = new Board();
       instance.setPy(3);
       instance.drawTetromino(piece);
       instance.setPy(1);
       instance.drawTetromino(piece);
       boolean result=instance.checkForSpace(piece, piece.getTetromino(), instance.getPx(), instance.getPy()+1);
       assertEquals(result, false);
    }

    /**
     * Test of checkForSpace method when hitting boundary
     */
    @Test
    public void testCheckForSpaceFalse2() {
       Tetromino piece= new Tetromino(0);
       Board instance = new Board();
       instance.setPx(1);
       instance.drawTetromino(piece);
       boolean result=instance.checkForSpace(piece, piece.getTetromino(), instance.getPx()-1, instance.getPy());
       assertEquals(result, false);
    }
    /*
     * Test of checkForSpace method when having space
     */
    @Test
    public void testCheckForSpaceTrue() {
       Tetromino piece= new Tetromino();
       Board instance = new Board();
       boolean result=instance.checkForSpace(piece, piece.getTetromino(), instance.getPx(), instance.getPy()+1);
       assertEquals(result, true);
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
