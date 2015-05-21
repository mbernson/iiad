package nl.hsleiden.iiad.les2.mblinearlist;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MBListTest extends TestCase {

    private MBList<String> list;

    @Before
    public void setUp() throws Exception {
        list = new MBLinkedList<>();
//        list = new MBDoublyLinkedList<>();
    }

    @After
    public void tearDown() throws Exception {
        list = null;
    }

    @Test
    public void testAddReturnsTrue() throws Exception {
        assertTrue(list.add("Mathijs"));
        assertTrue(list.add("hoge school"));
    }

    @Test
    public void testSize() throws Exception {
        assertEquals(list.size(), 0);
        assertTrue(list.add("Mathijs"));
        assertEquals(list.size(), 1);
        assertTrue(list.add("Mathijs"));
        assertEquals(list.size(), 2);
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(list.isEmpty());
        list.add("Mathijs");
        assertFalse(list.isEmpty());
    }

    @Test
    public void testContains() throws Exception {

    }

    @Test
    public void testIterator() throws Exception {
        assertNotNull(list.iterator());
    }

    @Test
    public void testToArray() throws Exception {
    }

    @Test
    public void testRemove() throws Exception {

    }

    @Test
    public void testClear() throws Exception {
        list.add("Test");
        list.add("Foo");

        list.clear();
    }

    @Test
    public void testGet() throws Exception {
        assertNull(list.get(0));
        assertNull(list.get(1));

        list.add("Hoi");
        assertSame(list.get(0), "Hoi");
    }

    @Test
    public void testSet() throws Exception {

    }

    @Test
    public void testAdd1() throws Exception {

    }

    @Test
    public void testRemove1() throws Exception {

    }

    @Test
    public void testIndexOf() throws Exception {

    }

    @Test
    public void testLastIndexOf() throws Exception {

    }
}