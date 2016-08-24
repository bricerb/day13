package tiy.pink;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Brice on 8/24/16.
 */
public class ChocolateSolverTest {
    ChocolateSolver solver;

    @Before
    public void setUp() throws Exception {
        solver = new ChocolateSolver();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testEnoughSmallsNoBigs() throws Exception {
        int numSmalls = solver.makeChocolate(12,0,7);
        assertEquals(7, numSmalls);
    }

    @Test
    public void testEnoughBigsNoSmalls() throws Exception{
        int numSmalls = solver.makeChocolate(0,2,10);
        assertEquals(0,numSmalls);
    }

    @Test
    public void noBigsNoSmalls() throws Exception{
        int numSmalls = solver.makeChocolate(0,0,1);
        assertEquals(1,numSmalls);
    }

    @Test
    public void enoughBigsEnoughSmalls() throws Exception{
        int numSmalls = solver.makeChocolate(3,1,8);
        assertEquals(8,numSmalls);
    }

    @Test
    public void negBigs() throws Exception{
        int numSmalls = solver.makeChocolate(4,-1,6);
        assertEquals(6,numSmalls);
    }

    @Test
    public void negSmalls() throws Exception{
        int numSmalls = solver.makeChocolate(-2,2,15);
        assertEquals(15,numSmalls);
    }

    @Test
    public void moreBigsThanNeeded() throws Exception{
        int numSmalls = solver.makeChocolate(3,6,20);
        assertEquals(20,numSmalls);
    }

    @Test
    public void moreSmallsThanNeeded() throws Exception{
        int numSmalls = solver.makeChocolate(12,0,7);
        assertEquals(7,numSmalls);
    }


}