package iiad.les4;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mathijs on 16-6-2015.
 */
public class PostFixCalculatorTest extends TestCase {
    private PostFixCalculator calculator;

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @Test
    public void testBasicCalculations() throws Exception {
        calculator = new PostFixCalculator("1 1 + 2 -");
        assertEquals(calculator.getResult(), 0);

        calculator = new PostFixCalculator("3 4 5 + *");
        assertEquals(calculator.getResult(), 9 * 3);

        calculator = new PostFixCalculator("2 3 4 + +");
        assertEquals(calculator.getResult(), 9);

        calculator = new PostFixCalculator("8");
        assertEquals(calculator.getResult(), 8);
    }

    @Test
    public void testEmptyProgram() {
        calculator = new PostFixCalculator("");
        assertEquals(calculator.getResult(), 0);

        calculator = new PostFixCalculator("  ");
        assertEquals(calculator.getResult(), 0);

        calculator = new PostFixCalculator(" blah ");
        assertEquals(calculator.getResult(), 0);
    }

}