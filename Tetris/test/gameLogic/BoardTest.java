
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
     * Test of markTetromino method
     */
    @Test
    public void testDrawTetromino() {
        Board instance = new Board();
        Board.piece = new Tetromino(0);
        instance.markTetromino();
        int[][] expResult = {
            {9,0,0,0,1,0,0,0,0,0,0,9},
            {9,0,0,0,1,0,0,0,0,0,0,9},
            {9,0,0,0,1,0,0,0,0,0,0,9},
            {9,0,0,0,1,0,0,0,0,0,0,9},
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
        System.out.println(instance.printBoard());
        assertArrayEquals(expResult, instance.getBoard());
    }

    /**
     * Test of scrubTetromino method
     */
    @Test
    public void testScrubTetromino() {
        Board instance = new Board();
        instance.markTetromino();
        instance.scrubTetromino();
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
       Board instance = new Board();
       Board.piece = new Tetromino(1);
       instance.setPy(3);
       instance.markTetromino();
       instance.setPy(1);
       instance.markTetromino();
       boolean result=instance.checkForSpace(Board.piece.getTetromino(), instance.getPx(), instance.getPy()+1);
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
       instance.markTetromino();
       boolean result=instance.checkForSpace(piece.getTetromino(), instance.getPx()-1, instance.getPy());
       assertEquals(result, false);
    }
    /*
     * Test of checkForSpace method when having space
     */
    @Test
    public void testCheckForSpaceTrue() {
       Tetromino piece= new Tetromino();
       Board instance = new Board();
       boolean result=instance.checkForSpace(piece.getTetromino(), instance.getPx(), instance.getPy()+1);
       assertEquals(result, true);
    }  
    
    /*
     * Test of correct return on moveDown method when space available
     */
    @Test
    public void testMoveDown1() {
       Board instance = new Board();
       Board.piece= new Tetromino(0);
       instance.markTetromino();
       int[][] expResult = {
            {9,0,0,0,0,0,0,0,0,0,0,9},
            {9,0,0,0,1,0,0,0,0,0,0,9},
            {9,0,0,0,1,0,0,0,0,0,0,9},
            {9,0,0,0,1,0,0,0,0,0,0,9},
            {9,0,0,0,1,0,0,0,0,0,0,9},
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

       Board.piece=instance.moveDown();
       assertArrayEquals(expResult,instance.getBoard());
    }

    /*
     * Test of correct return on moveLeft method when space available
     */
    @Test
    public void testMoveLeft1() {
       Board instance = new Board();
       Board.piece= new Tetromino(0);
       instance.markTetromino();
       int[][] expResult = {
            {9,0,0,1,0,0,0,0,0,0,0,9},
            {9,0,0,1,0,0,0,0,0,0,0,9},
            {9,0,0,1,0,0,0,0,0,0,0,9},
            {9,0,0,1,0,0,0,0,0,0,0,9},
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

       Board.piece=instance.moveLeft();
       assertArrayEquals(expResult,instance.getBoard());
    }

        /*
     * Test of correct return on moveLeft method when space no longer available
     */
    @Test
    public void testMoveLeft2() {
       Board instance = new Board();
       Board.piece= new Tetromino(0);
       instance.markTetromino();
       int[][] expResult = {
            {9,1,0,0,0,0,0,0,0,0,0,9},
            {9,1,0,0,0,0,0,0,0,0,0,9},
            {9,1,0,0,0,0,0,0,0,0,0,9},
            {9,1,0,0,0,0,0,0,0,0,0,9},
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

       for(int i=0;i<5;i++)
           Board.piece=instance.moveLeft();
       assertArrayEquals(expResult,instance.getBoard());
    }
    
    /*
     * Test of correct return on moveRight method when space available
     */
    @Test
    public void testMoveRight1() {
       Board instance = new Board();
       Board.piece= new Tetromino(0);
       instance.markTetromino();
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

       Board.piece=instance.moveRight();
       assertArrayEquals(expResult,instance.getBoard());
    }
    
    /*
     * Test of correct return on moveRight method when space no longer available
     */
    @Test
    public void testMoveRight2() {
       Board instance = new Board();
       Board.piece= new Tetromino(0);
       instance.markTetromino();
       int[][] expResult = {
            {9,0,0,0,0,0,0,0,0,0,1,9},
            {9,0,0,0,0,0,0,0,0,0,1,9},
            {9,0,0,0,0,0,0,0,0,0,1,9},
            {9,0,0,0,0,0,0,0,0,0,1,9},
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
       for(int i=0;i<8;i++)
            Board.piece=instance.moveRight();
       assertArrayEquals(expResult,instance.getBoard());
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
