package iiad.les5.queue;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

/**
 * Created by mathijs on 16-6-2015.
 */
public class QueueTest extends TestCase {
    private Queue<String> queue;

    @Before
    public void setUp() throws Exception {
        queue = new ListQueue<>();
    }

    @After
    public void tearDown() throws Exception {
        queue = null;
    }

    @Test
    public void testEnqueueingAndDequeueing() throws Exception {
        assertNull(queue.dequeue());

        queue.enqueue("Foo");
        assertEquals(queue.dequeue(), "Foo");

        queue.enqueue("Foo");
        queue.enqueue("Bar");
        queue.enqueue("Baz");

        assertEquals(queue.dequeue(), "Foo");
        assertEquals(queue.dequeue(), "Bar");
        assertEquals(queue.dequeue(), "Baz");

        assertNull(queue.dequeue());
    }

    @Test
    public void testFront() throws Exception {
        assertNull(queue.front());

        queue.enqueue("Foo");
        assertEquals(queue.front(), "Foo");

        queue.enqueue("Bar");
        assertEquals(queue.front(), "Foo");

        queue.dequeue();
        assertEquals(queue.front(), "Bar");

        queue.dequeue();
        assertNull(queue.front());
    }

    @Test
    public void testSize() throws Exception {
        assertEquals(queue.size(), 0);
        queue.enqueue("Foo");
        assertEquals(queue.size(), 1);
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(queue.isEmpty());
        queue.enqueue("Foo");
        assertFalse(queue.isEmpty());
    }
}