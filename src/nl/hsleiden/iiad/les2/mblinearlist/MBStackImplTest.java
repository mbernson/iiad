package nl.hsleiden.iiad.les2.mblinearlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MBStackImplTest {
    private MBStack<String> stack;

    @Before
    public void setUp() {
        stack = new MBStackImpl<>();
    }

    @After
    public void tearDown() {
        stack = null;
    }

    @Test
    public void testPushingAndPopping() {
        stack.push("Mathijs");
        stack.push("Reyer");

        assertEquals(stack.pop(), "Reyer");
        assertEquals(stack.pop(), "Mathijs");
        assertNull(stack.pop());
    }

    @Test
    public void testPeek() {
        assertNull(stack.peek());
        stack.push("Mathijs");
        assertEquals(stack.peek(), "Mathijs");
        assertEquals(stack.peek(), "Mathijs");
    }

    @Test
    public void testSize() {
        assertEquals(stack.size(), 0);
        stack.push("Mathijs");
        assertEquals(stack.size(), 1);
        stack.push("Reyer");
        assertEquals(stack.size(), 2);
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push("Reyer");
        assertFalse(stack.isEmpty());
    }
}